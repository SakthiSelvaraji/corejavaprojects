// ************ststic keyword*****************
class clg{
   int rank;
   String name;
   static String teacher;

   void add(){
        System.out.println("*********************************");
        System.out.println("rank = "+rank);
        System.out.println("name = "+name);
        System.out.println("teacher = "+teacher);
        
   }

}
public class examplestic {
    public static void main (String arg[]){
        clg s1=new clg();
        clg s2=new clg();
        s1.rank=3;
        s1.name="rohit";
        s1.teacher="mahi";

        s1.add();
        s2.rank=4;
        s2.name="koli";
        s2.add();

    }
}
