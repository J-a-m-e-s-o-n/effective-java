package com.rev.itemThree;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Singletons {

  /** Item 3. Page 17. Enforce the singleton property with a private constructor or an enum type. */
  @Test
  public void staticFactorySingletonExample() {
    assertThat(RevInstance.getInstance().getValue())
        .isEqualTo(RevInstance.ZERO);
  }

  /** Item 3. Page 17. Enforce the singleton property with a private constructor */
  @Test
  public void privateConstructorSingletonExample() {
    // Will not compile due to violation
    //RevInstance revInstance = new RevInstance(1);
  }
}
