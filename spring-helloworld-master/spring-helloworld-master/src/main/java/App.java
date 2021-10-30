import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat beanCat = (Cat) applicationContext.getBean("cat");
        Cat beanCatTwo = (Cat) applicationContext.getBean("cat");
        System.out.println("Сравнение helloworld = " + bean.equals(beanTwo));
        System.out.println("Сравнение cat = " + beanCat.equals(beanCatTwo));
    }
}