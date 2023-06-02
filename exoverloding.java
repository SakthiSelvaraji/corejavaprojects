package polymarbisam;

class exoverloding {
    
        public void add(int a,int b){
            System.out.println(a+b);
        }
    
         public void add(int a,int b,int c){
            System.out.println(a+b+c);
        }
    

    public static void main(String arg[]) {
        exoverloding obj =new exoverloding();
        obj.add(10,20);
        obj.add(1,2,3);
    }
    
}
