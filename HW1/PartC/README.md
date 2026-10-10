# ECS 160 HW1 — Part C

## Java (required)
The Java implementation uses the **Visitor** pattern. It provides `Expression`, `ExpressionVisitor<T>`, `NumberNode`, `AddNode`, `MultiplyNode`, and `Evaluator`. No `Main.java` or build scripts are included or changed.

The expression `10 + (2 * 3)` evaluates to `16`.

To integrate, copy the Java classes into your instructor's Part C Java package **only if their class names, APIs, and package match the provided skeleton**. The original Part C starter files have not been provided here; retain the instructor's Main and tests.

To test this standalone implementation, from the `Java/src/main/java` directory:

```sh
javac edu/ucdavis/ecs160/hw1/*.java
```

**Compile-time check**: With the Visitor pattern, introducing `visitModulo(ModuloNode)` as an abstract method on `ExpressionVisitor<T>` forces `Evaluator` and all other visitor implementations to handle the newly added operation. Merely adding a new node without extending the visitor interface does not guarantee exhaustiveness in Java; the interface must be updated.

