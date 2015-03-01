package ru.test;


import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {

    public static void main(String[] args) {
        ExpressionParser parser = new SpelExpressionParser();
        Expression expression  = parser.parseExpression("1+2*(3*5)");
        Integer result = (Integer) expression.getValue();
        System.out.println(result);
        String test = "(1+2)*3";
        int i = Integer.parseInt(test);
        System.out.println(i);

    }
}
