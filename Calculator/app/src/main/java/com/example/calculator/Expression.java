package com.example.calculator;

public class Expression {
    private String expression;
    private double result;
    private String[] operators = new String[]{"(", ")", "+", "-", };

    Expression(){
        expression = "0";
    }

    public String getExpression(){
        return expression;
    }

    public void evalExpression(){


        expression = Double.toString(result);
    }


    public void addSymbol(String ch){
        if(expression.length() == 1 && expression.contentEquals("0")){
            expression = ch;
        }
        else{
            expression = expression + " " + ch;
        }
    }

    public void clearExpression(){
        expression = "0";
    }

}
