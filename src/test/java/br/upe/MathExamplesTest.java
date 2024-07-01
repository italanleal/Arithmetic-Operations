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
}
