package edu.ucdavis.ecs160.hw1;

public final class Evaluator implements ExpressionVisitor<Integer> {
    public int evaluate(Expression expression) {
        return expression.accept(this);
    }

    @Override
    public Integer visitNumber(NumberNode node) {
        return node.getValue();
    }

    @Override
    public Integer visitAdd(AddNode node) {
        return node.getLeft().accept(this) + node.getRight().accept(this);
    }

    @Override
    public Integer visitMultiply(MultiplyNode node) {
        return node.getLeft().accept(this) * node.getRight().accept(this);
    }
}
