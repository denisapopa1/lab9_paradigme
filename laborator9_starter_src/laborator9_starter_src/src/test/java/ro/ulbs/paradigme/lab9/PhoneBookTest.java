package ro.ulbs.paradigme.lab9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    private PhoneBook pb;

    @BeforeEach
    void init() {
        pb = new PhoneBook();
    }


    @Test
    void validateNullPath() {

    }

    @Test
    void validateEmptyPath() {
    }

    @Test
    void testParseOneLine() {
    }

    @Test
    void testParseOneNullLine() {
    }


    @Test
    void testParseOneLineMultipleSpaces() {
    }

    @Test
    void testParseOneLineNoType() {
    }

    @Test
    void testReadPhoneEntry()  {

    }

    @Test
    void testReadPhoneEntryMultipleSpaces()
            throws PhoneAppException {
    }

    @Test
    void testReadPhoneEntryNoType()  {
    }


    @Test
    void testSortbyName() {

    }

    @Test
    void testSortbyNameAndSurname() {

    }


    @Test
    void testSortbyNameSurnameAndType() {

    }

    @Test
    void testCountOccurenciesOnce() {

    }

    @Test
    void testCountOccurenciesTwice() {

    }

    @Test
    void testCountOccurenciesMixed() {

    }

    @Test
    void testPrint() {
    }

    @Test
    void testSaveSimple() throws PhoneAppException{
        //all entries have isMultiple = false
    }

    @Test
    void testSaveOccurencies() throws PhoneAppException{
        //some entries have isMultiple = true
    }

}