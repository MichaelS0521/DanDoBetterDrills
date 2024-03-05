package com.zipcodewilmington.danny_do_better_exercises;

import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestAddition;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestDivision;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestMultiplication;
import com.zipcodewilmington.danny_do_better_exercises.mathutilities.TestSubtraction;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.Assert.*;
/**
 * Created by dan on 6/14/17.
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {

    private MathUtilities utilities;

    @Before
    public void setup(){
        utilities = new MathUtilities();
    }
    public void testAddInteger(){
        //Given
        int expected = 15;

        //When
        int actual = utilities.add(7, 8);

        //Then
        assertEquals(expected, actual);
    }
}