package com.zipcodewilmington.singlylinkedlist;

import jdk.internal.org.objectweb.asm.tree.InsnList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest<T> {
    SinglyLinkedList<String> list;
    @Before
    public void Before(){
        list = new SinglyLinkedList<String>()
    }
    @Test
    public void testAdd() {
        String expected = "test";
        list.add("test");

        Assert.assertTrue(list.contains());
    }

    @Test
    public void testRemove() {
        String expected = "test";
        list.add("test");
        list.remove(expected);

        Assert.assertTrue(list.contains());
    }

    @Test
    public void testContains() {
        String expected = "test";

        list.add("test");

        Assert.assertTrue(list.contains());


    }

    @Test
    public void testFind1() {
        int expected = 1;
        String vol = "target";
        list.add("");
        list.add(vol);

        int actual;
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFind2() {
        int expected = 1;
        String vol = "target";
        list.add("");
        list.add(vol);
        int actual = list.find(vol);

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testSize() {
        int expected =3;
        list.add("");
        list.add("");
        list.add("");

        int actual = list.size();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testGet() {
        String expected = "target";
        list.add("");
        list.add(expected);

        Integer actual = list.get(1);

        Assert.assertEquals(expected, actual);



    }

    @Test
    public void testCopy() {
        list.add("Andre");
        list.add("Hieup");
        list.add("Zack");
        SinglyLinkedList<String>  newList = list.copy();

        Assert.assertNotEquals(newList.toString(), newList.toString());
        for (int i = 0; i < list.size; i++) {
            Assert.assertEquals(list.get(i), newList.get(i);

        }




    }

    @Test
    public void testSort() {
        list.add("Andre");
        list.add("Hieup");
        list.add("Zach");
        list.sort();
        Assert.assertEquals(list.get(0).getData(), "Andre");
        Assert.assertEquals(list.get(0).getData(), "Hieup");
        Assert.assertEquals(list.get(0).getData(), "Zach");


    }
}

