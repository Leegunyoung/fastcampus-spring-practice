package org.example.service;

import org.example.logic.BubbleSort;
import org.example.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {
    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test(){
        List<String> actual=sut.doSort(List.of("3","2","1"));
        assertEquals(List.of("1","2","3"),actual);
    }

}