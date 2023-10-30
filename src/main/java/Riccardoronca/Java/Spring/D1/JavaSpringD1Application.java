
package Riccardoronca.Java.Spring.D1;
import entities.Menu;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import entities.BeansConfiguration;

@SpringBootApplication
@Slf4j
public class JavaSpringD1Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaSpringD1Application.class, args);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeansConfiguration.class);


		System.out.println(ctx.getBean("getMenu"));
		ctx.close();
	}
}
