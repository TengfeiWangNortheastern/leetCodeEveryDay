package EasyProblems.Week1.MergeTwoSortedLists21;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class test {
    public static void main(String[] args) {
        ListNode l1=null;
        ListNode l2=null;
        mergeTwoLists(l1,l2);
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(-1);
        head.next=null;
        ListNode p=head;
        ListNode newNode;
        while(l1!=null&&l2!=null){
            newNode=new ListNode();
            newNode.next=null;
            if(l1.val<l2.val){
                newNode.val=l1.val;
                p.next=newNode;
                l1=l1.next;
            }
            else{
                newNode.val=l2.val;
                p.next=newNode;
                l2=l2.next;
            }
            p=p.next;
        }
        while (l1!=null){
            newNode=new ListNode();
            newNode.val=l1.val;
            newNode.next=null;
            l1=l1.next;
            p.next=newNode;
            p=p.next;
        }
        while (l2!=null){
            newNode=new ListNode();
            newNode.val=l2.val;
            newNode.next=null;
            l2=l2.next;
            p.next=newNode;
            p=p.next;
        }
        return head.next;
    }
}
