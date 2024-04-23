package com.emradbuba.learning.workout.java8.mapmerge;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MapMergeDemoTest {

    @Test
    public void test0(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList());
        assertNull(map.get(1));
        assertNull(map.get(2));
        assertNull(map.get(3));
    }

    @Test
    public void test1(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3));
        assertEquals(3, (int) map.get(1));
        assertEquals(3, (int) map.get(2));
        assertEquals(3, (int) map.get(3));
        map = MapMergeDemo.createMergedMap(Arrays.asList(1, 2, 2, 3, 3, 3));
        assertEquals(1, (int) map.get(1));
        assertEquals(2, (int) map.get(2));
        assertEquals(3, (int) map.get(3));
    }

    @Test
    public void test2(){
        Map<Integer, Integer> map = MapMergeDemo.createMergedMap(Arrays.asList(1, 3, 1, 2, 2, 1, 3, 2, 3, 100));
        assertEquals(3, (int) map.get(1));
        assertEquals(3, (int) map.get(2));
        assertEquals(3, (int) map.get(3));
        assertEquals(1, (int) map.get(100));

    }


}