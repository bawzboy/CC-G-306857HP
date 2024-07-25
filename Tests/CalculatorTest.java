package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    
    @Test
	public void testAddPositiveNumbers() {
        assertEquals(5, Calculator.add(2, 3));
        assertEquals(100, Calculator.add(50, 50));
    }

    @Test
	public void testAddNegativeNumbers() {
        assertEquals(-5, Calculator.add(-2, -3));
        assertEquals(-100, Calculator.add(-50, -50));
    }

    @Test
	public void testAddPositiveAndNegativeNumbers() {
        assertEquals(1, Calculator.add(-2, 3));
        assertEquals(-1, Calculator.add(2, -3));
    }

    @Test
	public void testAddWithZeros() {
        assertEquals(2, Calculator.add(2, 0));
        assertEquals(0, Calculator.add(0, 0));
        assertEquals(-2, Calculator.add(0, -2));
    }

    // @Test
	// public void testAddWithBoundaryValues() {
    //     assertEquals((double) Integer.MAX_VALUE + 1, Calculator.add(Integer.MAX_VALUE, 1), 0.001);
    //     assertEquals((double) Integer.MIN_VALUE - 1, Calculator.add(Integer.MIN_VALUE, -1), 0.001);
    // }

    // @Test // Version vom Dozenten
	// public void testAddWithBoundaryValues() {
		
    //     assertEquals((double) (Integer.MAX_VALUE + 1), (double)- Calculator.add(Integer.MAX_VALUE, 1), 0.0001);
    //     assertEquals((double) (Integer.MIN_VALUE - 1), Calculator.add(Integer.MIN_VALUE, -1), 0.0001);
    // }

}
