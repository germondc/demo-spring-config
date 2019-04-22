package test.clyde.springconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigApplication {

	/**
	 * all the key details are in ~/.ssh as per normal
	 * is pulling config from: https://github.com/germondc/spring-config
	 * http://localhost:8888/test/default/master
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringConfigApplication.class, args);
	}

}
