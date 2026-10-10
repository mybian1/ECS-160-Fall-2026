# Part A: Singleton Configuration

- Java: a private constructor and a private static final instance ensure that `getInstance()` returns the one instance.
- C++: a private constructor and a function-local static instance ensure that `getInstance()` returns the same object by reference. Copying, assignment, and moving are deleted to prevent additional instances.
- Python: `__new__` caches the sole instance and `get_instance()` returns it. Name mangling on `__instance` discourages accidental external access. As Python provides no strict private access controls, a determined caller can bypass this convention through low-level object creation or introspection; this cannot be completely prevented in ordinary Python code.

All implementations initialize `appName = "ECS160-HW1"`, `logLevel = "INFO"`, `maxConnections = 32`, and `debugMode = true` (Python: `True`). The provided main files were copied without code changes.
