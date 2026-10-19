package com.example.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {

  @Test
  void greetReturnsGreetingWithName() {
    assertEquals("Hello, World!", App.greet("World"));
  }

  @Test
  void greetUsesGivenName() {
    assertEquals("Hello, Java!", App.greet("Java"));
  }
}
