package edu.ucdavis.ecs160.hw1;

public interface Expr {
    <T> T accept(ExprVisitor<T> visitor);
}
