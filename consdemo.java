class constractor1 {
    int a;
    int b;
    int result;

    constractor1()

    {
         a=10;
         b=20;

    }
     void  display(){
        result = a+b;
        System.out.println("value is ="+result);
    }
}
public class consdemo {
public static void main(String arg[]){
    constractor1 obj=new constractor1();
    // System.out.println(obj.result);
     obj.display();
     
}
}

