package spring_introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//    Pet cat = (Pet) context.getBean("catBean");
//    cat.say();
//
//    Pet dog = (Pet) context.getBean("dogBean");
//    dog.say();

        Person person = (Person) context.getBean("personBean",Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

    }
}
