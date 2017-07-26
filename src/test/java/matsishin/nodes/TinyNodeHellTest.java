package matsishin.nodes;

import org.junit.Test;

import static matsishin.nodes.TinyNodeHell.*;
import static org.junit.Assert.*;

public class TinyNodeHellTest {

    @Test
    public void nodeEqualsTest() {
        ListNode nodeOne = buildListNode(8, 9, 7);
        ListNode tail= new ListNode(7);
        ListNode midle= new ListNode(9);midle.next=tail;
        ListNode head= new ListNode(8);head.next=midle;
        assertTrue(TinyNodeHell.areEqual(nodeOne, head));
    }

    @Test
    public void addingTest() {
        ListNode listOne = buildListNode(2, 4, 3);
        ListNode listTwo = buildListNode(5, 6, 4);
        ListNode expectedList = buildListNode(7, 0, 8);
        ListNode result = addTwoNumbers(listOne, listTwo);
        assertTrue(TinyNodeHell.areEqual(expectedList, result));
    }

    @Test
    public void addingSneaky() {
        ListNode listOne = buildListNode(5, 9, 9, 9);
        ListNode listTwo = buildListNode(5);
        ListNode expectedList = buildListNode(0, 0, 0, 0, 1);
        ListNode result = addTwoNumbers(listOne, listTwo);
        assertTrue(TinyNodeHell.areEqual(expectedList, result));
    }
}