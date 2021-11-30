import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    //This is my List Object
    private final List<String> languages = new ArrayList<>();

    //Returns a true or false
    public boolean isEmpty() {
        //True if empty
        if (languages.size() == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public void addLanguage(String language) {
        /*
        *ArrayList can contain duplicates. The IllegalArgumentException prevents
        * the addition of a second language object with the same name
        */
        if (languages.contains(language) == true) {
            throw new IllegalArgumentException(language + " is already in the List");
        }
        else {
            languages.add(language);
        }
    }

    public void removeLanguage(String language) {
        /*
        *Does not accept input if the language given in the arguments 
        *is not a language in the list
        */
        if (languages.contains(language) == true) {
            languages.remove(language); 
        }
        else {
            throw new IllegalArgumentException(language + " is not in the List");
        }
    }
    //Returns the first element in the ArrayList
    public String firstLanguage() {
        return languages.get(0);
    }
    //Return size of ArrayList
    public int count() {
        return languages.size();
    }
    //Returns true of false
    public boolean containsLanguage(String language) {
        if (languages.contains(language) == true) {
            return true;
        }
        else {
            return false;
        }
    }
    //Returns two booleans
    public boolean isExciting() {
        return containsLanguage("Java") || containsLanguage("Kotlin");
    }
}
