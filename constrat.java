class players{
    int dhoni;
    int rohit;
    int kohli;
players(int a,int b,int c){
    dhoni=a;
    rohit=b;
    kohli=c;
    
    
}
void jersyname(){
    
    //  int x=dhoni+rohit+kohli;
    // System.out.println("players jersy name is "+x);
    System.out.println(dhoni);
    System.out.println(rohit);
    System.out.println(kohli);


}
}
public class constrat{
public static void main(String args[]){
     players obj=new players(7,45,18);
     obj.jersyname();

}
}
