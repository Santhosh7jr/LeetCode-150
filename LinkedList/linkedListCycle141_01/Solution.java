package LinkedList.linkedListCycle141_01;
import java.util.*;

class LinkedList{

    public static class ListNode{

        int val;
        ListNode next;

        public ListNode(int val){
            this.val=val;
        }

    }

    ListNode head;

    public ListNode insertIntoList(int[] arr){
        if(arr.length==0) return head;

        ListNode temp=null;

        for (int i=arr.length-1;i>=0;i--){
            ListNode temp2=new ListNode(arr[i]);

            temp2.next=temp;
            temp=temp2;

        }

        head=temp;
        return head;

    }

}

class TestCase{

    LinkedList.ListNode head;

    public TestCase(LinkedList.ListNode head){

        this.head=head;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();
        LinkedList.ListNode head1 = linkedList1.insertIntoList(new int[] {3,2,0,-4});

        // generating cycle for head1
        LinkedList.ListNode temp=head1;
        while (temp.next!=null) temp=temp.next;
        temp.next=head1.next;


        LinkedList linkedList2 = new LinkedList();
        LinkedList.ListNode head2 = linkedList1.insertIntoList(new int[] {1,2});

        //generating cycle for head2
        head2.next.next=head2;


        LinkedList linkedList3 = new LinkedList();
        LinkedList.ListNode head3 = linkedList1.insertIntoList(new int[] {1});


        TestCase testCase1=new TestCase(head1);
        TestCase testCase2=new TestCase(head2);
        TestCase testCase3=new TestCase(head3);

        System.out.println("TestCase1 result: "+hasCycle(testCase1.head));
        System.out.println("TestCase2 result: "+hasCycle(testCase2.head));
        System.out.println("TestCase3 result: "+hasCycle(testCase3.head));

    }

    public static boolean hasCycle(LinkedList.ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        LinkedList.ListNode slow = head;
        LinkedList.ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

}
