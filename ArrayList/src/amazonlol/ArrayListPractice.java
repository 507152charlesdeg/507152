package amazonlol;

import java.util.*;

public class ArrayListPractice {

	public static void mystery1(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i > 0; i--) {
			if (list.get(i) < list.get(i - 1)) {
				int element = list.get(i);
				list.remove(i);
				list.add(0, element);
			}
		}
		System.out.println(list);
	}

	public static void mystery2(ArrayList<Integer> list) {
		for (int i = list.size() - 1; i >= 0; i--) {
			if (i % 2 == 0) {
				list.add(list.get(i));
			} else {
				list.add(0, list.get(i));
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		// 8, 7, 8, 2, 9, 7, 4, 4, 2, 8

		mystery2(list);
	}

}
