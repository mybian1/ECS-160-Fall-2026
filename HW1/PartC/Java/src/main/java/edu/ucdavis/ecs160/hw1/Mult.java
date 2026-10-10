package edu.ucdavis.ecs160.hw1;

public class Mult extends BinaryExpr {
    public Mult(Expr left, Expr right) {
        super(left, right);
    }
    @Override
    public <T> T accept(ExprVisitor<T> visitor) {
        return visitor.visitMult(this);
    }
}
