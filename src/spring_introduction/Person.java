package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
public class Person{
//    @Qualifier("dog")
//    @Autowired

    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
    public Person(Pet pet) {
        System.out.println("Person bean created!!!");
        this.pet = pet;
    }
    //@Autowired
    public void setPet(Pet pet) {
        System.out.println("Class person set pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callYourPet (){
        System.out.println("Hello my lovely pet!!!");
        pet.say();
    }
}
