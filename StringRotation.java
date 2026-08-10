package com.javaintro;

public class StringRotation {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "deabc";
		char[] a = s.toCharArray();
		char temp;
		System.out.println(a);
		for (int i = 0; i < a.length; i++) {

			if (!new String(a).equals(goal)) {
				temp = a[0];
				for (int j = 0; j < a.length; j++) {

					if (j == a.length - 1) {

						a[a.length - 1] = temp;
					} else {
						a[j] = a[j + 1];
					}

				}

				System.out.println(a);

			} if (new String(a).equals(goal)) {
				System.out.println(true);
				break;
			} else {
				System.out.println(false);
			}

		}
		
	}
}
