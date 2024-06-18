package interview;

import java.util.*;

public class DutchNationalFlag {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), te;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i=0;i<n;i++) {
			te = sc.nextInt();
			arr.add(te); 
		}
		int index = sc.nextInt();
		int l = 0, val = arr.get(index);
		while(l < arr.size() && arr.get(l) < val)l++;
		int pt = l+1;
		while(pt < arr.size() && l<arr.size()) {
			if (arr.get(pt) < val) {
				Collections.swap(arr, l, pt);
				while(l < arr.size() && arr.get(l) < val)l++;
			}
			pt++;
		}
		
		int r = arr.size() - 1;
		while(r >= 0 && arr.get(r) > val)r--;
		pt = r-1;
		while(pt >= 0 && r >= 0) {
			if (arr.get(pt) > val) {
				Collections.swap(arr, pt, r);
				while(r >= 0 && arr.get(r) > val)r--;
			}
			pt--;
		}
		for (int i=0;i<arr.size();i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}

}
