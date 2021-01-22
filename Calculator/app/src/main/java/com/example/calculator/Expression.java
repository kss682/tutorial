package com.example.calculator;

public class Expression {
    private String expression;

    Expression(){
        expression = "0";
    }

    public String getExpression(){
        return expression;
    }

    public void evalExpression(){

    }

    public void addSymbol(String ch){
        expression = expression + " " + ch;
    }

    public void clearExpression(){
        expression = "0";
    }
}
