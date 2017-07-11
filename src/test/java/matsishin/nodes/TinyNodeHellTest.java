package matsishin.nodes;

import org.junit.Test;

import static matsishin.nodes.TinyNodeHell.*;
import static org.junit.Assert.*;

public class TinyNodeHellTest {

    @Test
    public void nodeEqualsTest() {
        ListNode nodeOne = buildListNode(8, 9, 7);
        ListNode nodeTwo = buildListNode(8, 9, 7);
        assertTrue(TinyNodeHell.areEqual(nodeOne, nodeTwo));
    }

    @Test
    public void insertTest() {
        ListNode listNode = buildListNode(2, 4, 3);
        addLast(9, listNode);
        ListNode expectedList = buildListNode(2, 4, 3, 9);
        assertTrue(TinyNodeHell.areEqual(listNode, expectedList));
    }

    @Test
    public void addingTest() {
        ListNode listOne = buildListNode(2, 4, 3);
        ListNode listTwo = buildListNode(5, 6, 4);
        ListNode expectedList = buildListNode(7, 0, 8);
        ListNode result = addTwoNumbers(listOne, listTwo);
        assertTrue(TinyNodeHell.areEqual(expectedList, result));
    }
}