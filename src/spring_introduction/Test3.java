package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("aplicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        //Pet pet = (Pet) context.getBean("myPet");
        //Pet pet = new Cat();
        //Person person = new Person(pet);
        person.callYourPet();
        System.out.println(person.getSurname());
        System.out.println(person.getAge());

        context.close(); 
    }
}
