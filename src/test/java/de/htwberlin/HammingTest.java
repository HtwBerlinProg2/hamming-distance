package de.htwberlin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HammingTest {

    @Test
    void distanceTestSampleOne() {
        Hamming H =  new Hamming();
        String strang1 = " ";
        String strang2 = " ";

        String expected = "StrangA: [ ]\n" +
                "StrangB: [ ]\n" +
                "Hamming-Abstand:0";
        assertEquals(expected, H.distance(strang2, strang1));
    }

    @Test
    void distanceTestSampleTwo() {
        Hamming H =  new Hamming();
        String strang1 = "G";
        String strang2 = "A";

        String expected = "StrangA: [G]\n" +
                "StrangB: [A]\n" +
                "Hamming-Abstand:1";
        assertEquals(expected, H.distance(strang2, strang1));
    }

    @Test
    void distanceTestOne() {
        Hamming H =  new Hamming();
        String strang1 = "G, G, A, C, T, G, A, A, A, T, C, T, G";
        String strang2 = "G, G, A, C, T, G, A, A, A, T, C, T, G";

        String expected = "StrangA: [G, G, A, C, T, G, A, A, A, T, C, T, G]\n" +
                "StrangB: [G, G, A, C, T, G, A, A, A, T, C, T, G]\n" +
                "Hamming-Abstand:0";
        assertEquals(expected, H.distance(strang1, strang2));
    }

    @Test
    void distanceTestTwo() {
        Hamming H =  new Hamming();
        String strang1 = "G, G, A, C, G, G, A, T, T, C, T, G";
        String strang2 = "A, G, G, A, C, G, G, A, T, T, C, T";

        String expected = "StrangA: [G, G, A, C, G, G, A, T, T, C, T, G]\n" +
                "StrangB: [A, G, G, A, C, G, G, A, T, T, C, T]\n" +
                "Hamming-Abstand:9";
        assertEquals(expected, H.distance(strang2, strang1));
    }

    @Test
    void distanceExceptionTest() {
        Hamming H =  new Hamming();
        String strang1 = "G, G, A, C, G, G, A, T, T,";
        String strang2 = "A, G, G, A, C, G, G, A, T, T, C, T";

        String expected = "StrangA: [G, G, A, C, G, G, A, T, T, C, T, G]\n" +
                "StrangB: [A, G, G, A, C, G, G, A, T, T, C, T]\n" +
                "Hamming-Abstand:9";
        assertThrows(Exception.class, ()-> H.distance(strang1, strang2));
    }


}