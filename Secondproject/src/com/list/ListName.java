package com.list;

import java.util.List;

public class ListName {

	public boolean getNAME(List<String> list2) {

		Boolean boll_result;
		if (!list2.isEmpty()) {
			list2.forEach(p -> System.out.println(p));
			boll_result = true;
		} else
			boll_result = false;

		return boll_result;
	}

	public boolean getBoll(String a) {
		return ("hello".equals(a) ? true : false);
	}

	public String getPresent(String a) {
		return ("hello".equals(a) ? "string is proper" : "string is not proper");
	}

	public static int getMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}

		return max;
	}
}
