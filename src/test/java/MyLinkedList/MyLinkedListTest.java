package MyLinkedList;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyLinkedListTest {

    @Test
    public void getHead() {
    }

    @Test
    public void addTest() {
        MyLinkedList listy = new MyLinkedList("Manny");
        String expectedKey = "Brent";
        Integer expectedValue = 6;
        MyNode expected = new MyNode("Brent", 6);

        listy.add(expectedKey, expectedValue);
        MyNode actual = listy.getHead().getNext();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void sizeTest(){
        MyLinkedList listy = new MyLinkedList("Manny");
        String expectedKey = "Brent";
        Integer expectedValue = 6;
        MyNode expectedNode = new MyNode("Brent", 6);
        Integer expected = 2;

        listy.add(expectedKey, expectedValue);
        Integer actual = listy.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTest(){
        MyLinkedList listy = new MyLinkedList("Manny");
        String expectedKey = "Brent";
        Integer expectedValue = 6;
        MyNode expectedNode = new MyNode("Brent", 6);


        listy.add(expectedKey, expectedValue);

        MyNode actual = listy.get("Brent");

        Assert.assertEquals(expectedNode, actual);
    }

    @Test
    public void deleteTest(){
        MyLinkedList listy = new MyLinkedList("Manny");
        String expectedKey = "Brent";
        Integer expectedValue = 6;
        MyNode expectedNode = new MyNode("Brent", 6);


        listy.add(expectedKey, expectedValue);
        Integer actual = listy.delete("Brent");

        Assert.assertEquals(expectedValue, actual);
    }

}