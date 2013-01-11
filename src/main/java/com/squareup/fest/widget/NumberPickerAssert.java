// Copyright 2013 Square, Inc.
package com.squareup.fest.widget;

import android.widget.NumberPicker;

import static org.fest.assertions.api.Assertions.assertThat;

public class NumberPickerAssert
    extends AbstractLinearLayoutAssert<NumberPickerAssert, NumberPicker> {
  public NumberPickerAssert(NumberPicker actual) {
    super(actual, NumberPickerAssert.class);
  }

  public NumberPickerAssert hasDisplayedValues(String[] values) {
    isNotNull();
    String[] actualValues = actual.getDisplayedValues();
    assertThat(actualValues) //
        .overridingErrorMessage("Expected displayed values <%s> but was <%s>.", values,
            actualValues) //
        .isEqualTo(values);
    return this;
  }

  public NumberPickerAssert hasMaxValue(int value) {
    isNotNull();
    int actualValue = actual.getMaxValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected maximum value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }

  public NumberPickerAssert hasMinValue(int value) {
    isNotNull();
    int actualValue = actual.getMinValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected minimum value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }

  public NumberPickerAssert hasValue(int value) {
    isNotNull();
    int actualValue = actual.getMaxValue();
    assertThat(actualValue) //
        .overridingErrorMessage("Expected value <%s> but was <%s>.", value, actualValue) //
        .isEqualTo(value);
    return this;
  }

  public NumberPickerAssert isWrappingSelectorWheel() {
    isNotNull();
    assertThat(actual.getWrapSelectorWheel()) //
        .overridingErrorMessage("Expected to be wrapping selector wheel but was not.") //
        .isTrue();
    return this;
  }

  public NumberPickerAssert isNotWrappingSelectorWheel() {
    isNotNull();
    assertThat(actual.getWrapSelectorWheel()) //
        .overridingErrorMessage("Expected to not be wrapping selector wheel but was.") //
        .isFalse();
    return this;
  }
}
