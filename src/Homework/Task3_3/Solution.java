package Homework.Task3_3;

import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        // Объекты Course
        //-------------------------------------------------------------------------------
        Date startDate = new Date();
        Course[] course = new Course[6];
        course[0] = new Course("Биология", 48, "Амосов");
        course[1] = new Course("Химия", 48, "Менделеев");
        course[2] = new Course("ДПЮ", 116, "Порох");
        course[3] = new Course("Информатика", 202, "Гослинг");
        course[4] = new Course("Тайм менеджмент", 48, "Кови");
        course[5] = new Course(startDate, "экономика");

        //Объекты Student
        //----------------------------------------------------------------------------------
        Student st1 = new Student("Вася", "Пупкин", 10);
        Student st2 = new Student("Пупкин", course);


        //Объекты CollegeStudent
        //----------------------------------------------------------------------------------
        CollegeStudent CS1 = new CollegeStudent("Евгений", "Кузьмин", 25);
        CollegeStudent CS2 = new CollegeStudent("ХПИ", 1, 1001);
        CollegeStudent CS3 = new CollegeStudent("Кузьмин", course);


        //Объекты SpecialStudent
        //----------------------------------------------------------------------------------
        SpecialStudent SS1 = new SpecialStudent("Петр", "Иванов", 7);
        SpecialStudent SS2 = new SpecialStudent("Васильев", course);
        SpecialStudent SS3 = new SpecialStudent(11233);

    }
}