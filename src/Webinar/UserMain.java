package Webinar;

public class UserMain {
    public static void main(String[] args) {


        User user = new User();
        user.name = "Vitya";
        System.out.println(user.name);
        System.out.println(user.age);
        ;
        System.out.println(user.company);
        System.out.println();

        User user1 = new User(1001, "Denis", 10, "AVK");
        User user2 = new User(1000, "Denis", 10, "AVK");
        System.out.println(user1);

        System.out.println(user1.name);
        System.out.println(user1.age);

        System.out.println(user1.company);
        user1.name = "Eminem";
        System.out.println(user1.name);
        //user.id = 1001;


        user.sendEmail();
    }


    }



