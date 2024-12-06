package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.StringManipulator;

public class StringManipulatorTest {
   StringManipulator stringManipulator = new StringManipulator();

   @Test
   public void testReverse() {
      assertEquals("ELPmAxE", stringManipulator.reverse("ExAmPLE"));

   }

   @Test
   public void testIsPalindrome() {
      assertEquals(false, stringManipulator.isPalindrome("example"));
      assertEquals(true, stringManipulator.isPalindrome("ELpmpLE"));
   }

   @Test
   public void testIsContained() {
      assertEquals(true, stringManipulator.isContained("ExAmPLE", "Ex"));
      assertEquals(false, stringManipulator.isContained("ELpmpLE", "ex"));

   }

   @Test
   public void testNumberRemoved() {
      assertEquals("ExAmPLE", stringManipulator.numberRemoved("ExAm1PLE2"));
      // Your code here
   }

   @Test
   public void testUpperString() {
      // Your code here
      assertEquals("EXAMPLE", stringManipulator.upperString("ExAmPLE"));
   }

   @Test
   public void testLowerString() {
      // Your code here
      assertEquals("example", stringManipulator.lowerString("ExAmPLE"));
   }

   @Test
   public void testCapitalString() {
      // Your code here
      assertEquals("Example String", stringManipulator.capitalString("example string"));
   }

   @Test
   public void testCountVowels() {
      // Your code here
      assertEquals(3, stringManipulator.countVowels("Example"));
   }

   @Test
   public void testCountWords() {
      // Your code here
      assertEquals(4, stringManipulator.countWords("Hello, how are you?"));
   }

   @Test
   public void testFindSubstringIndex() {
      // Your code here
      assertEquals(5, stringManipulator.findSubstringIndex("Java programming", "programming"));
      assertEquals(-1, stringManipulator.findSubstringIndex("Java programming", "Programming"));
   }

   @Test(timeout = 1000)
   public void testReverseWords() {
      assertEquals("You Are How World Hello", stringManipulator.reverseWords("Hello World How Are You"));
      // Your code here
   }
}
