package interview;

import java.util.*;

public class StringToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int ten = 1, ans = 0;
		for (int i=str.length()-1;i>=0;i--) {
			if (i != 0) {
				ans += ((str.charAt(i)-'0')*ten);
			} else {
				if (str.charAt(i) == '-') {
					ans = -1 * ans;
				} else {
					ans += ((str.charAt(i)-'0')*ten);
				}
			}
			ten = ten*10;
		} 
		System.out.print(ans);
	}

}
