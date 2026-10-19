---
description: "Java source code conventions"
applyTo: "**/*.java"
---

# Java Coding Conventions

Apply these conventions when creating or modifying Java code in this repository. Preserve consistency with the existing code and prioritize readability and maintainability.

## General Principles

- Write code that compiles with Java 25, as specified by the Maven compiler configuration.
- Use UTF-8 for source files and resources.
- Follow existing formatting and design patterns where they exist.
- Make only the changes needed; avoid unrelated formatting or refactoring.

## Formatting

- Indent with two spaces; do not use tabs. Formatting follows Google Java Format, applied by Spotless.
- Use braces for class, method, and control-flow blocks. Place the opening brace on the same line as the declaration or condition.
- Separate classes and methods with blank lines, and keep related code together.
- Do not put multiple statements on one line. Break long conditions and calls at readable points.
- Remove unnecessary whitespace, unused imports, and dead code.

## Naming and Declarations

- Use lowercase package names, separating words with dots.
- Use `UpperCamelCase` for class, interface, enum, and record names.
- Use `lowerCamelCase` for method, field, and local variable names.
- Declare constants as `static final` and name them using `UPPER_SNAKE_CASE`.
- Choose specific type and variable names that clearly convey their purpose. Avoid unclear abbreviations and single-letter names, except for conventional, clear cases such as short loop variables.
- Keep scope as narrow as possible and make fields `private` by default. Clearly justify any broader visibility.
- Consider declaring local variables `final` when they are not reassigned after initialization. Prefer constants and immutable objects.

## Implementation

- Give each method a single responsibility, and split complex logic into smaller, well-named methods.
- When nesting becomes deep, improve readability with guard clauses or by extracting logic.
- Do not return or accept `null` casually. Handle it explicitly while remaining consistent with existing APIs.
- Do not swallow exceptions. Propagate or handle appropriate exceptions so callers can recover or make informed decisions.
- Include information needed to diagnose the cause in exception messages, but never include secrets or sensitive information.
- Validate input at boundaries and detect invalid states as early as possible.
- Add comments only when the intent is not clear from the code; explain reasons or constraints. Avoid comments that merely restate what the code does.
- Add Javadoc where appropriate to describe the purpose, parameters, return value, and exceptions of public APIs or APIs with complex contracts.

## Testing

- Use JUnit 5 and place tests under `src/test/java`.
- Name test methods so the behavior under test is clear.
- Test important boundary conditions and failure behavior in addition to the happy path.
- Keep tests independent of external state so each test can run on its own.
- When changing an implementation, add or update relevant tests and run the Maven test suite.