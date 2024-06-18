package interview;

import java.util.*;

public class BuyAndSellStock {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n = sc.nextInt();
		for (int i=0;i<n;i++) {
			int te = sc.nextInt();
			arr.add(te);
		}
		int ans = Integer.MIN_VALUE, pr = arr.get(0);
		for (int i=1;i<n;i++) {
			ans = Math.max(ans, arr.get(i)-pr);
			pr = Math.min(pr, arr.get(i));
		}
		System.out.print(ans);
	}
}
