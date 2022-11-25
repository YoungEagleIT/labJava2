package Laba_2.task_1;

import java.util.Iterator;

public class Quene implements DuoQuene, Iterable<Integer> {
    protected Node<Integer> head;
    protected Node<Integer> tail;

    public void add(final int value) {
        setLast(value);
    }

    public void setFirst(final int value) {
        final Node<Integer> newNode = new Node<>(null, value, this.head);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
    }

    public void setLast(final int value) {
        final Node<Integer> newNode = new Node<>(this.head, value, null);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setPrev(tail);
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    @Override
    public Node<Integer> getFirst() {
        return head;
    }

    @Override
    public Node<Integer> getLast() {
        return tail;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterat();
    }

    public boolean isThereNext() {
        if(head != null)
        {
            head = head.getNext();
            return  true;
        }
        return  false;
    }

    public class Iterat implements java.util.Iterator<Integer> {
        private Node<Integer>  thisNode = head;
        @Override
        public boolean hasNext() {
            return isThereNext();
        }

        @Override
        public Integer next() {
            final Node tmp = thisNode;
            thisNode = thisNode.getNext();
            return (Integer) tmp.getData();
    }
}

//    public int sizeOf() {
//        int size = 0;
//        while (head.getNext() != null) {
//            size++;
//            head = head.getNext();
//        }
//        return size;
//    }
//
//    public Integer findByIndex(final int valueIndex) {
//        if (valueIndex < 0 || valueIndex > sizeOf())
//        {
//            System.out.println("Error: Out_Of_Index");
//        }
//            Node<Integer> x = head;
//        for (int i = 0; i < valueIndex; i++) {
//            x = x.getNext();
//        }
//        return x.getData();
//    }
//    public Integer bySize() {
//        Node<Integer> x = head;
//        final int size = sizeOf();
//        for (int i = 0; i < size; i++) {
//            x = x.getNext();
//        }
//        return x.getData();
//    }

}