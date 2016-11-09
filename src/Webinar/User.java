package Webinar;

public class User {

     String name;
     int age;
    String company;
    private long id;

    // default constructor
    public User() {

    }


    // custom constructor
    public User(long id, String name, int age, String company) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.company = company;
    }

    void speak() {
        System.out.println("I am speaking");
    }

    void sendEmail() {
    }

}
