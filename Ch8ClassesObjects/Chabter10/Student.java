package Chabter10;

public class Student <R> {
    R data;
    int age;
    //method

    //main
    public static void main(String[] args) {
        Student<String> strObject=new Student<String>();
        Student<Integer> intObject=new Student<Integer>();
        Student<Boolean> boolObject=new Student<Boolean>();
        strObject.data="Ubah";
        intObject.data=20;
        boolObject.data=true;
        System.out.println("my name is:"+strObject.data+"\n"+"my age:"+intObject.data+"\n"+" Boolean:"+ boolObject.data);

    }

}
