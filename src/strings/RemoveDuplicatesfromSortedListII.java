package strings;

public class RemoveDuplicatesfromSortedListII {

    public RandomListNode copyRandomList(RandomListNode head) {

        RandomListNode newHead = null;
        RandomListNode newTail = newHead;


        RandomListNode cur = head;


        while (cur != null) {

            if (newHead == null) {
                newHead = new RandomListNode(cur.label);
                newTail = newHead;
            } else {
                RandomListNode newNext = new RandomListNode(cur.label);

                newTail.next = newNext;
                newTail = newTail.next;
            }

            cur = cur.next;
        }

        return newHead;
    }

    class RandomListNode {
        int label;
        RandomListNode next, random;

        RandomListNode(int x) {
            this.label = x;
        }
    }


}
