package Excaption;
import java.util.Scanner;

public class stringex {
    public static void main(String arg[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the string");
        String word=obj.nextLine();
        for(int i=0;i<word.length();i++){
            for(int j=0;j<=i;j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
        for(int i=0;i<word.length();i++){
            for(int j=word.length();j>i;j--){
                System.out.print(word.charAt(i));
            }
            System.out.println();
        }
    }
    }
