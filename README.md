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
 My solution contains two classes TinyNodeHell and ListNode. ListNode class is a pitiful class from the task. 
 The other class is created in order to overcome problems made by ListNode. Moreover, TinyNodeHell allows to: 
 * easily construct list ```static ListNode buildListNode(int... ints)```
 * insert number in the end of list ```static void addLast(int n, ListNode node)```
 * print the list ```static void printlnNode(ListNode node)```
 * add lists according to the task ```static ListNode addTwoNumbers(ListNode l1, ListNode l2)```
 * check are the lists equal ```static boolean areEqual(ListNode node1, ListNode node2)```