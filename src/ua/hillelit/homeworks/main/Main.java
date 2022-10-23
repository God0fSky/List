package ua.hillelit.homeworks.main;

import ua.hillelit.homeworks.main.phonebook.Phonebook;
import ua.hillelit.homeworks.main.phonebook.Record;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("melon");
        stringList.add("lime");
        stringList.add("banana");
        stringList.add("limon");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("melon");
        stringList.add("apple");
        stringList.add("orange");
        stringList.add("melon");
        stringList.add("lime");
        stringList.add("banana");
        stringList.add("limon");

        System.out.println(Occurrence.countOccurrence(stringList, "gfh"));
        Occurrence.calcOccurrence(stringList);
        Occurrence.findOccurrence(stringList);
        System.out.println();

        Phonebook pb = new Phonebook();
        pb.addRecord(new Record("Bib", "123"));
        pb.addRecord(new Record("Peter", "789"));
        pb.addRecord(new Record("Karen", "1001"));
        pb.addRecord(new Record("Bib", "456"));
        pb.addRecord(new Record("Claus", "2992"));

        System.out.println(pb.findRecord("Bib"));
        List<Record> findRecords = pb.findAllRecords("Bib");
        for (Record findRecord : findRecords) {
            System.out.println(findRecord);
        }
    }


}
