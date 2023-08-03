package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyNodeTest {

    @Test
    public void getData() {
        MyNode myNode = new MyNode("Bob", 3);
       MyPair expected = new MyPair("Bob", 3);

        MyPair actual = myNode.getData();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getNext() {
    }

    @Test
    public void setNext() {
        MyNode node1 = new MyNode("Bob", 2);
        MyNode node2 = new MyNode("Stacy", 5);
        MyNode expected = node2;

        node1.setNext(node2);
        MyNode actual = node1.getNext();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testEquals() {
    }
}