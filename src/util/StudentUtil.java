package util;


import classes.Student;
import interfaces.StudentInfo;

import java.util.Collection;

import java.util.Spliterator;
import java.util.TreeSet;

public class StudentUtil implements StudentInfo {
    private static final int MAX_INDEX_OF_STUDENT_INFO_ARRAY = 9;
    private static final int RANDOM_STUDENT = (int) Math.floor(Math.random() * MAX_INDEX_OF_STUDENT_INFO_ARRAY);

    public static TreeSet<Student> createTreeSet(int size) {
        TreeSet<Student> treeSet = new TreeSet<>();
        filler(size, treeSet);
        return treeSet;
    }

    public static Student studentGenerator(int n) {
        Student student;
        if (n > MAX_INDEX_OF_STUDENT_INFO_ARRAY) {
            student = new Student(STUDENT_NAME[RANDOM_STUDENT], STUDENT_AGE[RANDOM_STUDENT]);
        } else {
            student = new Student(STUDENT_NAME[n], STUDENT_AGE[n]);
        }
        return student;

    }

    public static void filler(int objectsNumber, Collection<Student> someCollection) {
        for (int i = 0; i < objectsNumber; i++) {
            someCollection.add(studentGenerator(i));
        }
    }

    public static void displayTreeSet(TreeSet<Student> ts) {
        for (Student t : ts) {
            System.out.println(t);
        }
    }

    //displayEvenStudent() displays all even object of class Student from some TreeSet
    public static void displayEvenStudent(TreeSet<Student> ts) {
        int divider = 2;
        int count = ts.size() / divider;
        Spliterator<Student> split = ts.spliterator();
        for (int i = 0; i <= count; i++) {
            //Method tryAdvance() can be used to display elements of TreeSet.
            //Here 'a' is object from TreeSet.
            //The first method call will iterate over the odd elements of the TreeSet and
            //print the string "Even student: ",
            //and the second method call will print the even elements of the TreeSet
            split.tryAdvance(a -> System.out.println("Even student:"));
            split.tryAdvance(System.out::println);
        }
    }

    //deleteOddStudent() removes all odd objects of class Student from some TreeSet and displays new TreeSet
    public static void deleteOddStudent(TreeSet<Student> ts) {
        int divider = 2;
        int count = ts.size() / divider;
        System.out.println("\nRemoving odd students from TreeSet...\nNew TreeSet:");

        for (int i = 0; i < count; i++) {
            //To remove a specific element from a TreeSet,
            //it's easiest to convert it to an array
            ts.remove(ts.toArray()[i]);
        }
        displayTreeSet(ts);

    }

}
