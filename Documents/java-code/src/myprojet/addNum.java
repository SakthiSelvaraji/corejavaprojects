import java.util.Scanner;
public class addNum {
    public static void main(String aeg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int i;
            i = obj.nextInt(); 
            if(i%2==0){
                System.out.println(i +"even number");
            }
            else{
                System.out.println(i +"odd number ");
            }
        }
    }

