package polymarbisam;
class abcd{
    void add(){
        System.out.println(20+30);
    }
}
 

public class exoverride extends abcd{    
    void add(){
        System.out.println(30+10);
    }
    public static void main(String arg[]) {
        
    exoverride obj=new exoverride ();
    obj.add();
    abcd obj1=new abcd();
    obj1.add();
    
    }
}
