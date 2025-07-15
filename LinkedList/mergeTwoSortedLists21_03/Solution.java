package LinkedList.mergeTwoSortedLists21_03;
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

    LinkedList.ListNode head;

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

    LinkedList.ListNode list1;
    LinkedList.ListNode list2;

    public TestCase(LinkedList.ListNode list1,LinkedList.ListNode list2) {

        this.list1 = list1;
        this.list2=list2;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList listA1 = new LinkedList();
        LinkedList listA2 = new LinkedList();
        LinkedList listB1 = new LinkedList();
        LinkedList listB2 = new LinkedList();
        LinkedList listC1 = new LinkedList();
        LinkedList listC2 = new LinkedList();

        TestCase testCase1 = new TestCase(
                listA1.insertIntoList(new int[]{1, 2, 4}),
                listA2.insertIntoList(new int[]{1, 3, 4})
        );

        TestCase testCase2 = new TestCase(
                listB1.insertIntoList(new int[]{}),
                listB2.insertIntoList(new int[]{})
        );

        TestCase testCase3 = new TestCase(
                listC1.insertIntoList(new int[]{}),
                listC2.insertIntoList(new int[]{0})
        );

        LinkedList resultPrinter = new LinkedList();

        LinkedList.ListNode result1 = mergeTwoLists(testCase1.list1, testCase1.list2);
        LinkedList.ListNode result2 = mergeTwoLists(testCase2.list1, testCase2.list2);
        LinkedList.ListNode result3 = mergeTwoLists(testCase3.list1, testCase3.list2);

        System.out.println("TestCase1 result: " + resultPrinter.traverseList(result1));
        System.out.println("TestCase2 result: " + resultPrinter.traverseList(result2));
        System.out.println("TestCase3 result: " + resultPrinter.traverseList(result3));
    }

    public static LinkedList.ListNode mergeTwoLists(LinkedList.ListNode list1, LinkedList.ListNode list2) {
        if (list1 == null && list2 == null) return null;
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        LinkedList.ListNode ans = new LinkedList.ListNode();
        LinkedList.ListNode tail = ans;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        tail.next = (list1 != null) ? list1 : list2;
        return ans.next;
    }
}

