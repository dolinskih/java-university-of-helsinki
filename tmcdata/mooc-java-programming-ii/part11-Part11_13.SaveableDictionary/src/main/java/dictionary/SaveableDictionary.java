package dictionary;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.io.PrintWriter;
import java.nio.file.Paths;

public class SaveableDictionary {
    private Map<String, String> translations;
    private String file;

    public SaveableDictionary() {
        this.translations = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public boolean load() {
        try {
            Scanner fileReader = new Scanner(Paths.get(this.file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");

                this.add(parts[0], parts[1]);
            }
            fileReader.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        if(!this.translations.containsKey(words)) {
            this.translations.put(words, translation);
        }
    }

    public String translate(String word) {
        if (this.translations.containsKey(word)) {
            return this.translations.get(word);
        }

        for (String dictWord : this.translations.keySet()) {
            if (this.translations.get(dictWord).equals(word)) {
                return dictWord;
            }
        }

        return null;
    }

    public void delete(String word) {
        Iterator<String> iterator = this.translations.keySet().iterator();

        while (iterator.hasNext()) {
            String currentWord = iterator.next();
            if (currentWord.equals(word) || this.translations.get(currentWord).equals(word)) {
                iterator.remove();
            }
        }
    }

    public boolean save() {
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String word : this.translations.keySet()) {
                writer.println(word + ":" + this.translations.get(word));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
