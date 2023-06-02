import java.util.Scanner;
public class mirrored {

    public static void main(String args[]){
        Scanner ss=new Scanner(System.in);
             System.out.println("enter the number rows");
             int row=ss.nextInt();
             for(int i=0;i<row;i++)
             {
            for(int k=row;k>i;k--)
                {
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
             System.out.print("*");
              }
              System.out.println();
             }
        }
  
      }

