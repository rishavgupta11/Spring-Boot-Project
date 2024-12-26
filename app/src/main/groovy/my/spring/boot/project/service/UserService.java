package my.spring.boot.project.service;

import my.spring.boot.project.bean.UserConfig;

public class UserService {

    private UserConfig userConfig;

    // Constructor injection
    public UserService(UserConfig userConfig) {
        this.userConfig = userConfig;
    }

    // Optional: Add a method to access the UserConfig if needed
    public UserConfig getUserConfig() {
        return userConfig;
    }
}

