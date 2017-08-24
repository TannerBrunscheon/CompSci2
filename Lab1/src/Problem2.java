public class Problem2 {
    
        public static void main(String[] args) {
             
            int n = 16;
            for(int i = 1; i<=n ; i++)
            {
              if(i%3 == 0 || i%5 == 0)
              {
                  StringBuilder out = new StringBuilder();
                  if(i%3 ==0 ){
                      out.append("Fizz");
                  }
                  if(i%5 == 0){
                      out.append("Buzz");
                  }
                  System.out.println(out.toString());
              }
              else
              {
                System.out.println(i);
              }
              
            }
        }
    }