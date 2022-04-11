package util;

import classes.Book;
import interfaces.BookInfo;
import util.sort.SortByName;
import util.sort.SortBySecondName;
import util.sort.SortBySurname;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;


public class BookUtil implements BookInfo {

    private static final int MAX_INDEX_OF_BOOK_INFO_ARRAY = 19; //the number of indexes of arrays with book info
    private static final int RAND = (int) Math.floor(Math.random() * MAX_INDEX_OF_BOOK_INFO_ARRAY);//random number from 0 to 19


    //createLinkedList() creates new LinkedList and fills it by objects of class Book
    public static LinkedList<Book> createLinkedList(int size) {
        LinkedList<Book> linkedList = new LinkedList<>();
        filler(size, linkedList);
        return linkedList;
    }

    //createArrayList() creates new ArrayList
    public static ArrayList<Book> createArrayList(int size) {
        ArrayList<Book> arrayList = new ArrayList<>();
        filler(size, arrayList);
        return arrayList;
    }

    //Overloaded createArrayList() that takes some HashSet as a parameter.
    //New ArrayList will contain objects from this HashSet
    public static ArrayList<Book> createArrayList(HashSet<Book> hashSet) {
        return new ArrayList<>(hashSet);
    }

    //createHashSet() creates new HashSet
    public static HashSet<Book> createHashSet(int size) {
        HashSet<Book> hashSet = new HashSet<>();
        filler(size, hashSet);
        return hashSet;
    }


    //bookGenerator() generates objects of class Book
    private static Book bookGenerator(int n) { //The parameter of this method is the number of book from bookNameArray

        //If the parameter of this method exceeds the number of books,
        //random (0...19) book will be created as a new objects. The count of these objects = n - arrayLength.
        //For example, if I want to create 25 objects, 5 identical books will be created.
        Book book;
        if (n > MAX_INDEX_OF_BOOK_INFO_ARRAY) {
            book = new Book(BOOK_NAME_ARRAY[RAND], NAME_ARRAY[RAND], SURNAME_ARRAY[RAND], SECOND_NAME_ARRAY[RAND]);
        } else {
            book = new Book(BOOK_NAME_ARRAY[n], NAME_ARRAY[n], SURNAME_ARRAY[n], SECOND_NAME_ARRAY[n]);
        }
        return book;

    }


    //Method filler() takes as parameters the number of objects of class Book and some collection
    //and fills the collection by this number of objects
    private static void filler(int objectsNumber, Collection<Book> someCollection) {
        for (int i = 0; i < objectsNumber; i++) {
            someCollection.add(bookGenerator(i));
        }

    }

    //Method makeTheSame() takes as parameters two different Lists
    //and arranges objects from the second List as in the first
    public static void makeTheSame(List<Book> l1, List<Book> l2) {
        for (int o1 = 0; o1 < l2.size(); o1++) {
            int o2 = 0;
            while (!l1.get(o1).equals(l2.get(o2))) {
                o2++;
            }
            Collections.swap(l2, o2, o1);
        }
    }

    //Method vowelFilter() takes as parameter some List and
    //displays those books whose titles begin with vowels
    public static void vowelFilter(List<Book> l) {
        for (int i = 0; i < l.size(); i++) {
            if (BookUtil.bookGenerator(i).getBookName().matches("^(?i:[aeiouy]).*")) {
                System.out.println(l.get(i));
            }
        }
    }

    //sortBy() takes as parameters some List and variant of sorting from 0 to 2, where
    //variant 0 - sorting by name,
    //variant 1 - sorting by surname,
    //variant 2 - sorting by second name,
    //and displays list sorted by some parameter
    public static void sortBy(List<Book> list, int variantOfSorting) {

        switch (variantOfSorting) {
            case 0: {
                list.sort(new SortByName());
                System.out.println("\nSorting by name\n");
                Util.showCollection(list);
                break;
            }
            case 1: {
                list.sort(new SortBySurname());
                System.out.println("\nSorting by surname\n");
                Util.showCollection(list);
                break;
            }
            case 2: {
                list.sort(new SortBySecondName());
                System.out.println("\nSorting by second name\n");
                Util.showCollection(list);
                break;
            }

        }


    }


}

