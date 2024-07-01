package br.upe;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathExamplesTest
{
    @Test
    public void givenEmptyArity_whenAdd_thenReturnZero()
    {
        assertEquals(MathExamples.add(), 0);
    }

    @Test
    public void givenRegularEntry_whenAdd_thenReturnSumOfElements()
    {
        assertEquals(MathExamples.add(1, 2, 3), 6);
    }
    @Test
    public void givenSingleNumber_whenAdd_thenReturnNumber()
    {
        assertEquals(MathExamples.add(11), 11);
    }

    @Test
    public void givenRegularEntry_whenSubtract_thenReturnDifferenceBetweenElements()
    {
        assertEguals(2,MathExamples.subtract(5,3)); 

    }

    @Test
    public void givenRegularEntry_whenMultiply_thenReturnProductOfElements()
    {
        assertEquals(15,MathExamples.multiply(5,3));

    }

    @Test
    public void givenRegularEntry_whenDivide_thenReturnIntegerQuotient()
    {
        assertEQuals(4,MathExamples.divide(8,2));

    }

    @Test
    public void givenRegularEntry_whenMod_thenReturnModulusOfIntegerDivision() 
    {
        assertEquals(2,MathExamples.mod(5,3) );

    }

    @Test
    public void givenRegularEntry_whenExponent_thenReturnExponentiationResult() 
    {
        assertEquals(125,MathExamples.exponent(5,3));

    }

}
