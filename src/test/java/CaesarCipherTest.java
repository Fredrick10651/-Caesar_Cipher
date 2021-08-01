import org.junit.Test;



import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Test
    public void CaeserCipher_instanceOf_Object() {
        CaesarCipher testCaeserCipher = new CaesarCipher();
                assertTrue(testCaeserCipher instanceof CaesarCipher);
    }

    @Test
    public void CaeserCipher_takeStringInput_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "rcuuyqtf";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("password", 2));
    }

    @Test
    public void CaeserCipher_enableUpperCaseInput_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "RCUUYQTF";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("PASSWORD", 2));
    }

    @Test
    public void CaeserCipher_doEncryption_string(){
        CaesarCipher testCaeserCipher =new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "rcuuyqtf";
        assertEquals(expectedOutput, testCaeserCipher.doCaesarCipher("password", 2));
    }

    @Test
    public void CaeserCipher_unDoDecryption_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput = new String();
        expectedOutput = "password";
        assertEquals(expectedOutput, testCaeserCipher.unDoCaeserCipher( "rcuuyqtf", 2));
    }

    @Test
    public void unDoCaeserCipher_insertsUpperCaseLetters_string(){
        CaesarCipher testCaeserCipher = new CaesarCipher();
        String expectedOutput ="HEX";
        assertEquals(expectedOutput, testCaeserCipher.unDoCaeserCipher("EBU", 3));
    }
    }