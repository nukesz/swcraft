package org.swcraft.javase.collections.puzzle;

import java.util.HashSet;
import java.util.Set;

public class Person {
    
    private final String firstName;
    private final String lastName;
    
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName; 
    }
    
    public boolean equals(Object other) {
        if (!(other instanceof Person)) {
            return false;
        }
        Person p = (Person) other;
        return p.firstName.equals(firstName) && p.lastName.equals(lastName);
    }
    
    public static void main(String[] args) {
        Set<Person> people = new HashSet<>();
        people.add(new Person("John", "Doe"));
        System.out.println(people.contains(new Person("John", "Doe")));
    }
}

