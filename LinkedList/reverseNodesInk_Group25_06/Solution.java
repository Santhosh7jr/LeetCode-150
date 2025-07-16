package LinkedList.reverseNodesInk_Group25_06;
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
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {1,2,3,4,5});

        TestCase testCase1=new TestCase(head1,2);
        TestCase testCase2=new TestCase(head2,3);

        LinkedList.ListNode result1=reverseKGroup(testCase1.head,testCase1.k);
        LinkedList.ListNode result2=reverseKGroup(testCase2.head,testCase2.k);

        System.out.println("TestCase1 result: "+linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: "+linkedList2.traverseList(result2));

    }

    public static LinkedList.ListNode reverseKGroup(LinkedList.ListNode head, int k) {
        List<Integer> list=new ArrayList<>();

        LinkedList.ListNode node=head;

        while(node!=null){
            list.add(node.val);
            node=node.next;
        }

        int l=0;
        int r=k-1;

        while(r<list.size()){
            reverse(list,l,r);
            l=r+1;
            r+=k;
        }

        node=head;
        int idx=0;

        while(node!=null){
            node.val=list.get(idx++);
            node=node.next;
        }
        return head;
    }

    public static void reverse(List<Integer> list,int l,int r){
        while(l<r){
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);

            l++;
            r--;
        }
    }

}
