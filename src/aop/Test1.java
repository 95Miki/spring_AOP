package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Library.class);
        Library library = context.getBean("library", Library.class);
        library.getBook();
//        System.out.println("ghbdkweavlzv");
        context.close();
    }
}
