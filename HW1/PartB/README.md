# Part B — Decorator Pattern

This version is based on the original instructor PartB starter files.

## Java

- `User.java` and `AdminUser.java` are unchanged.
- `LoggingUser.java` is a new decorator that implements the `User` interface, delegates each method to the wrapped user, and logs before the call.
- `Main.java` retains the original instructions/calls. The **only** changed line is the intentional `User user; // Initialize user here!` placeholder, which becomes `User user = new LoggingUser(new AdminUser("Alice", "alice@example.com"));`.

## Python

- `main.py` is unchanged.
- `user.py` preserves the original `User`, `AdminUser`, attributes, and snake_case method names. It adds `@log` to `AdminUser` methods and defines a wrapper using `functools.wraps`.

## Tradeoff of Python annotation decorators

Decorating methods with `@log` requires editing the original class definition (or each method). A traditional object wrapper can log a class without changing it and can enable/disable behavior by wrapping instances at runtime. Newly added methods also need explicit annotations.

## Testing

From `PartB/Python`: `python3 main.py`

From `PartB/Java/src/main/java`: `javac edu/ucdavis/ecs160/hw1/*.java && java edu.ucdavis.ecs160.hw1.Main`

Run the instructor's `./grade.sh` from the root of the complete original repository after copying changes. This archive is Part B only.
