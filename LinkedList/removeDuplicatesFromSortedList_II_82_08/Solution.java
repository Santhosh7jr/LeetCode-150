package LinkedList.removeDuplicatesFromSortedList_II_82_08;
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

    public TestCase(LinkedList.ListNode head) {

        this.head = head;

    }

}

public class Solution {

    public static void main(String[] args) {

        LinkedList linkedList1=new LinkedList();
        LinkedList linkedList2=new LinkedList();

        LinkedList.ListNode head1=linkedList1.insertIntoList(new int[] {1,2,3,3,4,4,5});
        LinkedList.ListNode head2=linkedList2.insertIntoList(new int[] {1,1,1,2,3});

        TestCase testCase1=new TestCase(head1);
        TestCase testCase2=new TestCase(head2);

        LinkedList.ListNode result1=deleteDuplicates(testCase1.head);
        LinkedList.ListNode result2=deleteDuplicates(testCase2.head);

        System.out.println("TestCase1 result: "+linkedList1.traverseList(result1));
        System.out.println("TestCase2 result: "+linkedList2.traverseList(result2));

    }

    public static LinkedList.ListNode deleteDuplicates(LinkedList.ListNode head) {

        if(head==null || head.next==null) return head;

        HashMap<Integer,Integer> map=new HashMap<>();

        List<Integer> list=new ArrayList<>();

        putIntoMap(head,map);

        addIntoList(map,list);

        if(list.size()==0) return null;

        Collections.sort(list);

        return updateListNodes(head,list);

    }

    public static void putIntoMap(LinkedList.ListNode head,HashMap<Integer,Integer> map){
        LinkedList.ListNode temp=head;

        while(temp!=null){
            int data=temp.val;
            if(!map.containsKey(data)) map.put(data,1);
            else map.put(data,map.get(data)+1);

            temp=temp.next;
        }
    }

    public static void addIntoList(HashMap<Integer,Integer> map,List<Integer> list){
        for(int key:map.keySet()){
            if(map.get(key)==1) list.add(key);
        }
    }

    public static LinkedList.ListNode updateListNodes(LinkedList.ListNode head,List<Integer> list){
        LinkedList.ListNode temp=head;

        for(int i=0;i<list.size();i++){
            temp.val=list.get(i);

            if(i==list.size()-1){
                temp.next=null;
                break;
            }

            temp=temp.next;
        }
        return head;
    }

}
