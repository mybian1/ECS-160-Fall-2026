# Part C (Java): Visitor pattern

`Expression` exposes `accept`; `NumberNode`, `AddNode`, and `MultiplyNode` implement it. `ExpressionVisitor<T>` requires a visit method for each node type. `Evaluator` is a concrete visitor. Future operations are implemented as new visitors without changing existing AST node classes.

If you add a `ModuloNode` and its `accept` invokes `visitor.visitModulo(this)`, compilation fails until you add `visitModulo` to `ExpressionVisitor`. The compiler then requires every concrete visitor to implement that new method. This enforces coverage when extending the visitor interface; unlike an exhaustive enum match, Java does not automatically discover a node class added without updating the visitor interface.

Run from `Java/`: `javac -d build $(find src/main/java -name '*.java') && java -ea -cp build edu.ucdavis.ecs160.hw1.Main`.

These are standalone files built from the handout's stated specification. If the repository already defines `Expression`, `Node`, or other AST types, adapt to those existing names and preserve its `Main` and `pom.xml`.
