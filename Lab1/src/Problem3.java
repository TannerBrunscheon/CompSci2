public class Problem3 {
    public static void main(String[] args){
        int a = 14;
        int b = 28;
      
        //Create a new calculator Object with calc name of "My-Calc"
        Calculator calc = new Calculator("test");
        double added = calc.add(a, a);
       
        double subtracted = calc.subtract(b, a);
        double squared = calc.squared(a);
        double addTen = calc.addTen(a);
        
         //Print out the calc name here  
      
        System.out.println(added);
         if(added == b){
            System.out.println(true);
        }
        System.out.println(subtracted);
        System.out.println(squared);
        System.out.println(addTen);
    }
    
    static class Calculator{
        private String calcName;
        
        //Set a calculator name in the constructor
        public Calculator(String calcName){
            this.calcName = calcName;
        }
        
        //Add 2 numbers
        public double add(double a, double b){
            return  a+b;
        }
        
        //Subtract 2 numbers, write method
        public double subtract(double a, double b){
            return a-b;
        }
     
        
        //Add 10 to any given number
        public double addTen(double a){
            return a+10;
        }



        //Write the top part of the method.
         //Method name is "squared"
        //Square the number e.g. 4^2 = 16
        public double squared(double a){
            return Math.pow(a, 2);
        }
        
        //Print out the calculator name
         //What is the return type here?
         //How do you print out the calculator name? Fill in the blanks!
        public void getCalcName(){
            System.out.println("This is the calc name: " + calcName);
        }
    }
}
