package Challange;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SpecialTest {



    private SpecialArrayList specialArrayList;
    private String a;
    private String b;
    private String result;


    public SpecialTest(String a, String b, String result)
    {
        this.a = a;
        this.b = b;
        this.result = result;
    }

    @Before
    public void setUp(){
       specialArrayList = new SpecialArrayList();
    }


    @Parameterized.Parameters
    public static Collection<Object[]> strings(){
        return Arrays.asList(new Object[][]{{"","",""},{"","a","a"},{"a","","a"},{"abc","123","abc123"}});
    }


    @Test
    public void test_special()
    {
        specialArrayList.concatAddStrings(a,b);
        Assert.assertEquals(result,specialArrayList.get(0));
        System.out.println(result);
    }
}
