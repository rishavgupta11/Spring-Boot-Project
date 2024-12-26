package my.spring.boot.project.bean;

public class UserConfig {

    private String name;
    private String className;

    // Setter methods
    public void setName(final String name) {
        this.name = name;
    }

    public void setClassName(final String className) {
        this.className = className;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getClassName() {
        return className;
    }
}
