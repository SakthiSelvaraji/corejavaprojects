package polymarbisam;

class student{
    private String name;
    private int age;
public void add(String nameinput,int ageinput)
{
    name=nameinput;
    age=ageinput;
    // int x=age;
}

public  int getvalue(){
    return age ;
   
}
public String value(){
    return name;
}

}
class exampleenxap {
public static void main(String args[]){
    student obj=new student();
    obj.add("jngjn",41);
//     obj.add="sakthi";
//    System.out.println( obj.age);
//    System.out.println(obj.name);

    int  k=obj.getvalue();
    String s=obj.value();
    // obj.nameinput;
    System.out.println("name is "+s+ " age is"+k);
    // System.out.println("name age is"+s);
    
}

}

