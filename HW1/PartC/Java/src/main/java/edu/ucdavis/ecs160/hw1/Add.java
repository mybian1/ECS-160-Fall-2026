package edu.ucdavis.ecs160.hw1;

public class Add extends BinaryExpr {
    public Add(Expr left, Expr right) {
        super(left, right);
    }
    @Override
    public <T> T accept(ExprVisitor<T> visitor) {
        return visitor.visitAdd(this);
    }
}
