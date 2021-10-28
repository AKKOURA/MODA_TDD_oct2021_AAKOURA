import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;



public class DictionaryTest {
    Dictionary dict;
    public DictionaryTest() {

    }
    @BeforeEach
    void setUpClass()
    {
       this.dict=new Dictionary("Exemple");
    }

    @AfterClass
    void tearDownClass()
    {
    }

    @Test
    public void testDictionaryName() {
        Assert.assertEquals(this.dict.getNom(), "Exemple");
    }

}
