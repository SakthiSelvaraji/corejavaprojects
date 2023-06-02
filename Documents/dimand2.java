public class dimand2 {
    public static void main(String args[]){
        for(int i=0;i<6;i++)
{
      for(int j=6;j>i;j--){
          System.out.print(" ");
      }
      for(int k=0;k<i;k++)

      {
        if(k==0 || k+1==i){
            System.out.print("* ");
        }
          else{
            System.out.print("  ");
          }
      }
       System.out.println();
  }
       for(int h=6;h>=0;h--){
          for(int f=6;f>h;f--){
              System.out.print(" ");
          }
           for(int r=0;r<h;r++)
           {
            if(r==0 || r+1==h)
            {
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
              }
              System.out.println(); 
  }
  
}
  }

