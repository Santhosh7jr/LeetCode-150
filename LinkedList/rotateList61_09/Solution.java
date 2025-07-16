package LinkedList.rotateList61_09;
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
    int k;

    public TestCase(LinkedList.ListNode head, int k) {

        this.head = head;
        this.k=k;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();

        LinkedList.ListNode head1=linkedList1.insertIntoList(new int[] {1,2,3,4,5});
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {0,1,2});

        TestCase testCase1=new TestCase(head1,2);
        TestCase testCase2=new TestCase(head2,4);

        LinkedList.ListNode result1=rotateRight(testCase1.head,testCase1.k);
        LinkedList.ListNode result2=rotateRight(testCase2.head,testCase2.k);

        System.out.println("TestCase1 result: "+linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: "+linkedList2.traverseList(result2));

    }

    public static LinkedList.ListNode rotateRight(LinkedList.ListNode head, int k) {
        if(k<1 || head==null || head.next==null){
            return head;
        }

        int size=1;
        LinkedList.ListNode temp=head;

        while(temp.next!=null){
            size++;
            temp=temp.next;
        }
        temp.next=head;

        int rotations=k%size;
        int skip=size-rotations;

        LinkedList.ListNode node=head;

        for(int i=0;i<skip-1;i++){
            node=node.next;
        }
        head=node.next;
        node.next=null;

        return head;

    }

}
