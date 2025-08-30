package SpringCore.SpringPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
//context obj
		ApplicationContext context= SpringApplication.run(SpringPracticeApplication.class);
		//This is old method i.e core java method
//		Dev dev=new Dev();


		//but in spring we have dependency injection through context.getBean(--classname--);
		Dev dev= context.getBean(Dev.class);
		dev.build();
	}

}
