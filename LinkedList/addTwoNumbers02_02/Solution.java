package LinkedList.addTwoNumbers02_02;
import java.util.*;

class LinkedList{

    public static class ListNode{

        int val;
        ListNode next;

        public ListNode() { }

        public ListNode(int val){
            this.val=val;
        }

    }

    ListNode l1;
    ListNode l2;

    public ListNode insertIntoL1(int[] arr){
        if(arr.length==0) return l1;

        ListNode temp=null;

        for (int i=arr.length-1;i>=0;i--){
            ListNode temp2=new ListNode(arr[i]);

            temp2.next=temp;
            temp=temp2;

        }

        l1=temp;
        return l1;

    }

    public ListNode insertIntoL2(int[] arr){
        if(arr.length==0) return l2;

        ListNode temp=null;

        for (int i=arr.length-1;i>=0;i--){
            ListNode temp2=new ListNode(arr[i]);

            temp2.next=temp;
            temp=temp2;

        }

        l2=temp;
        return l2;

    }

    public static List<Integer> getNodes(ListNode node) {

        List<Integer> list = new ArrayList<>();

        ListNode temp = node;

        while (temp != null) {

            list.add(temp.val);
            temp = temp.next;

        }

        return list;

    }

}

class TestCase {

    LinkedList.ListNode l1;
    LinkedList.ListNode l2;

    public TestCase(LinkedList object) {

        this.l1 = object.l1;
        this.l2 = object.l2;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1 = new LinkedList();
        linkedList1.insertIntoL1(new int[] {2,4,3});
        linkedList1.insertIntoL2(new int[] {5,6,4});

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertIntoL1(new int[] {0});
        linkedList2.insertIntoL2(new int[] {0});

        LinkedList linkedList3 = new LinkedList();
        linkedList3.insertIntoL1(new int[] {9,9,9,9,9,9,9});
        linkedList3.insertIntoL2(new int[] {9,9,9,9});


        TestCase testCase1 = new TestCase(linkedList1);
        TestCase testCase2 = new TestCase(linkedList2);
        TestCase testCase3 = new TestCase(linkedList3);

        LinkedList.ListNode result1 = addTwoNumbers(testCase1.l1,testCase1.l2);
        LinkedList.ListNode result2 = addTwoNumbers(testCase2.l1,testCase2.l2);
        LinkedList.ListNode result3 = addTwoNumbers(testCase3.l1,testCase3.l2);

        System.out.println("TestCase1 Result: " + LinkedList.getNodes(result1));
        System.out.println("TestCase2 Result: " + LinkedList.getNodes(result2));
        System.out.println("TestCase3 Result: " + LinkedList.getNodes(result3));

    }

    public static LinkedList.ListNode addTwoNumbers(LinkedList.ListNode l1, LinkedList.ListNode l2) {

        LinkedList.ListNode node=new LinkedList.ListNode();
        int rem=0;

        LinkedList.ListNode temp=node;

        while(l1!=null && l2!=null){

            int sum=l1.val+l2.val+rem;

            if(sum>=10) temp.val=(sum%10);
            else temp.val=sum;

            rem=sum/10;

            l1=l1.next;
            l2=l2.next;

            if(l1!=null && l2!=null){
                temp.next=new LinkedList.ListNode();
                temp=temp.next;
            }
        }

        if(rem==0){
            temp.next = (l1!=null) ? l1 : l2 ;
            return node;
        }

        LinkedList.ListNode newNode= (l1!=null) ? l1 : l2 ;

        while(newNode!=null){

            int sum=newNode.val+rem;

            temp.next=new LinkedList.ListNode();
            temp=temp.next;

            if(sum>=10) temp.val=sum%10;
            else temp.val=sum;

            rem=sum/10;

            newNode=newNode.next;

        }

        if(rem!=0) temp.next=new LinkedList.ListNode(rem);

        return node;

    }

}
