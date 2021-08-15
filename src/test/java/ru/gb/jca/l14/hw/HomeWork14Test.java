package ru.gb.jca.l14.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class HomeWork14Test extends HomeWork14 {

    @ParameterizedTest
    @MethodSource("dataForArrayCompare")
    public void testArrComp(int [] a, int [] b) {
        Assertions.assertArrayEquals(b, HomeWork14.metArFour(a));
    }

    public static Stream<Arguments> dataForArrayCompare() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[] {100, 200, 300, 4, 500, 600, 700}, new int[] {500, 600, 700}));
        list.add(Arguments.arguments(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}, new int[] {1, 7}));
        return list.stream();
    }

    @org.junit.jupiter.api.Test
    void testMetArFour() {
        Assertions.assertThrows(Exception.class, ()-> HomeWork14.metArFour(new int[] {1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @org.junit.jupiter.api.Test
    void testMetFindFour() {
        Assertions.assertTrue(HomeWork14.metFindFour(new int[] { 1, 1, 1, 4, 4, 1, 4, 4 }));
    }

    @Test
    void testTime() {

    }

}
