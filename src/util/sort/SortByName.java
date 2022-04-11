package util.sort;
import classes.Book;

public class SortByName extends Sort {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
