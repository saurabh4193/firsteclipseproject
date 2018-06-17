package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.employee.Employee;

public class ClientMain {

	private static final int a = 5;

	static void getStringList(Employee e) {
		e.setEmpname("saurabh");
		e.setEmpid(100);
		e.setEmpcode("ERA89");

	}

	private static List<Boolean> getBollean(List<Boolean> list) {
		boolean a = list.get(0);
		boolean b = list.get(1);
		boolean c = list.get(2);
		a = false;
		return Arrays.asList(a, b, c);
	}

	private static void getChangedValue(boolean a, boolean b, boolean c) {
		a = false;
		b = true;
	}

	private static void insertList(List<String> list, String addname) {
		list.add(addname);

	}

	private static void checkResult(List<String> list) {

		list.add("raju");
		list.add("kuamr");

		insertList(list, "ramesh");

	}

	private static List<Boolean> getResultBoolean(List<Boolean> l, String name) {
		boolean a = l.get(0);
		boolean b = l.get(1);
		boolean c = l.get(2);

		if (name.equals("rajesh")) {
			a = false;
		}

		b = true;

		return new ArrayList<>(Arrays.asList(a, b, c));
	}

	public static void main(String[] args) {

		// Integer s = new Integer(10);
		// Integer d = new Integer(10);
		// System.out.println(s.equals(d));
		// System.out.println(s == d);

		// Optional<String> name = Optional.empty();
		// System.out.println(name.isPresent() ? name.get() : "string is not present");
		Optional<String> name = Optional.ofNullable(null);
		System.out.println(name.isPresent() ? name.get() : "string is not present");

	}
}
// Employee e = new Employee();
// getStringList(e);
// System.out.println(e);

// String s = null;
//
// List<String> f = new ArrayList<>(Arrays.asList("saurabh", s, "ankur",
// "rajat", null));
// checkResult(f);
// f.forEach(d -> System.out.println(d));
// getResultBoolean(f);
//

// final List<String> l;
// final int a;
// a = 20;

// l = new ArrayList<>(Arrays.asList(a, b, c));
// List<Boolean> l2 = getResultBoolean(list, "rajesh");
// System.out.println(a + " " + b + " " + c);
// a = l2.get(0);
// b = l2.get(1);
// c = l2.get(2);
// System.out.println(a + " " + b + " " + c);
// List<Employee> list = new ArrayList<>(
// Arrays.asList(new Employee(1, "saurabh", "EM123"), new Employee(2, "ankit",
// "SA345")));
// List<String> s = new ArrayList<>(Arrays.asList("saurabh", "kumar", "singh"));
// Arrays.asList(list, s).forEach(p -> p.forEach(q -> System.out.println(q)));
// .forEach(q -> System.out.println(q));
// Employee p = new Employee();
// p.setEmpid(100);
// Employee e1 = new Employee();
// e1.setEmpid(100);
//
// System.out.println((!p.equals(e1)) ? true : false);
// boolean h = true;
// h = (h == false) ? true : false;
// System.out.println(h);
// setValues();
// boolean v = true;
// boolean r = false;
// boolean t = true;
// System.out.println("previous:" + v + " " + r + " " + t);
//
// getBollean(Arrays.asList(v, r, t)).forEach(p -> System.out.println(p));
// v = getBollean(Arrays.asList(v, r, t)).get(0);
// r = getBollean(Arrays.asList(v, r, t)).get(1);
// t = getBollean(Arrays.asList(v, r, t)).get(2);
// System.out.println("after:" + v + " " + r + " " + t);
// System.out.println();
// List<String> list = new ArrayList<>(Arrays.asList("saurabh", "ankit",
// "ghar"));
// System.out.println();
// insertList(list);
// list.stream().filter(p -> p.startsWith("s") || p.startsWith("a")).forEach(p
// -> System.out.println(p));

// getStringList(Arrays.asList("saurabh", "kumar", "singh"));
// System.out.println("inside main method.");
// List<String> list = Arrays.asList("Saurabh", "arjun", "karan");
//
// new ListName().getNAME(list);
//
// int size_of_list = list.size();
//
// System.out.println((size_of_list > 0) ? "list is not empty" : "list is
// empty");
