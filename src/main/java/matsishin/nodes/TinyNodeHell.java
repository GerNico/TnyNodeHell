package matsishin.nodes;

class TinyNodeHell {

    static ListNode buildListNode(int... ints) {
        if (ints.length == 0) {
            System.out.println("your list will be empty");
            return null;
        }
        ListNode answer = new ListNode(ints[0]);
        for (int i = 1; i < ints.length; i++) {
            addLast(ints[i], answer);
        }
        return answer;

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

    static void addLast(int n, ListNode node) {
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

    static void printlnNode(ListNode node) {
        int i = 1;
        do {
            System.out.print("V" + i + "=" + node.val);
            if (node.next != null) System.out.print(" --> ");
            i++;
            node = node.next;
        } while (node != null);
        System.out.println();
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        final int maxVal = 10;
        if (l1 == null && l2 == null) {
            System.out.print("both lists are empty");
            return null;
        }
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        int valDiv = 0, valMod = 0;
        ListNode result = null;
        do {
            if (l1 != null && l2 != null) {
                valMod = (l1.val + l2.val + valDiv) % maxVal;
                valDiv = (l1.val + l2.val + valDiv) / maxVal;

                if (result == null) {
                    result = new ListNode(valMod);
                } else {
                    addLast(valMod, result);
                }

                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1 != null && l2 == null) {
                valMod = (l1.val + valDiv) % maxVal;
                valDiv = (l1.val + valDiv) / maxVal;
                addLast(valMod, result);
                l1 = l1.next;
            }
            if (l1 == null && l2 != null) {
                valMod = (l2.val + valDiv) % maxVal;
                valDiv = (l2.val + valDiv) / maxVal;
                addLast(valMod, result);
                l2 = l2.next;
            }
            if (l1 == null && l2 == null) {
                if (valDiv != 0) addLast(valMod, result);
                break;
            }
        } while (true);
        return result;
    }
}
