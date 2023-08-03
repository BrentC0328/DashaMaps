package MyLinkedList;

import java.util.Objects;

public class MyNode {
    private MyPair data;

    private MyNode next;


    public MyNode(MyPair pair){
        this.data = pair;
    }

    public MyNode(String key, Integer value) {
        this.data = new MyPair(key, value);
    }

    public MyPair getData() {
        return data;
    }


    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyNode myNode = (MyNode) o;
        return Objects.equals(data, myNode.data) && Objects.equals(next, myNode.next);
    }

}
