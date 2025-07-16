package LinkedList.reverseLinkedList_II_92_05;
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
    int left;
    int right;

    public TestCase(LinkedList.ListNode head, int left,int right) {

        this.head = head;
        this.left=left;
        this.right=right;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();

        LinkedList.ListNode head1=linkedList1.insertIntoList(new int[] {1,2,3,4,5});
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {5});

        TestCase testCase1=new TestCase(head1,2,4);
        TestCase testCase2=new TestCase(head2,1,1);

        LinkedList.ListNode result1=reverseBetween(testCase1.head,testCase1.left,testCase1.right);
        LinkedList.ListNode result2=reverseBetween(testCase2.head,testCase2.left,testCase2.right);

        System.out.println("TestCase1 result: " + linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: " + linkedList2.traverseList(result2));

    }

    public static LinkedList.ListNode reverseBetween(LinkedList.ListNode head, int left, int right) {
        if(head==null){
            return head;
        }

        if(left==right) return head;

        LinkedList.ListNode curr=head;
        LinkedList.ListNode prev=null;

        for(int i=1;curr!=null && i<left;i++){
            prev=curr;
            curr=curr.next;
        }

        LinkedList.ListNode temp1=curr;
        LinkedList.ListNode temp2=prev;

        for(int i=0;curr!=null && i<right-left+1;i++){
            LinkedList.ListNode nextNode=curr.next;

            curr.next=prev;
            prev=curr;
            curr=nextNode;

            if(nextNode!=null) nextNode=nextNode.next;
        }

        if(temp2!=null) temp2.next=prev;
        else head=prev;

        temp1.next=curr;
        return head;
    }

}
