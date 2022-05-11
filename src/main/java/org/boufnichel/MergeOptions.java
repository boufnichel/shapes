package org.boufnichel;

public enum MergeOptions {

  SPIKE("SPIKE"),
  I("I");

  private final String option;


  MergeOptions(final String option) {
    this.option = option;
  }

  @Override
  public String toString() {
    return option;
  }
}
