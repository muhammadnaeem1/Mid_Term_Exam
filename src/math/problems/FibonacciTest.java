package math.problems;

import org.junit.Assert;
import org.junit.Test;
public class FibonacciTest {

    public void testCalculate() {
        Fibonacci fibonacci = new Fibonacci();

        int result1 = fibonacci.calculate(5);
        Assert.assertEquals(5, result1);

        int result2 = fibonacci.calculate(10);
        Assert.assertEquals(55, result2);


    }







}
