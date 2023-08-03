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
    }

    @Test
    public void testEquals() {
    }
}