package dead.inside.ghoul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GhoulApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhoulApplication.class, args);
		//1 задание
		MessageRenderer mr = new StandardOutMessageRenderer();
		MessageProvider mp = new HelloWorld();
		mr.setMessageProvider(mp);
		mr.render();

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		//2 задание
		Miner miner = (context.getBean("getMiner1", Miner.class));
		miner.run();

		Miner miner1 = (context.getBean("getMiner2", Miner.class));
		miner1.run();
		
		context.close();
	}

}
