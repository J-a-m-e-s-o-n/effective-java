package com.rev.itemOne;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StaticFactoryMethods {

  /** Item 1: Consider static factory methods instead of constructors. */
  @Test
  public void canGetStringUsingConstructor() {
    int one = 1;
    // Constructors don't have meaningful names.
    String value1 = new String("one");
    String value2 = new String("1");
    String value3 = new String(Integer.toString(one));
    String value4 = new String("juan");

    assertThat(value1.toString()).isEqualTo(value1);
    assertThat(value2.toString()).isEqualTo(value3);
    assertThat(value3.toString()).isEqualTo(value2);
    assertThat(value4.toString()).isEqualTo(value4);
  }

}
