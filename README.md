# july14_2025
The problem that i solved today in leetcode

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

Return the decimal value of the number in the linked list.

The most significant bit is at the head of the linked list.

Code:
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        while(head!=null)
        {
            sb.insert(0,(char)(head.val+48));
            head=head.next;
        }
        int res=0;
        int x=1;
        for(int i=0;i<sb.length();i++)
        {
            int a=sb.charAt(i)-'0';
            res+=a*x;
            x*=2;
        }
        return res;
    }
}
