import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        boolean eq2 = (bean == bean2);

        Cat cat = (Cat)  applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        boolean eq = (cat == cat2);

        System.out.println("правда ли, что cat это cat2? " + eq);
        System.out.println("а хелловорд, конечно, один объект, и это " + eq2);
    }
}