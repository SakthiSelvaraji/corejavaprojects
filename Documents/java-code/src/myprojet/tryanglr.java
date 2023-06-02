public class tryanglr {
    public static void main (String arg[]){
        for (int i=0;i<5;i++) 
        {
            for(int j=0;j<i;j++) 
            {
             System.out.print(" ");
            }
            for(int k=5;k>i;k--)
            {
             System.out.print(" *");
            } 
            System.out.println(); 
        }
        for(int f=0;f<5;f++)
        {
            for(int j=5;j>f;j--)
            {
             System.out.print(" ");
            }
            for(int k=0;k<=f;k++)
            {
             System.out.print("* ");
            }
            System.out.println();
}
    }
}
