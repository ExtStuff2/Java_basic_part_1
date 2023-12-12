package hw10;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetTasks {
    public static ArrayList saveSameObjects(HashSet hashSet, HashSet hashSet1) {
        ArrayList result = new ArrayList<>();
        for (Object object : hashSet) {
            for (Object object1 : hashSet1) {
                if (object.equals(object1)) {
                    result.add(object);
                }
            }
        }
        return result;
    }

    public static boolean isHashSetEmpty(HashSet hashSet) {
        return hashSet.size() == 0;
    }
}
