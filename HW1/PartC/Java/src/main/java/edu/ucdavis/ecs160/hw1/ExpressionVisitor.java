package edu.ucdavis.ecs160.hw1;

public interface ExpressionVisitor<T> {
    T visitNumber(NumberNode node);
    T visitAdd(AddNode node);
    T visitMultiply(MultiplyNode node);
}
