import java.util.Scanner;
public class switch1 {
    public static void main(String aegs[]){
        int a=10;
        int b=20;
        Scanner obj=new Scanner(System.in);
    char operator;
    System.out.println("+,-,*,%");
    operator=obj.next().charAt(0);
    switch(operator){
    case'+':
    {
           System.out.println(a + "+" + b + "=" + (a+b));
    }
    break;
    case'-':
    {
        System.out.println(a + "-" + b + "=" + (a-b));
    }
    break;
    case'*':
    {
        System.out.println(a + "*" + b + "=" + (a*b));
    }
    break;
    case'%':
    {
         System.out.println(a + "%" + b + "=" + (a%b));
    }
    break;
}
    }
}
