package spring_introduction;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component
class Cat implements Pet{
    public Cat(){
        System.out.println("Cat bean created");
    }
    @Override
    public void say() {
        System.out.println("Mur-Mur");

    }
}
