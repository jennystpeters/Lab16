package com.gc.tdd;

import com.gc.tdd.PrimeSequence;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jenny St. Peters on 7/27/2017.
 */

public class PrimeSequenceTest {

    int[] sequenceArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int[] primeArray = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
//2147483647
    @Test
    public void testCase1() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[0];
        int sequence = sequenceArray[0];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase2() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[1];
        int sequence = sequenceArray[1];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase3() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[2];
        int sequence = sequenceArray[2];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase4() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[3];
        int sequence = sequenceArray[3];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase5() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[4];
        int sequence = sequenceArray[4];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase6() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[5];
        int sequence = sequenceArray[5];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase7() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[6];
        int sequence = sequenceArray[6];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase8() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[7];
        int sequence = sequenceArray[7];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase9() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[8];
        int sequence = sequenceArray[8];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }

    @Test
    public void testCase10() throws Exception {
        PrimeSequence primeSequence = new PrimeSequence();

        int expected = primeArray[9];
        int sequence = sequenceArray[9];
        int actual = primeSequence.primeSequence(sequence);
        String testName = "testCase" + sequence + " - primeSequence.primeSequence(" + sequence + ")";

        assertEquals(testName + "failed.", expected, actual);
    }
}
