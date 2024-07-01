package br.upe;

public class MathExamples {

    public static void main( ) {
        int intNumA = 5;
        int intNumB = 3;

        System.out.println(intNumA + " + " + intNumB + " = " + add(intNumA, intNumB));
    }

    public static int add(int ...numbers){
        int acm = 0; for(int num: numbers) acm += num;
        return acm;
    }

}