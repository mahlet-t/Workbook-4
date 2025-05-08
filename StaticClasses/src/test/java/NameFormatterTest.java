import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @org.junit.jupiter.api.Test
    void testFormatFirstLastName() {
        String actual=NameFormatter.format("Mahlet","Tefera");
        assertEquals("Tefera, Mahlet",actual);

    }

    @org.junit.jupiter.api.Test
    void testFormatFullNamePart5() {
        String input="Dr. Mel B Johnson, PhD";
        String actual=NameFormatter.format(input);
        assertEquals("Johnson, Dr. Mel B, PhD",actual);
    }

    @org.junit.jupiter.api.Test
    void testFormatFullNamePart4() {
        String input="Mel B Johnson, PhD";
        String actual=NameFormatter.format(input);
        assertEquals("Johnson, Mel B, PhD",actual);
    }
}