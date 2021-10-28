import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertFalse;


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
    //Data
    @DataProvider(name = "translation")
    public Object[][] createWinData() {
        return new Object[][] {
                { "contre", "against" },
                {"aisha","emma"}
        };
    }


    @Test
    public void testDictionaryName() {

        assertThat(dict.getNom(), equalTo("Exemple"));
        //Assert.assertEquals(this.dict.getNom(), "Exemple");
    }
    @Test
    public void testDictionaryIsEmpty() {
        assertFalse(dict.isEmpty());
    }
    @Test
     public void testOneTranslation() {
         dict.addTranslation("contre", "against");
         dict.addTranslation("aisha", "emma");
         assertThat(dict.getTranslation("contre"), equalTo("against"));
         assertThat(dict.getTranslation("aisha"), equalTo("emma"));

    }



}
