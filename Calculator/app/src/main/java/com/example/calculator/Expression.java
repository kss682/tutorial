package com.example.calculator;

import java.util.Stack;

public class Expression {
    private String expression;
    private double result;
    Stack<String> numbers = new Stack<String>();
    Stack<Character> operator = new Stack<Character>();

    Expression(){
        expression = "0.0";
    }

    public String getExpression(){
        return expression;
    }

    public void evalExpression(){
        expression = expression.split()
        expression = Double.toString(result);
    }


    public void addSymbol(String ch){
        if((expression.matches("0") )){
            expression = ch;
        }
        else{
            expression = expression + " " + ch;
        }
    }

    public void clearExpression(){
        expression = "0.0";
    }

}
