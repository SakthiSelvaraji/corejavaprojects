package Excaption;

public class Strcount {

    public static void main (String args[]){
        String word="polymarbisam";
        char search='m';
        int count=0;
       
        for(int i=0;i<word.length();i++)
        {
            System.out.println(word.charAt(i));
            // if(search == word.charAt(i))
            // count++;
        }
        System.out.println("the word "+ search+" is "+count);

    }
}
