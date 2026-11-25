/**
 * Name: Rusho Binnabi
 * Date: 11/24/2026
 * Project: Example YouTube Prompt.
 */

import java.util.*;

public class Example {

    // this code answer the question from this YouTube short: https://youtu.be/mu-sic1ySDU?si=ooOFUTsDVAFqItIy 
    
    private List<String> names;
    private int valueIndex;

    /**
     * this Exmaple() constructor initializes the objects and variables.
     */

    public Example() {
        names = new ArrayList<>();
        valueIndex = 0;
    }

    /**
     * this addToList() method adds an item to the list.
     * @param name the item being added.
     */

    public void addToList(String name) {
        names.add(name);
    }

    /**
     * this removeFromList() method removes an item from the list using its index.
     * @param name the item being removed.
     */

    public void removeFromList(String name) {
        valueIndex = names.indexOf(name);
        names.remove(valueIndex);
    }

    /**
     * this getList() method gets the list of items.
     * @return the list of items.
     */

    public List<String> getList(){
        return names;
    }

    /**
     * this answer() method answers the question from the prompt above.
     */

    public void answer() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(getList());
        TreeSet treeSet = new TreeSet<>(linkedHashSet);
        System.out.println(treeSet);
    }

    /**
     * this main() method runs the code.
     * @param args the code being run.
     */

    public static void main(String[] args) {
        Example e = new Example();
        e.addToList("1");
        e.addToList("1");
        e.addToList("1");
        e.addToList("2");
        e.addToList("5");
        e.addToList("3");
        e.addToList("2");
        e.answer();
    }

}