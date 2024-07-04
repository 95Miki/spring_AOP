package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog mydog = context.getBean("dog", Dog.class);
        Dog yourdog = context.getBean("dog", Dog.class);
        yourdog.say();
        mydog.say();
    }
}
