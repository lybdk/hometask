package classes;

import java.util.List;
import java.util.Objects;

public class User {

    private String name;
    private String surname;
    private Long id;
    private List<User> friends;

    //Constructors
    public User() {
    }

    public User(String name, String surname, Long id, List<User> friends) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.friends = friends;
    }


    //Getters and setters
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
    }

    //Override methods of class Object
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(id, user.id) && Objects.equals(friends, user.friends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, id, friends);
    }

    @Override
    public String toString() {
        return "name:" + name;
    }
}

