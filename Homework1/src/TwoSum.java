
public class TwoSum {
    public static void main(String[] args) {
        // TEST 1a
        int[] a1 = {-1,-2,-2,4};
        if (two_sum(a1)) {
            System.out.println("FAILED TEST 1a");
            System.exit(1);
        }
        // TEST 1b
        int[] a2 = {1,2,3,4,0}; 
        if (two_sum(a1)) {
            System.out.println("FAILED TEST 1b");
            System.exit(1);
        }
        // TEST 1c
        int[] a3 = {0, 5, 0, -1, 10, 11};
        if (!two_sum(a3)) {
            System.out.println("FAILED TEST 1c");
            System.exit(1);
        }
        // TEST 1d
        int[] a4 = {-4, 5, -6, 7, 4, 3};
        if (!two_sum(a4)) {
            System.out.println("FAILED TEST 1d");
            System.exit(1);
        }
        // TEST 1e
        int[] a5 = {1, 2, -1, -2};
        if (!two_sum(a5)) {
            System.out.println("FAILED TEST 1e");
            System.exit(1);
        }
        
        /* We will test your code on additional test
        cases, so make sure it really works. (e.g., you can
        add more of your own test cases).
        */
        
        System.out.println("Tests passed");
    }
    
    public static boolean two_sum(int[] arr) {
        for(int i = 0; i< arr.length; i++) {
           for (int j = i + 1; j<arr.length;j++){
               if (arr[i]+arr[j] == 0){
                   return true;
               }
           }

        }
        return false;
    }
}
