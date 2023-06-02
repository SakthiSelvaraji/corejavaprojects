public class overloding {
    static int fun(int a,int b){
          int total;
          total=a+b;
          return total;
    }
    static double fun(double x,double y){
        double value;
        value=x*y;
        return value;
    }
    public static void main (String arg[]){
         System.out.println (fun(10,20));
         System.out.println (fun(3.4,5.8));
    }
}
