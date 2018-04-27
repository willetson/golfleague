package golfleague.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Description;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Controller
@SpringBootApplication
public class App {

    /*
	@RequestMapping("/")
    @ResponseBody
    String home() {
      return "Hello World!";
    }
    */
    

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
	
	
}