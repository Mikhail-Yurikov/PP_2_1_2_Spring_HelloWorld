import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo = (HelloWorld) applicationContext.getBean("helloworld");
        Cat catBeanOne = (Cat) applicationContext.getBean("Cat");
        Cat catBeanTwo = (Cat) applicationContext.getBean("Cat");
        System.out.println(catBeanOne == catBeanTwo);
        System.out.println(bean == beanTwo);
    }
}