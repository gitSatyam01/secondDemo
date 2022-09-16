	import java.util.Arrays;


public class secString {
public static void main(String[] args) {
		String str1="satyam";
		String str2="lilhare";
		
		char ch[]=str1.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(Arrays.toString(ch));
		}
		
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch);
		}
	}
}
