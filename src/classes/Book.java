package classes;

import java.util.Objects;

public class Book {
    private String bookName;
    private String name;
    private String surname;
    private String secondName;

    //Constructors
    public Book() {
    }

    public Book(String bookName, String name, String surname, String secondName) {
        this.bookName = bookName;
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
    }

    //Getters and setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    //Override toString, hashCode, equals
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName) && Objects.equals(name, book.name) && Objects.equals(surname, book.surname) && Objects.equals(secondName, book.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, name, surname, secondName);
    }


}

