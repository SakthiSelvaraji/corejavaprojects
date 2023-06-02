package Excaption;

public class trycatch {
    public static void main(String args[]){
    int a=10;
    int b=0;
    int c;
    try{
    System.out.println(a/b);
    }
    catch(Exception e){
     System.out.println(e);
    }
    System.out.println(a+b);
    }
}
