package hw10;

import java.util.HashMap;

public class HashMapTasks {
    public static void copyAllFromOneHashMapToAnother(HashMap hashMapToCopyFrom, HashMap hashMapToCopyTo) {
        for (Object object : hashMapToCopyFrom.keySet()) {
            Object key = new String(object.toString());
            hashMapToCopyTo.put(key, hashMapToCopyFrom.get(key));
        }
    }

    public static boolean containsObject(HashMap hashMap, Object object) {

        if ((hashMap.containsValue(object) || hashMap.containsKey(object))
                || (hashMap.containsKey(object) && hashMap.containsValue(object))) {
            return true;
        }
        return false;
    }

    public static boolean containsObject(HashMap hashMap, Object object, char flag) {
        if (flag == 'k') {
            return hashMap.containsKey(object);
        }
        return hashMap.containsValue(object);
    }

}
