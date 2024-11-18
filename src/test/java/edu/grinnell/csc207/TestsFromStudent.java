package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Sarah Deschamps
 */
public class TestsFromStudent {
  /**
   * Checks whether adding a new value with the same key replaces the original value.
   * @throws Exception
   */
  @Test
  public void deschampsSarahTest1() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    // Add a bunch of values
    arr.set("The", "Cranberries");
    arr.set("Gillian", "Hills");
    arr.set("Elton", "John");
    try {
      assertEquals("Cranberries", arr.get("The"));
      assertEquals("Hills", arr.get("Gillian"));
      assertEquals("John", arr.get("Elton"));
    } catch (Exception e) {
      fail("Array does not contain expected value deschampsSarahTest1");
    } // try-catch
    arr.set("The", "Bangles");
    try {
      assertEquals("Bangles", arr.get("The"));
    } catch (Exception e) {
      fail("Array does not contain expected value deschampsSarahTest1");
    } // try-catch
  } // deschampsSarahTest1()

  /**
   * When replacing a value, it does not just add a new value.
   * @throws Exception
   */
  @Test
  public void deschampsSarahTest2() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    // Add a bunch of values
    arr.set("The", "Cranberries");
    arr.set("Gillian", "Hills");
    arr.set("Elton", "John");
    arr.set("The", "Bangles");
    try {
      assertEquals(3, arr.size());
    } catch (Exception e) {
      fail("Array is not expected length deschampsSarahTest2");
    } // try-catch
  } // deschampsSarahTest2()

  /**
   * Remove changes the size of the array instead of setting each value to null or empty.
   * @throws Exception
   */
  @Test
  public void deschampsSarahEdge1() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
    // Add a bunch of values
    arr.set("The", "Cranberries");
    arr.set("Gillian", "Hills");
    arr.set("Elton", "John");
    arr.remove("The");
    try {
      assertEquals(2, arr.size());
    } catch (Exception e) {
      fail("Remove does not change length deschampsSarahEdge1");
    } // try-catch
  } // deschampsSarahEdge1()

  /**
   * Checks whether set can handle an empty value
   * @throws Exception
   */
  @Test
  public void deschampsSarahEdge2() throws Exception {
    AssociativeArray<String, String> arr = new AssociativeArray<String, String>();

    // Add a null value
    try {
      arr.set("key", "");
    } catch (Exception e) {
      fail("Set cannot handle an empty value");
    } // try-catch
  } // deschampsSarahEdge2()
} // class TestsFromSam
