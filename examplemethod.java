package polymarbisam;
class mathtest{
    String name;
    int age;
    void add(String inputname,int inputage){
          name=inputname;
          age=inputage;
          
          
    }

}
public class examplemethod {
 public static void main(String args[]){
    mathtest obj=new mathtest();
    obj.add("sakthi1234",51);
    // obj.name="sakthi";
    // obj.age=27;
    System.out.println(obj.name);
    System.out.println(obj.age);
 }
}
