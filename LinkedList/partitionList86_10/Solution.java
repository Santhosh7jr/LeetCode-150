package LinkedList.partitionList86_10;
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

    public List<Integer> traverseList(ListNode node){

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
    int x;

    public TestCase(LinkedList.ListNode head, int x) {

        this.head = head;
        this.x=x;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();

        LinkedList.ListNode head1=linkedList1.insertIntoList(new int[] {1,4,3,2,5,2});
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {2,1});

        TestCase testCase1=new TestCase(head1,3);
        TestCase testCase2=new TestCase(head2,2);

        LinkedList.ListNode result1=partition(testCase1.head,testCase1.x);
        LinkedList.ListNode result2=partition(testCase2.head,testCase2.x);

        System.out.println("TestCase1 result: "+linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: "+linkedList2.traverseList(result2));

    }

    public static LinkedList.ListNode partition(LinkedList.ListNode head, int x) {
        LinkedList.ListNode lesser=new LinkedList.ListNode();
        LinkedList.ListNode greater=new LinkedList.ListNode();

        LinkedList.ListNode node=head;
        LinkedList.ListNode t1=lesser;
        LinkedList.ListNode t2=greater;

        while(node!=null){
            if(node.val<x){
                t1.next=new LinkedList.ListNode(node.val);
                t1=t1.next;
            }else{
                t2.next=new LinkedList.ListNode(node.val);
                t2=t2.next;
            }
            node=node.next;
        }
        t1.next=greater.next;
        return lesser.next;
    }

}
