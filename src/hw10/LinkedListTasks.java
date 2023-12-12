package hw10;

import java.util.LinkedList;

public class LinkedListTasks {
    public static int getFirstOrLast(LinkedList linkedList, Object object, char flag) {
        try {
            String indexes = "";
            for (int i = 0; i < linkedList.size(); i++) {
                if (object.equals(linkedList.get(i))) {
                    indexes += i;
                }
            }
            if (flag == 'f') {
                return Character.getNumericValue(indexes.charAt(0));
            }
            return Character.getNumericValue(indexes.charAt(indexes.length() - 1));
        } catch (Exception e) {
            System.out.println("Exception ->> " + e);
        }
        return -1;
    }

    public static void replaceElems(LinkedList linkedList, Object objectToReplace, Object objectToReplaceWith) {
        int index = -1;
        index = linkedList.indexOf(objectToReplace);
        linkedList.remove(objectToReplace);
        linkedList.add(index, objectToReplaceWith);
    }
}
