package edu.udg.caes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExerciseIntroTestingTest {

    @Test
    public void testFindLast(){
        final int result = ExerciseIntroTesting.findLast(new int []{2, 3, 5}, 2);
        assertEquals(result, 0);
    }

    @Test
    public void testLastZero(){
        final int result = ExerciseIntroTesting.lastZero(new int []{0, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive(){
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, 0, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{-3, -2, 0, 1, 4});
        assertEquals(result, 3);
    }

     @Test
    public void testFindLast2(){ //El bug es que no arriba a mirar index 0
        final int result = ExerciseIntroTesting.findLast(new int []{3, 2, 5}, 2);
        assertEquals(result, 1);
    }

    @Test
    public void testLastZero2(){ //El bug es que el metode et torna l'index del 1r 0, no de l'ultim.
        final int result = ExerciseIntroTesting.lastZero(new int []{1, 1, 0});
        assertEquals(result, 2);
    }

    @Test
    public void testCountPositive2(){//El bug CREC que es que tambe et conta els 0 com a elements positius i no hauria
        final int result = ExerciseIntroTesting.countPositive(new int []{-4, 2, -1, 2});
        assertEquals(result, 2);
    }

    @Test
    public void testOddOrPos2(){
        final int result = ExerciseIntroTesting.oddOrPos(new int []{1,2,3,4});
        assertEquals(result, 4);
    }
}