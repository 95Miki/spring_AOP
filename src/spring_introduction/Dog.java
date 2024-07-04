package spring_introduction;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype")
public class Dog implements Pet{
    private String name;
//    @PostConstruct
//    public void init(){
//        System.out.println("Class Dog: init method");
//    }
//    @PreDestroy
//    public void destroy (){
//        System.out.println("Class Dog: destroy method");
 //   }
public Dog (){
    System.out.println("Dog is created");
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
