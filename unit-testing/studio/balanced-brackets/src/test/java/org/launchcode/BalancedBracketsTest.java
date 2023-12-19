package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here

    @Test
    public void onlyBracketsReturnsTrue() {
        String message = "a single set of balanced brackets will return true.";

        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"), message);
    }

    @Test
    public void singleBracketsBeforeOtherCharacters() {
        String message = "a balanced brackets in front of another return true.";
        String testData = "[]LaunchCode";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAroundOtherCharacters() {
        String message = "a balanced brackets around other characters return true.";
        String testData = "[LaunchCode]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void singleBracketsAmongOtherCharacters() {
        String message = "a balanced brackets among other characters return true.";
        String testData = "Launch[Code]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }


    @Test
    public void tripleBalancedBrackets() {
        String message = "three consecutive pairs of brackets return true.";
        String testData = "[][][]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void tripleNestedBalancedBrackets() {
        String message = "Three nested brackets return true.";
        String testData = "[[[]]]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }



    //------ NEGATIVES ------
    @Test
    public void singleOpeningBrackets() {
        String message = "a single opening bracket return false.";
        String testData = "[";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void singleClosingBrackets() {
        String message = "a single closing bracket return false.";
        String testData = "]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }


    @Test
    public void reversedBrackets() {
        String message = "a set of reversed bracket return false.";
        String testData = "][";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }

    @Test
    public void  singleOpeningBracketAmongOtherCharacters() {
        String message = "a single opening bracket among other characters return false.";
        String testData = "[LaunchCode";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void  singleClosingBracketAmongOtherCharacters() {
        String message = "a single closing bracket among other characters return false.";
        String testData = "LaunchCode]";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertFalse(result, message);
    }

    @Test
    public void  reversedBracketAmongOtherCharacters() {
        String message = "reversed bracket among other characters return false.";
        String testData = "Launch]Code[";

        boolean result = BalancedBrackets.hasBalancedBrackets(testData);
        assertTrue(result, message);
    }



}


