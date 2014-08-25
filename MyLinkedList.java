public class MyLinkedList<T> {

    private static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }   
    }

    private Node<T> head;

    public MyLinkedList() {
        head = null;
    }

    public void push(T data) {
        Node<T> temp = new Node<T>(data, head);
        head = temp;
    }

    public T pop() {
        if (isEmpty()) {
            return null;
        }
        T temp = head.data;
        head = head.next;
        return temp;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
        mylist.push(1);
        mylist.push(2);
        mylist.pop();
        mylist.push(3);
        System.out.println(mylist.pop());
        System.out.println(mylist.pop());
    }

}
