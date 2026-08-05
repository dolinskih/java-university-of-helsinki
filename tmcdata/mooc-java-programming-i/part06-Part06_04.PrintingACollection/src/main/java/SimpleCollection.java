
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        if (this.elements.size() == 0) {
            return "The collection " + this.name + " is empty.";
        } 

        if (this.elements.size() == 1) {
            return "The collection " + this.name + " has 1 element:\n" + elements.get(0);
        }

        String elementsListed = "";
        for (int i = 0; i < this.elements.size(); i++) {
            if (i != this.elements.size() - 1) {
                elementsListed += this.elements.get(i) + "\n";
            } else {
                elementsListed += this.elements.get(i);
            }
        }

        return "The collection " + this.name + " has " + this.elements.size() + " elements:\n" + elementsListed;
    }    
}
