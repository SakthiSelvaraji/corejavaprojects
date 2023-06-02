class animal{
    void dog(){
        System.out.println("dog");
    }
}
    class birds extends animal{
        void parrot(){
        System.out.println("parrot");
    }
    // void dog(){
    //     System.out.println("dog 1 2 3");
    // }
}
    
public class exampleinher {
    public static void main (String arg[]){
    birds obj=new birds();
    obj.dog();
    obj.parrot();
    }
}
