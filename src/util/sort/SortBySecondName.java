package util.sort;

import classes.Book;

public class SortBySecondName extends Sort {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getSecondName().compareTo(o2.getSecondName());
    }
}
