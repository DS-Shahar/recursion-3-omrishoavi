package AsynchronicRecursiv;

public class Main {


	public static int q10(int n) {
		if (n==1) {
			return 2;
		}
		if (n%2==1) {
			return (2*n)+q10(n-1);
		}
		else {
			return (n*n)+q10(n-1);

		}
	}



	public static double q11(int n) {
		if (n==1) {
			return 1;
		}
		if (n%2==1) {
			return (2*n-1)+q11(n-1);
		}
		else {
			return q11(n-1)-Math.sqrt(2*n-1);

		}
	}

	public static int q12(int n,int num,int m) {
		if (n<m) {
			return n+q12(n+num,num,m);
		}
		else {
			return 0;

		}
	}

	public static int q13a(int n) {
		if (n>1) {
			return (q13a(n-2))*(q13a(n-2)) + (q13a(n-1))*(q13a(n-1));
		}
		else if (n==1) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static int q13b(int n) {
		if (n>1) {
			return q13a(n) + q13b(n-1);
		}
		else if (n==1) {
			return 1;
		}
		else {
			return 0;
		}
	}

	public static int q21(String str) {
		return q21Helper(str, 0);
	}

	private static int q21Helper(String str, int index) {			
		if (index == str.length()) {
			return 0;
		}
		char currentChar = str.charAt(index);
		int count = Character.isLowerCase(currentChar) ? 1 : 0;				
		return count + q21Helper(str, index + 1);
	}

	public static String q22(String str) {
		return q22Helper(str, 0);
	}

	private static String q22Helper(String str, int index) {
		if (index >= str.length()) {
			return "";
		}
		if (index + 2 >= str.length()) {
			return str.substring(index);
		}
		String currentChunk = str.substring(index, index + 3);
		return currentChunk + "*" + q22Helper(str, index + 3);
	}

	public static String q23(String str) {
		return q23Helper(str, 0);
	}

	private static String q23Helper(String str, int index) {
		if (index >= str.length()) {
			return "";
		}
		return str.charAt(str.length()-1-index) + q23Helper(str, index + 1);
	}

	public static void q24(char start, char end) {
		if (start > end) return; 
		System.out.print(start + " ");
		q24((char) (start + 1), end); 
	}


	public static void q25(int n, int current) {
		if (current > n) return; 
		if (n % current == 0) {
			System.out.print(current + " ");
		}
		q25(n, current + 1); 
	}


	public static void q26(int number) {
		if (number == 0) return; 
		int digit = number % 10;
		if (digit % 2 == 0) {
			System.out.print(digit + " ");
		}
		q26(number / 10); 
	}


	public static void q27(int i, int j) {
		if (i > 10) return; 
		if (j > 10) {
			System.out.println();
			q27(i + 1, 1); 
			return;
		}
		System.out.printf("%d x %d = %d\t", i, j, i * j);
		q27(i, j + 1); 
	}

	public static int q28(int a, int d, int n) {

		if (n > 0) {
			System.out.println(a);	        
			return q28(a+d, d, n-1);
		}
		else {
			return a;

		}
	}

	public static int q29(int a, int d , int n) {

		if (n > 0) {
			System.out.println(a);	        
			return q29(a+d, d+1, n-1);
		}
		else {
			return a;

		}
	}

	public static void q30(int n) {

		if (n == 1) {
			System.out.println(4);	        
		}
		else if(n%2==0){
			System.out.println(2+n/2);
			q30(n-1);
		}
		else {
			System.out.println(4+n/2);
			q30(n-1);
		}
	}


	public static void q31(int[] a,int n) {

		if(n%2==0){
			if (n == a.length-1) {
				System.out.println(a[n]);	        
			}
			else {
				System.out.println(a[n]);
				q31(a,n+1);
			}
		}
		else if (n == a.length-1) {
			System.out.println(a[n]);	        
		}
		else {
			q31(a,n+1);
		}

	}

	public static void q32(int[] a,int n) {


		if(n<a.length-1) {

			if(a[n]<a[n+1]){
				System.out.println(a[n]);
				q32(a,n+1);
			}
			else {
				q32(a,n+1);
			}
		}
	}


	public static void main(String[] args) {

		int[] a = new int[] {2,4,5,6,4,11,1};
		q32(a,0);

	}

}
