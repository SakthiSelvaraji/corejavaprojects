import java.util.Scanner;
public class switch2 {
    public static void main(String args[]){
         int month;
         Scanner obj= new Scanner(System.in);
         System.out.println("enter the months No ");
         month=obj.nextInt();
         {
            switch(month){
                case 1:
                {
                System.out.println("jan");
                }
                break;
                case 2:
                {
                    System.out.println("feb");
                }
                break;
                case 3:
                {
                    System.out.println("mar");
                }
                break;
                case 4:
                {
                    System.out.println("apr");
                }
                break;
                case 5:
                {
                    System.out.println("may");
                }
                break;
                case 6:
                {
                    System.out.println("jun");
                }
                break;
                case 7:
                {
                    System.out.println("jul");
                }
                break;
                default:
                    System.out.println("nothing");                
         }
    }
    }
}
