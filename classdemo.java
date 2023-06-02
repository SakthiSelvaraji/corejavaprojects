class box{
    int num;
    int size;
    String name;
    box(int a,int b){
        num=a;
        size=b;
        // name=c;
        System.out.println("hi");
    }


void add()
{
    System.out.println("-----------------------------------");
    System.out.println("name ="+name);
    System.out.println("number="+num);
    System.out.println("size ="+size);   
}
}
public class classdemo {
    
   public static void main(String arg[]){
      box obj=new box(2,3);
      box obj1=new box(3,5);
      obj.name="blue box";
    //   obj.num=8;
    //   obj.size=23;
      obj.add();
    //   obj1.name="black box";
    //   obj1.num=4;
    //   obj1.size=22;
      obj1.add();
   } 
}
