package ua.hillelit.homeworks.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Occurrence {

    private String name;
    private int occurrence;
    private List<Occurrence> structure = new ArrayList<>();

    public Occurrence() {
    }

    public Occurrence(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public static int countOccurrence(List<String> list, String str) {
        int counter = 0;
        for (String s : list) {
            if (str.equals(s)) {
                counter++;
            }
        }
        return counter;
    }

    public static List<Integer> toList(Integer []array) {
        List<Integer> list = Arrays.asList(array);
        for (Integer integer : list) {
            System.out.println(integer);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < uniqueList.size(); j++) {
                if(list.get(i).equals(uniqueList.get(j)) == false) {
                    uniqueList.add(list.get(i));
                } else {
                    break;
                }
            }
        }
        return uniqueList;
    }

    public static void calcOccurrence(List<String> list) {
        List<String> copyList = new ArrayList<>();
        copyList.addAll(list);
        int counter;
        for (int i = 0; i < copyList.size(); i++) {
            if(copyList.get(i) == null) {
                break;
            }
            counter = 0;
            String s = copyList.get(i);
            for (int j = 0; j < copyList.size(); j++) {
                if(s.equals(copyList.get(j))) {
                    counter++;
                    copyList.set(j, null);

                }
            }
            System.out.println(s + " - " + counter);

        }

    }

    public static void findOccurrence(List<String> list) {
        List<String> copyList = new ArrayList<>();
        copyList.addAll(list);
        Occurrence occ = new Occurrence();
        int counter;
        for (int i = 0; i < copyList.size(); i++) {
            if(copyList.get(i) == null) {
                break;
            }
            counter = 0;
            String s = copyList.get(i);
            for (int j = 0; j < copyList.size(); j++) {
                if(s.equals(copyList.get(j))) {
                    counter++;
                    copyList.set(j, null);

                }
            }
            Occurrence occ1 = new Occurrence(s, counter);
            occ.structure.add(occ1);
        }
        for (Occurrence o : occ.structure) {
            System.out.println(o.toString());
        }
    }

    @Override
    public String toString() {
        return "Occurrence{" +
                "name='" + name + '\'' +
                ", occurrence=" + occurrence +
                '}';
    }
}
