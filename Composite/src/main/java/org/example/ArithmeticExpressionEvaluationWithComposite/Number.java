package org.example.ArithmeticExpressionEvaluationWithComposite;

public class Number implements ArithmeticExpression{
    public int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("The Number is : "+this.value);
        return this.value;
    }
}
