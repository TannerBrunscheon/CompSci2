
public class MaxCol {
		public static void main(String[] args) {
			int[][] x = {{1,2,3},  //2 rows, 3 columns
					     {4,5,6}}; 
			if (max_col(x) != 2) { // 6+3 > 2+5 and 6+3 > 1+4, so column 2
				System.out.println("FAILED TEST 1");
            	System.exit(1);	
			}
			
			int[][] y = {{1, 2,3, 4}, //3 rows, 4 columns
					     {6,10,1, 4},
						 {1, 1,1, 4}};
			if (max_col(y) != 1) {
				System.out.println("FAILED TEST 2");
            	System.exit(1);	
			}

			int[][] z = {{4,2,0}};  // 1 row, 3 columns
			if (max_col(z) != 0) {
				System.out.println("FAILED TEST 3");
            	System.exit(1);	
			}

			int[][] a = {{0,1,2},  // 5 rows, 3 columns
						{ 0,1,2},
						{ 0,1,2},
						{ 0,1,2},
						{ 0,10,2}};

			if (max_col(a) != 1) {
				System.out.println("FAILED TEST 4");
            	System.exit(1);	
			}
        
			System.out.println("Tests passed");
		}

	
		public static int max_col(int[][] y) {
			int[] arr = new int[y[0].length];
			for (int j= 0; j<y.length;j++){
				for(int i =0; i<y[0].length; i++){
					arr[i] += y[j][i];
				}
			}
			int highIn = 0;
			for (int i =1; i < arr.length;i++){
				if (arr[i]>arr[highIn]){
					highIn =i;
				}
			}
			return highIn;
		}
}
