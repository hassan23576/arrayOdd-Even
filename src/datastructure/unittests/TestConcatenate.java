package datastructure.unittests;


import org.junit.Assert;
import org.junit.Test;

public class TestConcatenate {






        @Test
        public  void testThatTwoLowercaseStringsConcatenateCorrectly(){
            String actualOutcome = Concatenator.concatenateString("good", "morning");
            String expectedOutcome = "goodmorning";
            Assert.assertEquals(actualOutcome, expectedOutcome);


        }

        @Test
        public void testThatConcatenateWithEmptyStringWorks() {
            String actualOutcome = Concatenator.concatenateString("good", "");
            String expectedOutcome = "good";
            Assert.assertEquals(actualOutcome, expectedOutcome);

    }

        @Test
        public void testThatConcatenateWithStringNumbericalsWorks() {
            String actualOutcome = Concatenator.concatenateString("35", "24");
            String expectedOutcome = "3524";
            Assert.assertEquals(actualOutcome, expectedOutcome);


        }






}
