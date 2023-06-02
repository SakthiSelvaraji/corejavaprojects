public class elseif {
    public static void main(String arg[]){
        int marks=350;
        if(marks>=400){
            System.out.println("a+ grade");
        }
        else if(marks>=300){
            System.out.println("a grade");
        }
        else if(marks>=200 ){
            System.out.println("b grade");          
        }
        else if(marks>=100){
            System.out.println("c grade");  
        }        
        else{
            System.out.println("fail");
        }
    }
}
