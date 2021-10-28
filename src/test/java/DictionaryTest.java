import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


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

        assertThat(dict.getNom(), equalTo("Exemple"));
        //Assert.assertEquals(this.dict.getNom(), "Exemple");
    }
    @Test
    public void testDictionaryIsEmpty() {
        Assert.assertFalse(dict.isEmpty());
    }

}
