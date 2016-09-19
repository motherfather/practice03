package prob1;

public class Prob1 {
	
	public static void main(String args[]) {
		
		char[] array1 = reverse("Hello World");
		printCharArray(array1);
		
		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);
		
	}
	
	public static char[] reverse(String str){
		/* 구현코드 */
		char[] c = str.toCharArray();
		
		for(int i =0 ; i < (c.length / 2) ; i++) {
			char tmp = c[i];
			c[i] = c[c.length - i - 1] ;
			c[c.length - i - 1] = tmp;
		}
		return c;
	}
	
	public static void printCharArray(char[] array){
		/* 구현코드 */
		System.out.println(array);
	}
}
