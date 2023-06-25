package Challange;

import org.junit.Assert;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.*;

public class Tests {

    private ArrayList<String> arrayList;



    @Before
    public void setUp(){
        arrayList.add("Philip");
        arrayList.add("Pascal");
        Assume.assumeTrue(Objects.equals(arrayList.get(0), "Philip"));
        Assume.assumeTrue(Objects.equals(arrayList.get(1), "Pascal"));
    }


    @After
    public void tearDown() {
        arrayList = null;
        Assume.assumeTrue(arrayList == null);
    }

    @Test
    public void testAdd(){
        arrayList.add("Daniel");
        Assert.assertEquals(3,arrayList.size());
        Assert.assertEquals("Philip",arrayList.get(0));
        Assert.assertEquals("Pascal",arrayList.get(1));
        Assert.assertEquals("Daniel",arrayList.get(2));
    }

    @Test
    public void testRemoveObject(){

        arrayList.remove("Philip");
        Assert.assertEquals(1, arrayList.size());
        Assert.assertEquals("Pascal",arrayList.get(0));

    }

    @Test
    public void testRemoveIndex(){
        arrayList.remove(0);
        Assert.assertFalse(arrayList.size() < 2);
        Assert.assertEquals("Pascal",arrayList.get(0));
    }
}

