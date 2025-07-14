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