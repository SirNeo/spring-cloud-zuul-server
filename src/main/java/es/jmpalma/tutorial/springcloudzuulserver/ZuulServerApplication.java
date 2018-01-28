package es.jmpalma.tutorial.springcloudzuulserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@EnableZuulProxy
public class ZuulServerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ZuulServerApplication.class, args);
		new SpringApplicationBuilder(ZuulServerApplication.class).web(true).run(args);
	}
}
