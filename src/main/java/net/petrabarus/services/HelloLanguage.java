/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package net.petrabarus.services;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum HelloLanguage implements org.apache.thrift.TEnum {
  ENGLISH(0),
  FRENCH(1),
  SPANISH(2);

  private final int value;

  private HelloLanguage(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static HelloLanguage findByValue(int value) { 
    switch (value) {
      case 0:
        return ENGLISH;
      case 1:
        return FRENCH;
      case 2:
        return SPANISH;
      default:
        return null;
    }
  }
}
