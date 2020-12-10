package com.rev.itemThree;

public class RevInstance {
  public static final int ZERO = 0;

  public static final RevInstance INSTANCE = new RevInstance(ZERO);

  private int value;

  private RevInstance(int value) {
    this.value = value;
  }

  public static RevInstance getInstance() {
    return INSTANCE;
  }

  public int getValue() {
    return value;
  }
}
