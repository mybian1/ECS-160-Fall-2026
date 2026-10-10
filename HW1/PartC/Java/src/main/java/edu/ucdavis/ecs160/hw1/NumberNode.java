package edu.ucdavis.ecs160.hw1;

public final class NumberNode implements Expression {
    private final int value;

    public NumberNode(int value) { this.value = value; }
    public int getValue() { return value; }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitNumber(this);
    }
}
