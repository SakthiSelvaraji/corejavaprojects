public class method {
    static int add(int m1, int m2,int m3,int m4,int m5){
        System.out.println("****");
        int total;
        total=m1+m2+m3+m4+m5;
        return total;
    }
    static int add(int m1, int m2){
        System.out.println("++++++");
        int total;
        total=m1+m2;
        return total;
    }
    public static void main(String RG[]){
        int m1,m2,m3,m4,m5,t ;
        System.out.println("sakthi marks");
        m1=50;
        m2=60;
        m3=40;
        m4=40;
        m5=30;
        t=add(m1,m2,m3,m4,m5);
        System.out.println("sakthi total marks="+t);
        

        System.out.println("elu marks");
        m1=60;
        m2=70;
        m3=40;
        m4=20;
        m5=10;
        t=add(m1,m2);
        System.out.println("elu total marks="+t);

    }

}
