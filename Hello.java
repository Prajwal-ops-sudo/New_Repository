public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, Prajwal"); 

        boolean isAlien=false;
        if(isAlien==false){
            System.out.println("Its is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topscore=80;
        if(topscore<100){
            System.out.println("You got the high score!!");
        }

        int secondtopscore=95;
        if(topscore>secondtopscore && topscore<100){
            System.out.println("Greater then second top score and less than 100");
        }

        if((topscore>secondtopscore) || (topscore<=90)){
            System.out.println("Greater then second top score or less than 90");
        }

        if((topscore>90) && (topscore<100)){
            System.out.println("Greater then 90 and less than 100");
        }

        int newValue=50;

        if(newValue==50){
            System.out.println("THIS IS AN ERROR!");
        }

        boolean isCar=false;
        if(isCar==true){
            System.out.println("This is not supposed to happen!");
        }

        int newValue1=50;
        if(newValue1==50){
            System.out.println("This Is An Error!");
        }

/*TERNARY OPERATOR */
        //It basically means to not use if and directly write the code in one particular sentence that checks that if the condition has satisfied or not.
        //Officially Java calls this as conditional operator. 
        //Example:
        String makeofCar="BMW";
        boolean isDomestic=makeofCar=="BMW"?false:true;
        if(isDomestic){
        System.out.println("This car is domestic to Germany.");
    }
        String s=(isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);
}   
}
