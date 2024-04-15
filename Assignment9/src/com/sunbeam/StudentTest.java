package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> l1 = new LinkedList<>();

		l1.add(new Student(1, "Shantanu", 91.1));
		l1.add(new Student(3, "Sahil", 93.3));

		l1.add(new Student(2, "Anand", 92.2));
		l1.add(new Student(4, "Ganesh", 94.4));

		l1.add(new Student(6, "Parimal", 96.6));
		l1.add(new Student(5, "s5", 95.5));

		System.out.println("Before sort");

		for (Student element : l1)
			System.out.println(element);// using for-each loop

		System.out.println("After Natural Ordering --> ");
		Collections.sort(l1);

		for (Student element : l1)
			System.out.println(element);

		System.out.println("Sorting on student name -->");
		class StudentNameCompare implements Comparator<Student> {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		}
		StudentNameCompare s1 = new StudentNameCompare();
		Collections.sort(l1, s1);
		for (Student element : l1)
			System.out.println(element);

		Student s = new Student();
		s.setRollno(3);

		if (l1.contains(s)) {

			System.out.println("Sahil exists");
		} else
			System.out.println("Sahil does not exist");
	}
}
