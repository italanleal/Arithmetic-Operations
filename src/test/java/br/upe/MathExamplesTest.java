package br.upe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathExamplesTest
{
    @Test
    public void givenRegularEntry_whenAdd_thenReturnSumOfElements()
    {
        assertEquals(MathExamples.add(1, 2), 3);
    }

    @Test
    public void givenRegularEntry_whenSubtract_thenReturnDifferenceBetweenElements()
    {
        assertEquals(2,MathExamples.subtract(5,3)); 

    }

    @Test
    public void givenRegularEntry_whenMultiply_thenReturnProductOfElements()
    {
        assertEquals(15,MathExamples.multiply(5,3));

    }

    @Test
    public void givenRegularEntry_whenDivide_thenReturnIntegerQuotient()
    {
        assertEquals(4,MathExamples.divide(8,2));

    }

    @Test
    public void givenRegularEntry_whenMod_thenReturnModulusOfIntegerDivision() 
    {
        assertEquals(2,MathExamples.mod(5,3));

    }

    @Test
    public void givenRegularEntry_whenExponent_thenReturnExponentiationResult() 
    {
        assertEquals(125,MathExamples.exponent(5,3));

    }

}
