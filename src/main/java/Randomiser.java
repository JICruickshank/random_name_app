import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Randomiser {

    private Randomiser randomiser;
    private ArrayList<String> names;



    public Randomiser() {
        this.names = new ArrayList<String>();
        names.add("Jim");
        names.add("Sarah");
        names.add("Ria");
        names.add("Jean");
        names.add("J");
        names.add("Graeme");
        names.add("Paul");
        names.add("Old Danny");
        names.add("Young Danny");
        names.add("Emma");
        names.add("Victor");
        names.add("Chris");
        names.add("Steven");
        names.add("Ed");
        names.add("Debbie");
        names.add("Victor");
        names.add("Christy");
        names.add("Ellie");


    }

    public ArrayList<String> getNames(){
        return this.names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String pickRandomName(){
        Collections.shuffle(names);
        return names.remove(0);
    }

    public List<String> pickRandomPair(){
        List<String> pair = new ArrayList<String>();
        pair.add(pickRandomName());
        pair.add(pickRandomName());
        return pair;
    }

    public List<String> pickRandomGroup(int size) {
        List<String> group = new ArrayList<String>();
        for (int i = 0; i < size;  i++) {
            group.add(pickRandomName());
        }
        return group;
    }
}
