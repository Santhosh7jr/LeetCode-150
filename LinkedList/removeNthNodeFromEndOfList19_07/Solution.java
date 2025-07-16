package LinkedList.removeNthNodeFromEndOfList19_07;
import java.util.*;

class LinkedList{

    public static class ListNode{

        int val;
        ListNode next;

        public ListNode(){

        }

        public ListNode(int val){
            this.val=val;
        }

    }

    ListNode head;

    public LinkedList.ListNode insertIntoList(int[] arr){
        if(arr.length==0) return head;

        LinkedList.ListNode temp=null;

        for (int i=arr.length-1;i>=0;i--){
            LinkedList.ListNode temp2=new LinkedList.ListNode(arr[i]);

            temp2.next=temp;
            temp=temp2;

        }

        head=temp;
        return head;

    }

    public List<Integer> traverseList(LinkedList.ListNode node){

        List<Integer> list = new ArrayList<>();
        if(node==null) return list;

        while (node !=null){
            list.add(node.val);
            node=node.next;
        }

        return list;

    }

}

class TestCase {

    LinkedList.ListNode head;
    int n;

    public TestCase(LinkedList.ListNode head, int n) {

        this.head = head;
        this.n=n;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();
        LinkedList linkedList3=new LinkedList();

        LinkedList.ListNode head1=linkedList1.insertIntoList(new int[] {1,2,3,4,5});
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {1});
        LinkedList.ListNode head3=linkedList2.insertIntoList(new int[] {1,2});

        TestCase testCase1=new TestCase(head1,2);
        TestCase testCase2=new TestCase(head2,1);
        TestCase testCase3=new TestCase(head3,1);

        LinkedList.ListNode result1=removeNthFromEnd(testCase1.head,testCase1.n);
        LinkedList.ListNode result2=removeNthFromEnd(testCase2.head,testCase2.n);
        LinkedList.ListNode result3=removeNthFromEnd(testCase3.head,testCase3.n);

        System.out.println("TestCase1 result: "+linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: "+linkedList2.traverseList(result2));
        System.out.println("TestCase3 result: "+linkedList3.traverseList(result3));

    }

    public static LinkedList.ListNode removeNthFromEnd(LinkedList.ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }

        int sz=0;
        LinkedList.ListNode cn=head;
        while(cn!=null){
            sz++;
            cn=cn.next;
        }

        cn=head;

        if(sz-n==0){
            head=head.next;
        }

        for(int i=1;i<sz-n;i++){
            cn=cn.next;
        }
        cn.next=cn.next.next;

        return head;
    }

}
