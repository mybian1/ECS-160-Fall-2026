# Part B — Decorator Pattern

## Java

- `User.java` and `AdminUser.java` are unchanged.
- `LoggingUser.java` is a new decorator that implements the `User` interface, delegates each method to the wrapped user, and logs before the call.
- `Main.java` retains the original instructions/calls. The **only** changed line is the intentional `User user; // Initialize user here!` placeholder, which becomes `User user = new LoggingUser(new AdminUser("Alice", "alice@example.com"));`.

## Python

- `main.py` is unchanged.
- `user.py` preserves the original `User`, `AdminUser`, attributes, and snake_case method names. It adds `@log` to `AdminUser` methods and defines a wrapper using `functools.wraps`.

## Disadvantage to using Python's decorator annotation

Using Python’s @decorator annotation is simpler and requires less code, but it is less flexible than implementing the Decorator design pattern manually. A manually implemented decorator can wrap an entire object and dynamically add or remove behavior at runtime. In contrast, Python’s @decorator annotation typically wraps individual methods when they are defined, making it harder to change their behavior dynamically.
