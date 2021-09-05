package oracleLambda;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.function.Predicate;

public class Person {
    public enum gender {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    gender gender;
    String emailAddress;

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Person.gender getGender() {
        return gender;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String printPerson() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithPredicate(
            List<Person> roster, Predicate<Person> tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    private int getAge() {
        return (Period.between(LocalDate.now(), this.birthday).getYears() + 1);
    }

    public static void main(String[] args) {
        LocalDate localDate1 = LocalDate.of(1993,2,2);
        LocalDate localDate2 = LocalDate.now();
        Period period = Period.between(localDate1,localDate2);
        System.out.println(period.getYears() + 1);

    }
}
