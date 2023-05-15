package dto.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
public class Person {
    long id;
    String name;
    Date birthDate;
    Address address;
}
