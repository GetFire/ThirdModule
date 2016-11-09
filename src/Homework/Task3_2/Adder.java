package Homework.Task3_2;

public class Adder extends Arithmetic {
    public boolean chek (Integer a, Integer b){
        boolean c=false;
        if(a>=b) {
            c = true;
        }
        return c;
    }
// Для провери создадим новый объект
// _______________________________________________________


//    public static void main(String[] args) {
//        Adder You=new Adder();
//        System.out.println(You.chek(12,10));
//        System.out.println(You.arr(10,12));
//
//    }
}
