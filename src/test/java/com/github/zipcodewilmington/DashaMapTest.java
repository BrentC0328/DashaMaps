package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author xtofer
 * @version 1.0.0
 * @date 10/21/19 9:05 AM
 */
public class DashaMapTest {
    @Test
    public void setTest() {
        DashaMap doorDash = new DashaMap();

    }

    @Test
    public void isEmptyTest() {
        DashaMap doorDash = new DashaMap();

        Assert.assertTrue(doorDash.isEmpty());
    }

    @Test
    public void isNotEmptyTest(){
        DashaMap doorDash = new DashaMap();
        doorDash.set("Bob", 1);

        Assert.assertFalse(doorDash.isEmpty());
    }

    @Test
    public void sizeTest() {
        DashaMap doorDash = new DashaMap();
        Integer expected = 26;
        Integer actual = doorDash.size();

        Assert.assertEquals(expected,actual);

    }
}
