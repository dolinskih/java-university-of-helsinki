import java.util.HashMap;
import java.util.ArrayList;

public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> translations;

    public DictionaryOfManyTranslations() {
        this.translations = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.translations.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> translationsList = this.translations.get(word);
        translationsList.add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.translations.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        if (this.translations.containsKey(word)) {
            this.translations.remove(word);
        }
    }
}
