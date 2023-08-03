package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyPairTest {

    @Test
    public void getKeyTest() {
        MyPair pair = new MyPair("Bob", 3);
        String expected = "Bob";

        String actual = pair.getKey();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setKeyTest() {
        MyPair pair = new MyPair("Bob", 3);
        String expected = "Joe";

        pair.setKey("Joe");
        String actual = pair.getKey();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getValueTest() {
        MyPair pair = new MyPair("Bob", 3);
        Integer expected = 3;

        Integer actual = pair.getValue();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void setValueTest() {
        MyPair pair = new MyPair("Bob", 3);
        Integer expected = 7;

        pair.setValue(7);
        Integer actual = pair.getValue();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testEqualsTest() {
        MyPair pair1 = new MyPair("Bob", 3);
        MyPair pair2 = new MyPair("Bob", 3);

        Assert.assertEquals(pair1, pair2);

    }
}