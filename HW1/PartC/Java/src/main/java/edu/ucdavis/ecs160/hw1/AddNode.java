package edu.ucdavis.ecs160.hw1;

public final class AddNode implements Expression {
    private final Expression left;
    private final Expression right;

    public AddNode(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    public Expression getLeft() { return left; }
    public Expression getRight() { return right; }

    @Override
    public <T> T accept(ExpressionVisitor<T> visitor) {
        return visitor.visitAdd(this);
    }
}
