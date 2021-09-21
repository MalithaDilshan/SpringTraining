package com.company.service;

/**
 * Calc Factory service for each controllers
 * Only integer calculations
 */
public class CalcService {
    public CalcService()
    {

    }

    public int addTwoIntNumbers(int a, int b )
    {
        return a+b;
    }

    public int subTwoIntNumbers(int a, int b)
    {
        return a-b;
    }

    public int multiplyTwoIntNumbers( int a, int b )
    {
        return a*b;
    }

    public int divideTwoIntNumbers( int a, int b) throws ArithmeticException
    {
        if( b==0 )
        {
            throw new ArithmeticException("Divide by zero not allowed");
        }
        return a/b;
    }
}
