package hw10;

import java.util.ArrayList;

public class ArrayListCompare {
    public static boolean isArrayListSame(ArrayList arrayList, ArrayList arrayList1) {
        return arrayList.equals(arrayList1);
    }

    public static void replaceSecondElem(ArrayList arrayList, Object secondElem) {
        if (arrayList.size() >= 2 && (arrayList.get(0).getClass() == secondElem.getClass())) {
            arrayList.remove(1);
            arrayList.add(1, secondElem);
        }
    }
}
