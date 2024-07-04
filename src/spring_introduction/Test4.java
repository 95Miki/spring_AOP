package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = (Dog) context.getBean("myPet");
//        myDog.setName("Belka");
//        Dog yourDog = (Dog) context.getBean("myPet");
//        yourDog.setName("Strelka");
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());
//        System.out.println("Ссылаются ли в один объект?  "+
//                (myDog==yourDog));
//        System.out.println(myDog);
//        System.out.println(yourDog);
       context.close();
    }
}
