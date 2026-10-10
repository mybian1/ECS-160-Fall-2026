package edu.ucdavis.ecs160.hw1;

public final class Evaluator implements ExprVisitor<Integer> {
    public int evaluate(Expr expr) {
        return expr.accept(this);
    }

    @Override
    public Integer visitNum(Num expr) {
        return expr.getValue();
    }

    @Override
    public Integer visitAdd(Add expr) {
        return evaluate(expr.getLeft()) + evaluate(expr.getRight());
    }

    @Override
    public Integer visitSub(Sub expr) {
        return evaluate(expr.getLeft()) - evaluate(expr.getRight());
    }

    @Override
    public Integer visitMult(Mult expr) {
        return evaluate(expr.getLeft()) * evaluate(expr.getRight());
    }

    @Override
    public Integer visitDiv(Div expr) {
        return evaluate(expr.getLeft()) / evaluate(expr.getRight());
    }
}
