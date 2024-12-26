/*
 * This source file was generated by the Gradle 'init' task
 */
package my.spring.boot.project

import my.spring.boot.project.bean.UserConfig
import org.apache.catalina.core.ApplicationContext
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ImportResource
import org.springframework.context.support.ClassPathXmlApplicationContext

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml") // Load XML configuration
public class App {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);

        // Retrieve bean from XML configuration
        UserConfig config = (UserConfig) context.getBean("userConfigBean");
        System.out.println("Config retrieved: " + config);
    }
}
