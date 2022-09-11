package com.daicent;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import object.Class;
import object.School;
import object.Student;
import object.Subject;
import object.Subject;
import object.Unit;
import objectcollection.ClassStudent;
import objectcollection.ListSchool;
import objectcollection.SchoolUnit;
import objectcollection.StudentSubject;
import objectcollection.UnitClass;

public class SchoolMain {
	public static void main(String[] args) {
		System.out.println("___________1. Subject:__________");
		HashSet<Subject> setSubject = new HashSet< Subject>();
		setSubject.add(Subject.English);
		setSubject.add(Subject.Math);
		setSubject.add(Subject.Exercise);
		setSubject.add(Subject.Vietnamese);
		setSubject.add(Subject.Music);
		setSubject.add(Subject.Science);
		setSubject.add(Subject.History);
		System.out.println("| Subject\t|");
		for (Subject key : setSubject) {
			System.out.println("|"+key+"\t|");
		}
		
		
		System.out.println("\n___________2. Student School:__________");
		System.out.println("|Id\t| Full Name\t| Age\t|");
		Student student1 = new Student(1, "Tran Thi Oc", 10,1.0f);
		Student student2 = new Student(3, "Hoang Van An", 9,10.0f);
		Student student3 = new Student(2, "Nguyen Thi Ha", 9,7.0f);
		Student student4 = new Student(4, "Tran Thi An", 9, 9.0f);
		Student student5 = new Student(7, "Vu Thi Hieu", 10,5.0f);
		Student student6 = new Student(5, "Nguyen Van Han",10, 10.0f);
		Student student7 = new Student(6, "Trinh Thi Bac", 9, 9.0f);
		Student student8 = new Student(8, "Tran Thi Thu", 9, 1.0f);
		Student student9 = new Student(10, "Vu Thi An", 8, 8.0f);
		Student student10 = new Student(9, "Trinh Thi An", 7, 8.0f);
		
		System.out.println("___________3. Class School:__________");
		Class class1 = new Class(1, "1A");
		Class class2 = new Class(2, "2B");
		Class class3 = new Class(3, "3A");
		Class class4 = new Class(4, "4B");
		
		Unit unit1= new Unit(1,"Khoi 1");
		Unit unit2= new Unit(2,"Khoi 2");
		Unit unit3= new Unit(3,"Khoi 3");
		Unit unit4= new Unit(4,"Khoi 4");
		
		
		System.out.println("\n___________4. Student Subjcet:__________");
		TreeMap<Subject, Float> mapSubjcet1 = new TreeMap<Subject, Float>();
		mapSubjcet1.put(Subject.Art, 9.0f);
		mapSubjcet1.put(Subject.English, 8.0f);
		mapSubjcet1.put(Subject.Exercise, 7.0f);
		StudentSubject stuSubjcet1= new StudentSubject(student1, mapSubjcet1);
		TreeMap<Subject, Float> mapSubjcet2 = new TreeMap<Subject, Float>();
		mapSubjcet2.put(Subject.History, 8.0f);
		mapSubjcet2.put(Subject.Math, 8.0f);
		mapSubjcet2.put(Subject.Music, 7.0f);
		StudentSubject stuSubjcet2= new StudentSubject(student2, mapSubjcet2);
		TreeMap<Subject, Float> mapSubjcet3 = new TreeMap<Subject, Float>();
		mapSubjcet3.put(Subject.Science, 9.0f);
		mapSubjcet3.put(Subject.Math, 7.0f);
		mapSubjcet3.put(Subject.Music, 10.0f);
		StudentSubject stuSubjcet3= new StudentSubject(student3, mapSubjcet3);
		TreeMap<Subject, Float> mapSubjcet4 = new TreeMap<Subject, Float>();
		mapSubjcet4.put(Subject.Vietnamese, 9.0f);
		mapSubjcet4.put(Subject.Exercise, 6.0f);
		mapSubjcet4.put(Subject.Math, 5.0f);
		StudentSubject stuSubjcet4= new StudentSubject(student4, mapSubjcet4);
		TreeMap<Subject, Float> mapSubjcet5 = new TreeMap<Subject, Float>();
		mapSubjcet5.put(Subject.Math, 2.0f);
		mapSubjcet5.put(Subject.History, 8.0f);
		mapSubjcet5.put(Subject.Music, 4.0f);
		StudentSubject stuSubjcet5= new StudentSubject(student5, mapSubjcet5);
		TreeMap<Subject, Float> mapSubjcet6 = new TreeMap<Subject, Float>();
		mapSubjcet6.put(Subject.Vietnamese, 2.0f);
		mapSubjcet6.put(Subject.History, 8.0f);
		mapSubjcet6.put(Subject.Exercise, 4.0f);
		StudentSubject stuSubjcet6= new StudentSubject(student6, mapSubjcet6);
		TreeMap<Subject, Float> mapSubjcet7 = new TreeMap<Subject, Float>();
		mapSubjcet7.put(Subject.Math, 7.0f);
		mapSubjcet7.put(Subject.History, 3.0f);
		mapSubjcet7.put(Subject.Music, 4.0f);
		StudentSubject stuSubjcet7= new StudentSubject(student7, mapSubjcet7);
		TreeMap<Subject, Float> mapSubjcet8 = new TreeMap<Subject, Float>();
		mapSubjcet8.put(Subject.English, 2.0f);
		mapSubjcet8.put(Subject.Music, 7.0f);
		mapSubjcet8.put(Subject.History, 2.0f);
		StudentSubject stuSubjcet8= new StudentSubject(student8, mapSubjcet8);
		TreeMap<Subject, Float> mapSubjcet9 = new TreeMap<Subject, Float>();
		mapSubjcet9.put(Subject.Math, 2.0f);
		mapSubjcet9.put(Subject.History, 8.0f);
		mapSubjcet9.put(Subject.Music, 9.0f);
		StudentSubject stuSubjcet9= new StudentSubject(student9, mapSubjcet9);
		TreeMap<Subject, Float> mapSubjcet10 = new TreeMap<Subject, Float>();
		mapSubjcet10.put(Subject.Science, 2.0f);
		mapSubjcet10.put(Subject.Exercise, 8.0f);
		mapSubjcet10.put(Subject.Music, 4.0f);
		StudentSubject stuSubjcet10= new StudentSubject(student10, mapSubjcet10);
		
		
		LinkedList<StudentSubject> listStudent1= new LinkedList<StudentSubject>();
		listStudent1.add(stuSubjcet1);
		listStudent1.add(stuSubjcet2);
		listStudent1.add(stuSubjcet3);
		listStudent1.add(stuSubjcet4);
		listStudent1.add(stuSubjcet5);
		LinkedList<StudentSubject> listStudent2= new LinkedList<StudentSubject>();
		listStudent2.add(stuSubjcet6);
		listStudent2.add(stuSubjcet7);
		listStudent2.add(stuSubjcet8);
		listStudent2.add(stuSubjcet9);
		listStudent2.add(stuSubjcet10);
		ClassStudent clStudent1 = new ClassStudent(class1,listStudent1);
		ClassStudent clStudent2 = new ClassStudent(class2,listStudent2);
		LinkedList<ClassStudent> listClass1= new LinkedList<ClassStudent>();
		listClass1.add(clStudent1);
		LinkedList<ClassStudent> listClass2= new LinkedList<ClassStudent>();
		listClass2.add(clStudent2);
		
		UnitClass unitClass1= new UnitClass(unit1, listClass1);
		UnitClass unitClass2= new UnitClass(unit2, listClass2);
		LinkedList<UnitClass> listUnit1= new LinkedList<UnitClass>();
		listUnit1.add(unitClass1);
		listUnit1.add(unitClass2);
		
		School school1 = new School(1, "TH Nguyen Van Troi");
		School school2 = new School(2, "TH Hoang Quoc Viet");
		
		SchoolUnit schoolUnit= new SchoolUnit(school1,listUnit1);
		ListSchool listSchool= new ListSchool();
		listSchool.addSchool(schoolUnit);
		
		System.out.println("|Id\t|School\t|Id\t|Unit\t|Id\t| Class\t| Id\t| Full Name\t| Age\t| Score\t| Subject\\t\\t|");
		System.out.println(schoolUnit);
		
		
		

		System.out.println("___________5. Sort Score DEC:__________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		System.out.println("___________6. Sort Score ASC:__________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		System.out.println("___________7. Sort Name ASC:__________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		System.out.println("___________8. Sort Name DEC:__________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");

		System.out.println("___________9. Search Student:An_________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		listSchool.searchStudent("An");
		System.out.println("___________9. Search Student:An_________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		listSchool.searchStudent("Oc");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		
	}
	
}
