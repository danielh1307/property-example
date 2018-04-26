package danielh1307.spring.propertyexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PropertyExampleApplication {

	@Autowired
	private AnyService anyService;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(PropertyExampleApplication.class);
		app.run(args);
	}

}
