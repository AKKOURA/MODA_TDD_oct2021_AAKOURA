public class Dictionary {
   private String name ;

    public Dictionary(String name) {
        this.name=name;

    }
    public String getNom() {
        return this.name;
    }


    public boolean isEmpty() {
        return name.isEmpty() ? true :false;
    }

}

