package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ConfigWithAnnotation1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Person person = context.getBean("person", Person.class);
        person.callYourPet();
        System.out.println(person.getAge());
        System.out.println(person.getSurname());


//       Cat mycat = context.getBean("catBean", Cat.class);
//       mycat.say();
       context.close();

    }
}

