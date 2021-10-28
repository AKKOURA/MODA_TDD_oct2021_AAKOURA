import java.util.*;

public class Dictionary {
   private String name ;


    Map<String, List<String>> translations ;


    public Dictionary(String name) {
        this.name=name;
        this.translations = new HashMap<>();
        for(int i=0;i<this.translations.size();i++){

        }



    }
    public String getNom() {
        return this.name;
    }


    public boolean isEmpty() {
      if (this.translations.isEmpty()){
          return true;
      }
      return false;
    }

    public void addMultipleTranslation(String contre, List<String> against) {

        translations.put(contre,against);
    }

    public List<String> getMultipleTranslations(String contre) {
        return  translations.get(contre);
    }

}

