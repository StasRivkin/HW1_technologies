package controller;

import dto.model.Address;
import dto.model.Person;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class PersonCreateAppl {
    public static void main(String[] args) {
        Set<Person> persons = new HashSet<>();
        Person p1 = new Person(1000, "John", LocalDate.of(1990, 9, 12), new Address("Rehovot", "Plaut", 10, 4));
        System.out.println(p1);
//---------------------- 1 Task
        Person p2 = new Person(2000, "Peter", LocalDate.of(1989, 3, 28), new Address("Lod", "Sokolov", 4, 7));
//---------------------- 2 Task
        persons.add(p1);
        persons.add(p2);
        System.out.println(persons);
    }
}
