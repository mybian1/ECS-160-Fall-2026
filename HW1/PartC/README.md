# ECS 160 HW1 — Part C

# Java: Visitor evaluator

This implementation matches the provided instructor AST (`Expr`, `Num`, `Add`, `Sub`, `Mult`, `Div`, and `BinaryExpr`).

Changes: add `accept` to `Expr` and concrete nodes; add `ExprVisitor` and `Evaluator`; fill in the single `int actual` placeholder in `Main.java`. All supplied test cases remain unchanged. `BinaryExpr.java` is unchanged.

Place the Java source files in `PartC/Java/src/main/java/edu/ucdavis/ecs160/hw1/` of the **original homework repository**. Retain the instructor's `pom.xml` and other build files. Do not include earlier incompatible files (`Expression.java`, `ExpressionVisitor.java`, `NumberNode.java`, `AddNode.java`, `MultiplyNode.java`).

For new node operations, add a visit method to `ExprVisitor`, implement `accept` in the new node, and Java requires all concrete visitors to implement the new visit method at compile time.

Test: `javac -d /tmp/partc_classes $(find src/main/java -name '*.java')` then `java -ea -cp /tmp/partc_classes edu.ucdavis.ecs160.hw1.Main`.

# Rust Extra Credit

Only `src/ast.rs` was modified: an `impl Expr` block adds the `eval(&self) -> i64` method used by the instructor's existing `main.rs`.

The implementation uses exhaustive `match` against all five `Expr` variants. If a new AST variant is added to `Expr`, the Rust compiler reports a non-exhaustive match until this evaluator handles that variant. The existing `main.rs`, `Cargo.toml`, and `Cargo.lock` are copied unchanged from the uploaded starter files.

Run tests with `cargo run` inside this directory.
