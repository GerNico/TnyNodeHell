# Tiny hell of nodes
-----

 You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and
 each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 
 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 
 Output: 7 -> 0 -> 8
 
 Example for singly-linked list:
 ```
 public class ListNode {
 int val;
 ListNode next;
 ListNode(int x) {
 val = x;}
 }
 ```
 You need to implement method:
 public ListNode addTwoNumbers(ListNode l1, ListNode l2) { }
 
 Solution
 ---------
 
My solution contains two classes Main and ListNode. ListNode class contains the solution namely and Main class just use ListNode to test it.
ListNode class contains:
* ListNode structure and its constructor
* method addLast, it allows inserting an element at the end of the list
* method printlnMe, it's method for list printing
* method addTwoNumbers(ListNode l1, ListNode l2), that was required.
