public class Dictionary {
   private String name ;

    public Dictionary(String name) {
        this.name=name;

    }
    public String getNom() {
        return this.name;
    }


    public boolean isEmpty() {
        return false;
    }

    public void addTranslation(String contre, String against) {
    }

    public String getTranslation(String contre) {
        return "against";
    }
}

