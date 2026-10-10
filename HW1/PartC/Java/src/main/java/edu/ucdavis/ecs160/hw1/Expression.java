package edu.ucdavis.ecs160.hw1;

public interface Expression {
    <T> T accept(ExpressionVisitor<T> visitor);
}
