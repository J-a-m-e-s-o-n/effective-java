package com.rev.itemFour;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

public class Unusable {

  /** Item 4. Page 17. Enforce noninstantiability */
  @Test
  public void canTriggerSystemOutputUsingReflection()
      throws NoSuchMethodException, InstantiationException, IllegalAccessException,
          InvocationTargetException {
    Constructor<Useless> constructor = Useless.class.getDeclaredConstructor();
    assertThat(Modifier.isPrivate(constructor.getModifiers())).isTrue();
    constructor.setAccessible(true);
    Useless object = constructor.newInstance();
  }

  // Test should and will fail
  @Test
  public void canTriggerUnsupportedOperationExceptionUsingReflection()
      throws NoSuchMethodException, InstantiationException, IllegalAccessException,
          InvocationTargetException {
    Constructor<UselessException> constructor = UselessException.class.getDeclaredConstructor();
    assertThat(Modifier.isPrivate(constructor.getModifiers())).isTrue();
    constructor.setAccessible(true);
    UselessException object = constructor.newInstance();
  }
}
