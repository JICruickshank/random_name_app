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
    }

    public List<String> getNames(){
        return this.names;
    }

    public void setNames(ArrayList<String> names) {
        this.names = names;
    }

    public String pickRandomName(){
        Collections.shuffle(names);
        return names.remove(0);
    }
}
