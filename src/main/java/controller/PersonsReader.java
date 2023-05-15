package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import dto.model.Person;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class PersonsReader {
    public static void main(String[] args) throws IOException {
        ObjectMapper objMapper = new ObjectMapper();
        //First task --------------------------------
        Person pOne =objMapper.readValue(new File("person.json"), Person.class);
        System.out.println(pOne);
        //Second task -------------------------------
        Person[] pMany = objMapper.readValue(new File("persons_for_advanced.json"), Person[].class);
        //Arrays.stream(pMany).forEach(System.out::println);
        System.out.println(Arrays.toString(pMany));
    }
}
