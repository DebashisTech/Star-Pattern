package com.qsp.pattern;

public class DevPattern {
	/*
	 * * * * * *
	 * * * * * *
	 * * * * * *
	 * * * * * *
	 * * * * * *
	 * * * * * *
	 */
	    static void pattern1(int n){
	        for(int i=0;i<=n;i++){
	            for (int j=1;j<=n;j++)
	                System.out.print("* ");
	            System.out.println();
	        }
	    }
	/*
	 *
	 * *
	 * * *
	 * * * *
	 * * * * *
	 * * * * * *
	 * * * * * * *
	 * */
	    static void pattern2(int n){
	        for(int i=0;i<=n;i++){
	            for (int j=0;j<=i;j++)
	                System.out.print("* ");
	            System.out.println();
	        }
	    }
	/*
	 * * * * * * * *
	 * * * * * * *
	 * * * * * *
	 * * * * *
	 * * * *
	 * * *
	 * *
	 *
	 */
	    static void pattern3(int n){
	        for (int i=n;i>=0;i--){
	            for(int j=i;j>=0;j--)
	                System.out.print("* ");
	            System.out.println();
	        }
	    }
	/*
	1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
	1 2 3 4 5 6
	*/
	    static void pattern4(int n){
	        for(int i=1;i<=n;i++){
	            for (int j=1;j<=i;j++)
	                System.out.print(j+" ");
	            System.out.println();
	        }
	    }
	/*
	 1
	 2 2
	 3 3 3
	 4 4 4 4
	 5 5 5 5 5
	 6 6 6 6 6 6
	 */
	    static void pattern5(int n){
	        for(int i=1;i<=n;i++){
	            for (int j=1;j<=i;j++)
	                System.out.print(i+" ");
	            System.out.println();
	        }
	    }
	/*
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1
	 */
	    static void pattern6(int n){
	        for (int i=n;i>=0;i--){
	            for(int j=1;j<=i;j++)
	                System.out.print(j+" ");
	            System.out.println();
	        }
	    }
	    //same as pattern 6 print "*" instead of numbers.
	/*
	     *
	    ***
	   *****
	  *******
	 *********
	 */
	    static void pattern7(int n){
	        for(int i=0;i<n;i++){
	            //space (n-i-1)
	            for (int j=0;j<n-i-1;j++)
	                System.out.print(" ");

	            //star  (2*i+1)
	            for (int j=0;j<2*i+1;j++)
	                System.out.print("*");

	            //space
	            for (int j=0;j<n-i-1;j++)
	                System.out.print(" ");
	            System.out.println();
	        }
	    }
	/*
	 *********
	  *******
	   *****
	    ***
	     *
	 */
	    static void pattern8(int n){
	        for(int i=0;i<n;i++){
	            //space  (=i)
	            for (int j=0;j<i;j++)
	                System.out.print(" ");

	            //star ( 2n-(2*i+1) )
	            for (int j=0;j<2*n-(2*i+1);j++)
	                System.out.print("*");

	            //space
	            for (int j=0;j<=i;j++)
	                System.out.print(" ");
	            System.out.println();
	        }
	    }
	/*
	      *
	     ***
	    *****
	   *******
	  *********
	 ***********
	 ***********
	  *********
	   *******
	    *****
	     ***
	      *
	 */
	    static void pattern9(int n){
	        pattern7(n);
	        pattern8(n);
	    }
	/*
	*
	* *
	* * *
	* * * *
	* * * * *
	* * * *
	* * *
	* *
	*
	*/
	    static void pattern10(int n){
	        for(int i=1;i<=2*n-1;i++){
	            int stars=i;
	            if(i>n) stars=2*n-i;
	            for (int j=1;j<=stars;j++)
	                System.out.print("* ");
	            System.out.println();
	        }
	    }
	/*
	1      1
	22    22
	333  333
	44444444
	*/
	    static void pattern11(int n){
	        int space = 2*(n-1);
	        for(int i=1;i<=n;i++){
	          // number
	            for(int j=1;j<=i;j++)
	                System.out.print(i);
	          // space
	            for (int j=1;j<=space;j++){
	                System.out.print(" ");
	            }
	          // number
	            for(int j=i;j>=1;j--)
	                System.out.print(i);
	        System.out.println();
	        space -= 2;
	        }
	    }
	/*
	1
	2 3
	4 5 6
	7 8 9 10
	11 12 13 14 15
	 */
	    static void pattern12(int n){
	        int num=1;
	        for(int i=1;i<=n;i++){
	            for (int j=1;j<=i;j++){
	                System.out.print(num++ +" ");
	            }
	            System.out.println();
	        }
	    }
	    static void pattern13(int n){
	        char ch='A';
	        for (int i=1;i<=n;i++){
	            for (int j=1;j<=i;j++){
	                System.out.print(ch++);
	            }
	            ch='A';
	            System.out.println();
	        }
	        // Another Way
	        for(int i=0;i<n;i++){
	          for(char c='A';c <='A'+i;c++){
	              System.out.print(c);
	          }
	            System.out.println();
	        }
	    }
	/*
	ABCDE
	ABCD
	ABC
	AB
	A
	 */
	    static void pattern14(int n) {
	        for (int i=n;i>=1;i--){
	            for (char c='A';c<'A'+i;c++){
	                System.out.print(c);
	            }
	            System.out.println();
	        }
	    }
	/*
	A
	BB
	CCC
	DDDD
	EEEEE
	 */
	    static void pattern15(int n){
	        char ch='A';
	        for (int i=1;i<=n;i++){
	            for(int j=1;j<=i;j++){
	                System.out.print(ch);
	            }
	            ch++;
	            System.out.println();
	        }
	    }
	/*
	    A
	   ABA
	  ABCBA
	 ABCDCBA
	ABCDEDCBA
	*/
	    static void pattern16(int n) {
	        for (int i = 0; i < n; i++) {
	            //space(n-i-1)
	            for (int j = 1; j <= n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            //character
	            int breakpoint = (2 * i + 1) / 2;
	            char ch = 'A';

	            for (int j = 1; j <= 2 * i + 1; j++) {
	                System.out.print(ch);
	                if (j<=breakpoint) ch++;
	                else ch--;
	            }
	            //space
	            for (int j = 1; j <= n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	    static void pattern17(int n){

	        for (int i=1;i<=n;i++){
	        char c = (char)('A'+n-1-i);
	            for (int j=1;j<=i;j++){
	                System.out.print((char)(c + j));
	            }
	            System.out.println();
	        }
	    }
	/*
	 **********
	 ****  ****
	 ***    ***
	 **      **
	 *        *
	 *        *
	 **      **
	 ***    ***
	 ****  ****
	 **********
	 */
	    static void pattern18(int n){
	        //upper half
	        int iniSpace=0;
	        for(int i=0;i<n;i++){
	            //star
	            for (int j=1;j<=n-i;j++) {
	                System.out.print("*");
	            }
	            //space
	            for (int j=0;j<iniSpace;j++){
	                System.out.print(" ");
	            }
	            //star
	            for (int j=1;j<=n-i;j++) {
	                System.out.print("*");
	            }
	            iniSpace+=2;
	            System.out.println();
	        }
	        //lower half
	        iniSpace=2*n-2;
	        for(int i=1;i<=n;i++){
	            //star
	            for (int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            //space
	            for (int j=0;j<iniSpace;j++){
	                System.out.print(" ");
	            }
	            //star
	            for (int j=1;j<=i;j++) {
	                System.out.print("*");
	            }
	            iniSpace-=2;
	            System.out.println();
	        }
	    }
	    static void pattern19(int n){
	        int spaces=2*n-2;
	        for(int i=1;i<=2*n-1;i++){
	            int stars=i;
	            if(i>n) stars=2*n-i;

	            //stars
	            for(int j=1;j<=stars;j++){
	                System.out.print("*");
	            }
	            //spaces
	            for (int j=1;j<=spaces;j++){
	                System.out.print(" ");
	            }
	            //starts
	            for (int j=1;j<=stars;j++){
	                System.out.print("*");
	            }
	            System.out.println();
	            if (i<n) spaces-=2;
	            else spaces+=2;
	        }
	    }
	    static void pattern20(int n){
	        for (int i=0;i<n;i++){
	            for (int j=0;j<n;j++){
	                if (i==0|| i==n-1||j==0||j==n-1){
	                    System.out.print("*");
	                }
	                else
	                    System.out.print(" ");
	            }
	            System.out.println();
	        }
	    }
	    static void pattern21(int n){
	        System.out.println("PATTERN 21");
	        for (int i=0;i<2*n-1;i++){
	            for (int j=0;j<2*n-1;j++){
	                int top=i;
	                int left=j;
	                int right=(2*n-2)-j;
	                int bottom=(2*n-2)-i;
	                System.out.print(n-min(left,right,top,bottom)+" ");
	            }
	            System.out.println();
	        }
	    }
	    static void pattern22(int n){
	        for (int i=0;i<=n;i++){
	            int flag = (i % 2 == 0) ? 1 : 0;
	            for(int j=0;j<=i;j++){
	                System.out.print(flag+" ");
	                flag = 1 - flag;
	            }
	            System.out.println();
	        }
	    }
	    static int min(int a, int b, int c, int d ){
	        int min=a;
	        if(min>b) min=b;
	        if(min>c) min =c;
	        if(min>d) min=d;
	        return min;
	    }
	    
	    /*
	     * * * * *
	     *       *
	     *       *
	     *       *
	     * * * * *
	    */
		static void pattern23() {
			for (int i = 1; i <= 5; i++) {
				for (int j = 1; j <= 5; j++) {
					if (i == 1 || i == 5 || j == 1 || j == 5)
						System.out.print("* ");

					
					else
						System.out.print("  ");

				}
				System.out.println();
			}
		}
	    public static void main(String[] args) {
	///         argument defines the number of rows.
	        pattern1(6);
	        pattern2(6);
	        pattern3(8);
	        pattern4(6);
	        pattern5(6);
	        pattern6(6);
	        pattern7(5);
	        pattern8(5);
	        pattern9(6);
	        pattern10(5);
	        pattern11(4);
	        pattern12(5);
	        pattern13(5);
	        pattern14(5);
	        pattern15(5);
	        pattern16(5);
	        pattern17(5);
//	        pattern18(5);
//	        pattern19(5);
//	        pattern20(5);
//	        pattern21(4);
//	        pattern22(5);
	        pattern23();
	       
	    }
}

