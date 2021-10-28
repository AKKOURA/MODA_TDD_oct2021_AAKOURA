import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Dictionary {
   private String name ;


    Map<String, String> translations ;


    public Dictionary(String name) {
        this.name=name;
        this.translations = new HashMap<>();


    }
    public String getNom() {
        return this.name;
    }


    public boolean isEmpty() {
        return false;
    }

    public void addTranslation(String contre, String against) {

        translations.put(contre,against);
    }

    public String getTranslation(String contre) {
        return  translations.get(contre);
    }
}

