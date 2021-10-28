import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertTrue;


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
        assertTrue(dict.isEmpty());
    }
    @Test
     public void testOneTranslation() {
         dict.addMultipleTranslation("contre", List.of("against"));
         dict.addMultipleTranslation("aisha", List.of("emma"));
         assertThat(dict.getMultipleTranslations("contre"), equalTo(List.of("against")));
         assertThat(dict.getMultipleTranslations("aisha"),equalTo(List.of("emma")));

    }

    @Test
    public void testTwoWayTranslation() {
        dict. addMultipleTranslation("contre", List.of("jj", "kk", "ll"));
        assertThat(dict.getMultipleTranslations("contre"), containsInAnyOrder("jj", "kk","ll"));

    }



}
