import java.util.Scanner;
public class array1 {
    public static void main(String args[]){
        int a[] = new int [5];

        Scanner obj=new Scanner(System.in);
        System.out.println("enter the 5 value");

       for(int i=0;i<a.length;i++)
         a[i]=obj.nextInt();

          for(int i=0;i<a.length;i++)
         System.out.println(a[i]);
       }
    //    System.out.println(a);
    //  int arr[]={1,4,6,8,9,2,3};
    //  System.out.println(arr[3]);
    //  System.out.println(arr[2]);
    //  System.out.println(arr[6]);
    //  arr[6]=44;
    //  System.out.println(arr[6]);
    //  System.out.println(arr.length);
    }
    

