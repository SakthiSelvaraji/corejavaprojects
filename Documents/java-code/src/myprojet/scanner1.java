import java.util.Scanner;
public class scanner1 {
    public static void main (String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("ennter u r name");
        
        String name=obj.nextLine();

        System.out.println("enter u r batch number");

        int number=obj.nextInt();

        System.out.println("hello " + name);
        System.out.println("batch No " + number);
    }
}
