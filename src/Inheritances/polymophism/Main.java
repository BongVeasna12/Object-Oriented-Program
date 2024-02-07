package Inheritances.polymophism;


class  addition{
    int add(int a , int b ){
        return  a + b;
    }
    int add(int a , int b ,int c ){
        return a + b + c;
    }
    String add(String a , String b , String c){
        return a + b + c;
    }

}
public class Main {

    public static void main(String[] args) {
        addition add = new addition();
        System.out.println(add.add(50 ,40));
        System.out.println(add.add("Hello", "Dara", "Ly"));

    }

}
