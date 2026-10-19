# Project Guidelines

## Project Structure

- This is a Java 25 Maven application, not a framework-based project. Keep changes consistent with the existing plain Java structure unless a task requires otherwise.
- Application code and resources belong in `src/main/java` and `src/main/resources`; tests and test resources belong in `src/test/java` and `src/test/resources`.
- Do not edit generated files or build output under `target/`.

## Development and Validation

- Run `mvn test` for code changes and `mvn verify` when validating formatting and Checkstyle as well as tests.
- Java formatting is managed by Spotless with Google Java Format. Use `mvn spotless:apply` when formatting needs to be applied.
- Tests use JUnit 5. Keep them independent of external services unless a task specifically requires integration testing.
- Review the existing Maven configuration before adding dependencies or introducing frameworks.

## Project Conventions

- Follow the focused Java, Markdown, and commit-message guidance in [`.github/instructions/`](./instructions/).
- Keep configuration in the existing properties files. Do not commit real credentials or other secrets.
- Update relevant documentation when changing project behavior or developer workflows.
