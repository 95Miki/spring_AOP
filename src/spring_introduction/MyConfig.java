package spring_introduction;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

@Configuration
//@Scope("prototype")
@PropertySource("classpath:myApp.properties")
//@ComponentScan("spring_introduction")
public class MyConfig {
    @Bean
    public Pet catBean(){
        return new Cat();
    }
    @Bean
    public Pet dogBean(){
        return new Dog();
    }
    @Bean
//    @Qualifier("dogBean")
    public Person personBean(){
        return new Person(catBean());
    }
}
