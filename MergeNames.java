
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        //throw new UnsupportedOperationException("Waiting to be implemented.");
        Map<String,String> newArray = new HashMap<>();
        for(String name1: names1){
            newArray.put(name1,"array1");
        }
        for(String name2: names2){
            newArray.put(name2,"array2");
        }
        String[] temp = (String[])newArray.keySet().toArray(new String[0]);
        return temp;
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}