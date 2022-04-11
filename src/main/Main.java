package main;

import classes.Book;
import classes.Good;
import classes.Student;
import util.BookUtil;
import util.StudentUtil;
import util.UserUtil;
import util.Util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        //1st part of hometask
        System.out.println("THE FIRST PART OF HOMETASK\n");

        //Creating of LinkedList with books
        LinkedList<Book> linkedList = BookUtil.createLinkedList(20);
        LinkedList<Book> linkedList1 = BookUtil.createLinkedList(20);
        Util.showCollection(linkedList);

        //Removing 7th object from LinkedList
        System.out.println("\nRemoving 7th book...");
        linkedList.remove(6);
        System.out.println("List without 7th object: \n");
        Util.showCollection(linkedList);


        //2nd part of hometask
        System.out.println("\nTHE SECOND PART OF HOMETASK\n");

        //creating of HashSet with books
        HashSet<Book> hashSet = BookUtil.createHashSet(25);
        Util.showCollection(hashSet);
        System.out.println("\nThere are only " + hashSet.size() + " objects because HashSet doesn't save identical objects," +
                " and we have 5 identical objects");

        //Since the HashSet cannot be sorted, we transform it into an ArrayList
        ArrayList<Book> list = BookUtil.createArrayList(hashSet);
        //Next, arrange the elements in it as in the LinkedList from the first part of Hometask
        BookUtil.makeTheSame(linkedList1, list);
        // And select those books whose titles begin with a vowel
        System.out.println("\nBooks whose names begin with a vowel:");
        BookUtil.vowelFilter(list);


        //3rd part of hometask
        System.out.println("\nTHE THIRD PART OF HOMETASK\n");

        //Creating a new ArrayList with books
        ArrayList<Book> arrayList = BookUtil.createArrayList(25);

        //Sorting ArrayList by different scenarios
        BookUtil.sortBy(arrayList, 0); //variant 0 - sorting by name
        BookUtil.sortBy(arrayList, 1); //variant 1 - sorting by surname
        BookUtil.sortBy(arrayList, 2); //variant 2 - sorting by second name


        //The 4th part of hometask
        System.out.println("\nTHE FOURTH PART OF HOMETASK");
        //creating TreeSet with students
        TreeSet<Student> treeSet = StudentUtil.createTreeSet(10);

        System.out.println("All students: ");
        //displaying a treeSet
        Util.showCollection(treeSet);

        //displaying even students
        StudentUtil.displayEvenStudent(treeSet);
        //removing odd students
        StudentUtil.deleteOddStudent(treeSet);


        //The 5th part of hometask
        System.out.println("\nTHE FIFTH PART OF HOMETASK");
        UserUtil.showFriends(30, null);

        //Generating of random String
        Good.getRandomString(15);
    }

}
