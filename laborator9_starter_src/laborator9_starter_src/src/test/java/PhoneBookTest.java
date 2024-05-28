import org.junit.jupiter.api.BeforeEach;
import org.testng.annotations.Test;
import ro.ulbs.paradigme.lab9.PhoneAppException;
import ro.ulbs.paradigme.lab9.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookTest {

    @BeforeEach
    void init() {
        PhoneBook pb = new PhoneBook();
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
    void testReadPhoneEntry() {
    }
    @Test
    void testReadPhoneEntryMultipleSpaces() {
    }
    @Test
    void testReadPhoneEntryNoType() {
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
    //entries that have isMultiple=true other have isMultiple=false
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
    void testSaveOccurencies() throws PhoneAppException {
//some entries have isMultiple = true
    }

    @Test
    void validateEmptyPath() {
        Object pb;
        Exception exception = assertThrows(PhoneAppException.class, () ->
                pb.validatePath("", "param1"));
        assertEquals("Missing param1" , exception.getMessage());
    }
}
