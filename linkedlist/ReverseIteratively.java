package linkedlist;

/**
 * 单链表的反转
 *
 * @author yclimb
 * @date 2020/8/27
 */
public class ReverseIteratively {
    public static void main(String[] args) {
        // 赋值并循环单链表
        SingleLinkedList list = new SingleLinkedList(10);
        Node node = list.getHead();
        while (null != node) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println("-----");
        // 遍历法反转
        node = traverse(list.getHead());
        while (null != node) {
            System.out.println(node.getData());
            node = node.getNext();
        }
        System.out.println("-----");
        // 递归法反转
        /*node = recursion(list.getHead());
        while (null != node) {
            System.out.println(node.getData());
            node = node.getNext();
        }*/
    }

    /**
     * 遍历法：在链表遍历的过程中将指针顺序置换
     * 0123->3210
     */
    public static Node traverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        // 0-3
        Node pre = head;
        // 1-3
        Node cur = head.getNext();
        while (null != cur.getNext()) {
            // next:2-3 -> 3
            Node next = cur.getNext();
            // cur:1-0-3 -> 2-1 -> 3
            cur.setNext(pre);
            // pre:1-0-3 -> 2-1 -> 3
            pre = cur;
            // cur:2-3 -> 3
            cur = next;
        }
        // 3-0-xxx
        cur.setNext(pre);
        // 3-0,次数使用了pre = head引用，然后3-0后的next=null
        head.setNext(null);
        return cur;
    }

    /**
     * 递归法：从最后一个Node开始，在弹栈的过程中将指针顺序置换的。
     */
    public static Node recursion(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        Node revHead = recursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return revHead;
    }

    /**
     * 节点
     */
    public static class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    /**
     * 单链表
     */
    public static class SingleLinkedList {
        private Node head;

        public SingleLinkedList(int size) {
            Node head = new Node(0);
            Node cur = head;
            for (int i = 1; i < size; i++) {
                Node tmp = new Node(i);
                cur.setNext(tmp);
                cur = tmp;
            }
            this.head = head;
        }

        public Node getHead() {
            return head;
        }

        public void setHead(Node head) {
            this.head = head;
        }
    }
}
