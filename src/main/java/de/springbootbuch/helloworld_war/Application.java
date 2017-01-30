package de.springbootbuch.helloworld_war;

import java.util.List;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    @RestController
    public static class HelloWorldController {

        private final GreetingRepository greetingRepository;

        public HelloWorldController(GreetingRepository greetingRepository) {
            this.greetingRepository = greetingRepository;
        }

        @GetMapping("/hello")
        public String helloWorld(@RequestParam final String name) {
            return "Hello, " + name + "\n";
        }

        @GetMapping("/greetings")
        public List<GreetingEntity> greetings() {
            return this.greetingRepository.findAll(new Sort("value"));
        }
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return configureApplication(builder);
    }

    public static void main(String[] args) {
        configureApplication(new SpringApplicationBuilder((Object[])args)).run(args);
    }
    
    private static SpringApplicationBuilder configureApplication(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }
}