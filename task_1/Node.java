package Laba_2.task_1;

public class Node<Integer> {
    private Integer data;
    private Node<Integer> next;
    private Node<Integer> prev;

    Node() {
    };
    Node(final Node<Integer> prev, final Integer element, final Node<Integer> next) {
        this.data = element;
        this.next = next;
        this.prev = prev;
    }
    public Integer getData() {
        return data;
    }
    public void setData(final Integer data) {
        this.data = data;
    }
    public Node<Integer> getNext() {
        return next;
    }
    public void setNext(final Node<Integer> next) {
        this.next = next;
    }
    public Node<Integer> getPrev() {
        return prev;
    }
    public void setPrev(final Node<Integer> prev) {
        this.prev = prev;
    }
}