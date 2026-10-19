package com.example.app;

/** Sample application entry point. */
public class App {

  /**
   * Builds a greeting for the given name.
   *
   * @param name the name to greet
   * @return the greeting message
   */
  public static String greet(String name) {
    return "Hello, " + name + "!";
  }

  /**
   * Prints a greeting to standard output.
   *
   * @param args command-line arguments (unused)
   */
  public static void main(String[] args) {
    System.out.println(greet("World"));
  }
}
