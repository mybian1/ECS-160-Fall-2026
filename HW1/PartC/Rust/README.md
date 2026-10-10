# Part C – Rust Extra Credit

Only `src/ast.rs` was modified: an `impl Expr` block adds the `eval(&self) -> i64` method used by the instructor's existing `main.rs`.

The implementation uses exhaustive `match` against all five `Expr` variants. If a new AST variant is added to `Expr`, the Rust compiler reports a non-exhaustive match until this evaluator handles that variant. The existing `main.rs`, `Cargo.toml`, and `Cargo.lock` are copied unchanged from the uploaded starter files.

Run tests with `cargo run` inside this directory.
