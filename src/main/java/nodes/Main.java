package nodes;

import static nodes.ListNode.addTwoNumbers;

/**
 * Homework #2
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and
 * each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Definition for singly-linked list:
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * }
 * }
 * <p>
 * public ListNode addTwoNumbers(ListNode l1, ListNode l2) { }
 */
public class Main {
    public static void main(String[] args) {
        ListNode listOne = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        ListNode listTwo = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        System.out.print(" The list one: ");listOne.printlnMe();
        System.out.print(" The list two: ");listTwo.printlnMe();
        listOne.addLast(5,listTwo);
        System.out.print(" The list insertion: ");listOne.printlnMe();
        listOne = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        System.out.print(" The list one: ");listOne.printlnMe();
        System.out.print(" The list two: ");listTwo.printlnMe();
        System.out.print(" The list sum: ");addTwoNumbers(listOne,listTwo).printlnMe();
        System.out.println();
    }


}
