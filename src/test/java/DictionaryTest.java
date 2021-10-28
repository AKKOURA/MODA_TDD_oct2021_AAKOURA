import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class DictionaryTest {
    Dictionary dict;
    public DictionaryTest() {

    }
    @BeforeClass
    void setUpClass()
    {

    }

    @AfterClass
    void tearDownClass()
    {
    }

    @Test
    public void testCreateDictionary() {
        Assert.assertEquals(this.dict, new Dictionary("Exemple"));
    }
    @Test
    public void testDictionaryName() {
        Assert.assertEquals(dict.getNom(), "Example");
    }


}
