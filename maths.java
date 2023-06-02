package polymarbisam;
class name{
    // int cc;
    void add1(int b){
        int cc;
        cc=b+2;
    }
    public int add(int b){
        int c;
        c=b+2;
        return c;
    }
} 

public class maths {
    public static void main(String args[]){
        name obj=new name();
        // int d;
        // obj.add1(10);
        // System.out.println(d);
        // System.out.println(obj.add(2));
        // obj.a=10;
        int h;
        h=obj.add(10);
        System.out.println(h);

    } 
}
