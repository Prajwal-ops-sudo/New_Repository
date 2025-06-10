public class challenge1 {
    public static void main(String[] args) {
        double a=20.00;
        double b=80.00; 
        double c=(a+b)*100.00;
        System.out.println("The value of c is "+c);
        double d=c%40.00;
        System.out.println("The value of d is"+d );

        boolean e;
        if(d==0.00){
            e=true;
            System.out.println("The value is "+e);
        }
        else{
            e=false;
            System.out.println("Got Some Remainder!");
        }
    }
    
}
