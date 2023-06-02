package Excaption;
public class strbuilder {
    public static void main(String arg[]){
        StringBuilder obj=new StringBuilder("hi");
        StringBuilder obj1=new StringBuilder("hello");
        StringBuilder obj3=obj.append(obj1);
        System.out.println(obj3.toString());

    }
    
}
