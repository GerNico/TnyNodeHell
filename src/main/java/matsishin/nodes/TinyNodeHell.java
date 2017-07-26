package matsishin.nodes;

import java.util.ArrayList;

class TinyNodeHell {
    private final static int maxVal = 10;

    static ListNode buildListNode(int... ints) {
        ArrayList<Integer> integers = new ArrayList<>(ints.length);
        for (int i : ints) {
            integers.add(i);
        }
        return ListNodeRecursion(integers, null);

    }

    private static ListNode ListNodeRecursion(ArrayList<Integer> ints, ListNode myNode) {
        if (ints.size() > 0 && myNode == null) {
            ListNode answer = new ListNode(ints.get(ints.size() - 1));
            ints.remove(ints.size() - 1);
            return ListNodeRecursion(ints, answer);
        } else if (ints.size() > 0) {
            ListNode answer = new ListNode(ints.get(ints.size() - 1));
            answer.next = myNode;
            ints.remove(ints.size() - 1);
            return ListNodeRecursion(ints, answer);
        } else if (myNode != null) return myNode;
        throw new NodeHellException("Empty node and there is no number");

    }

    static boolean areEqual(ListNode node1, ListNode node2) {
        while (true) {
            if (node1 == null && node2 == null) return true;
            if (node1 == null || node2 == null) return false;
            if (node1.val != node2.val) return false;
            node1 = node1.next;
            node2 = node2.next;
        }
    }

    private static void addLast(int n, ListNode node) {
        ListNode last;
        if (node.next == null) {
            last = new ListNode(n);
            node.next = last;
        } else {
            last = node.next;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new ListNode(n);
        }
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            throw new NodeHellException("both lists are empty");
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int valDiv = 0, valMod;
        ListNode result=null;
        do {
            if (l1 != null && l2 != null) {
                valMod = (l1.val + l2.val + valDiv) % maxVal;
                valDiv = (l1.val + l2.val + valDiv) / maxVal;
                l1 = l1.next;
                l2 = l2.next;
                if (result == null) {
                    result = new ListNode(valMod);
                } else {
                    addLast(valMod, result);
                }
            }
            if (l1 != null && l2 == null) {
                valMod = (l1.val + valDiv) % maxVal;
                valDiv = (l1.val + valDiv) / maxVal;
                l1 = l1.next;
                addLast(valMod, result);
            }
            if (l1 == null && l2 != null) {
                valMod = (l2.val + valDiv) % maxVal;
                valDiv = (l2.val + valDiv) / maxVal;
                l2 = l2.next;
                addLast(valMod, result);
            }
            if (l1 == null && l2 == null) {
                if (valDiv != 0) addLast(valDiv, result);
                valDiv=0;
            }
        } while (!(l1 == null && l2 == null));
        return result;
    }
}
