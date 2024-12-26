package my.spring.boot.project.service;

import my.spring.boot.project.bean.UserConfig;
import org.apache.catalina.User;

public class OrderService {

    // Static factory method for custom bean creation
    public static OrderService createInstance(UserService userService, UserConfig userConfig) {
        // Create and return an instance of OrderService
        return null;
    }
}
