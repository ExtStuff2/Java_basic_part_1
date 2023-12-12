package hw10;

import hw10.abstractexample.CurrentAccount;
import hw10.phonebook.Contact;
import hw10.phonebook.PhoneBookImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        //task 10 1
        for (Colors colors1 : Colors.values()) {
            System.out.println(colors1);
        }

        //task 10 2
        for (Weekday weekday : Weekday.values()) {
            System.out.println("Day ->>" + weekday
                    + " Is weekday ->>" + Weekday.isWeekDay(weekday)
                    + " Is holiday ->>" + Weekday.isHoliday(weekday));
        }

        //task 10 3 (example taken from ->> https://www.w3resource.com/java-exercises/java-abstract-class-exercise-3.php)
        double ibal, damt, wamt;
        ibal = 5000.00;
        CurrentAccount currentAccount = new CurrentAccount("CA001", ibal);
        System.out.println("Current A/c: Initial Balace: $" + ibal);
        damt = 2500.00;
        currentAccount.deposit(1000.0);
        wamt = 1250.00;
        currentAccount.withdraw(3000.0);

        //task 10 4
        ArrayList<Student> studentArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentArrayList.add(new Student(i));
            System.out.println(studentArrayList.get(i));
        }

        //task 10 3 / 10 5
        PhoneBookImpl phoneBook = new PhoneBookImpl();

        phoneBook.createContact(new Contact("198178916781", "Karl"));
        phoneBook.createContact(new Contact("198178916782", "Moritz"));

        System.out.println(phoneBook.getAllContacts());

        phoneBook.deleteContact(phoneBook.getContact("Karl"));
        Contact contactToUpdate = phoneBook.getContact("Moritz");
        contactToUpdate.setPhoneNumber("279091892");
        phoneBook.updateContact(contactToUpdate);

        System.out.println(phoneBook.getAllContacts());
        System.out.println(phoneBook.getContact("Moritz"));

        //task 10 6
        ArrayListColors arrayListColors = new ArrayListColors();
        arrayListColors.addColor("Blue");
        arrayListColors.addColor("White");
        arrayListColors.addColor("Yellow");
        arrayListColors.removeColor("Blue");
        arrayListColors.colorsPrinter(arrayListColors.getColorsArrayList());

        //task 10 7
        System.out.println("Arrays equals ->> "
                + ArrayListCompare.isArrayListSame(arrayListColors.getColorsArrayList(), studentArrayList));

        //task 10 8
        ArrayListCompare.replaceSecondElem(arrayListColors.getColorsArrayList(), "Black");
        arrayListColors.colorsPrinter(arrayListColors.getColorsArrayList());

        //task 10 9
        LinkedList<String> l_list = new LinkedList<String>();
        l_list.add("Red");
        l_list.add("Green");
        l_list.add("Black");
        l_list.add("Orange");
        l_list.add("Orange");
        l_list.add("Pink");
        System.out.println(LinkedListTasks.getFirstOrLast(l_list, "Orange", 'l'));

        //task 10 10
        LinkedListTasks.replaceElems(l_list, "Pink", "White");
        LinkedListTasks.replaceElems(l_list, "Black", "White");
        System.out.println(l_list);

        //task 10 11
        HashSet<String> set = new HashSet<>();
        set.add("London");
        set.add("Potsdam");
        set.add("Schleswig-Holstein");
        HashSet<String> set1 = new HashSet<>();
        set1.add("Berlin");
        set1.add("London");
        set1.add("Schleswig-Holstein");
        System.out.println(HashSetTasks.saveSameObjects(set, set1));

        //task 10 12
        System.out.println(HashSetTasks.isHashSetEmpty(set));
        set.clear();
        System.out.println(HashSetTasks.isHashSetEmpty(set));

        //task 10 13
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        map.put("random", 10);
        map.put("random1", 30);
        map.put("random2", 20);
        HashMapTasks.copyAllFromOneHashMapToAnother(map, map1);
        System.out.println(map1);

        //task 10 14
        HashMap<Integer, Integer> map3 = new HashMap<>();
        map3.put(10, 10);
        System.out.println(HashMapTasks.containsObject(map1, "random", 'k'));
        System.out.println(HashMapTasks.containsObject(map3, 30));
    }
}
