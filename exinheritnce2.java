class math{
    int a=10,b=20;
    int add(){
        return a+b;
       
    }
}
class css extends math{
    int fun(){
        return a*b;
    }
}
public class exinheritnce2 extends css {
    public static void main(String arg[]){
     
        exinheritnce2 obj=new exinheritnce2();

        int d=obj.fun();
        System.out.println("value"+d);
        int c=obj.add();
        System.out.println("value"+c);
    }

    
}
