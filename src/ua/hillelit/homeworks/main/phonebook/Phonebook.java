package ua.hillelit.homeworks.main.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Record> recordsList = new ArrayList<>();

    public boolean addRecord(Record record) {
        if (record == null) {
            return false;
        }
        recordsList.add(record);
        return true;
    }

    public Record findRecord(String name) {
        for (Record record : recordsList) {
            if (name.equals(record.getName())) {
                return record;
            }
        }
        return null;
    }

    public List<Record> findAllRecords(String name) {
        List<Record> list = new ArrayList<>();
        for (Record record : recordsList) {
            if (name.equals(record.getName())) {
                list.add(record);
            }
        }
        return list;
    }
}
