package co.udem.restapiquiz.model;

public class Student {
    private Long id;
    private String name;
    private String userName;

    public Student() {
    }

    public Student(Long id, String name, String userName) {
        this.id = id;
        this.name = name;
        this.userName = userName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "Students [id=" + id + ", name=" + name + ", userName=" + userName + "]";
    }
}
