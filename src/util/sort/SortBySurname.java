package util.sort;
import classes.Book;

public class SortBySurname extends Sort {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
