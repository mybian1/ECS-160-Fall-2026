package edu.ucdavis.ecs160.hw1;

public interface ExprVisitor<T> {
    T visitNum(Num expr);
    T visitAdd(Add expr);
    T visitSub(Sub expr);
    T visitMult(Mult expr);
    T visitDiv(Div expr);
}
