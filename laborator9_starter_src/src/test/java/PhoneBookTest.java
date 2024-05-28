import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import ro.ulbs.paradigme.lab9.PhoneAppException;
import ro.ulbs.paradigme.lab9.PhoneBook;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PhoneBookTest
{
    @BeforeEach
    void init() {
        PhoneBook pb = new PhoneBook();
    }
    @Test
    public void validateNullPath() {

    }

    @Test
    public void testParseOneLine() {

    }
    @Test
    public void testParseOneNullLine() {

    }
    @Test
    public void testParseOneLineMultipleSpaces() {

    }
    @Test
    public void testParseOneLineNoType() {

    }
    @Test
    public void testReadPhoneEntry() {

    }
    @Test
    public void testReadPhoneEntryMultipleSpaces() {

    }
    @Test
    public void testReadPhoneEntryNoType() {

    }
    @Test
    public void testSortbyName() {

    }
    @Test
    public void testSortbyNameAndSurname() {

    }
    @Test
    public void testSortbyNameSurnameAndType() {


    }
    @Test
    public void testCountOccurenciesOnce() {

    }

    @Test
    public void testCountOccurenciesTwice() {

    }

    @Test
    public void testCountOccurenciesMixed() {

    }
    @Test
    public void testPrint() {

    }
    @Test
    public void testSaveSimple() throws PhoneAppException{
//all entries have isMultiple = false
    }
    @Test
    public void testSaveOccurencies() throws PhoneAppException {

//some entries have isMultiple = true
    }

    @Test
    public void validateEmptyPath() {
        PhoneBook pb = new PhoneBook();;
        Exception exception = assertThrows(PhoneAppException.class, () ->
                pb.validatePath("", "param1"));
        assertEquals("Missing param1" , exception.getMessage());
    }

}
