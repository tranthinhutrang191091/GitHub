package com.daicent;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import Object.Class;
import Object.School;
import Object.Student;
import Object.Unit;
import Object.Unit_School;
import ObjectCollection.ListSchool;
import ObjectCollection.ListStudent;

public class SchoolMain {
	public static void main(String[] args) {
		System.out.println("___________1. List School:__________");
		System.out.println("Id\t| Name School\t\t|");
		School school1= new School(1,"TH Nguyen Van Troi");
		School school2= new School(2,"TH Hoang Quoc Viet");
		Map<Integer, School> mapSchool= new TreeMap<Integer, School>();
		mapSchool.put(school1.getIdSchool(), school1);
		mapSchool.put(school2.getIdSchool(), school2);
		Set<Integer> setIdSchool= mapSchool.keySet();
        for (Integer key : setIdSchool) {
            System.out.println(key + "\t" + mapSchool.get(key));
        }
        
        System.out.println("___________2. Unit School:__________");
		System.out.println("Id\t| Name\t|");
        Unit unit1= new Unit(1,"Khoi 1");
        Unit unit2= new Unit(2,"Khoi 2");
        Map<Integer, Unit> mapUnit= new TreeMap<Integer, Unit>();
        mapUnit.put(unit1.getIdUnit(), unit1);
        mapUnit.put(unit2.getIdUnit(), unit2);
        Set<Integer> setUbit= mapUnit.keySet();
        for (Integer key : setUbit) {
            System.out.println(key + "\t" + mapUnit.get(key));
        }
        
        System.out.println("___________3. Class School:__________");
		System.out.println("Id\t| Name\t|");
        Class class1= new Class(1,"1A");
        Class class2= new Class(2,"1B");
        Map<Integer, Class> mapClass= new TreeMap<Integer, Class>();
        mapClass.put(class1.getIdClass(), class1);
        mapClass.put(class2.getIdClass(), class2);
        Set<Integer> setClass= mapClass.keySet();
        for (Integer key : setClass) {
            System.out.println(key + "\t" + mapClass.get(key));
        }
        
        System.out.println("___________4. Student School:__________");
		System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
		Student student1= new Student(1, "Tran Thi Oc", 10, 5.0f);
		Student student2= new Student(2, "Tran Van An", 9, 9.0f);
		Student student3= new Student(3, "Tran Thi Trang", 9, 7.0f);
		Student student4= new Student(4, "Tran Thi An", 9, 10.0f);
		
       ListStudent listStudent = new ListStudent();
       listStudent.addStudent(student1);
       listStudent.addStudent(student2);
       listStudent.addStudent(student3);
       listStudent.addStudent(student4);
       listStudent.loadListStudent();
       listStudent.sortStudentScoreDEC();
       System.out.println("___________5. Sort Score DEC:__________");
       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.loadListStudent();
       
       listStudent.sortStudentScoreASC();
       System.out.println("___________6. Sort Score ASC:__________");
       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.loadListStudent();
       
       listStudent.sortStudentNameASC();
       System.out.println("___________7. Sort Name ASC:__________");
       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.loadListStudent();

       listStudent.sortStudentNameDEC();
       System.out.println("___________8. Sort Name DEC:__________");
       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.loadListStudent();
       
       System.out.println("___________9. Search Student:__________");
       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.searchStudent("Thanh");

       System.out.println("Id\t| Full Name\t| Age\t| Score\t|");
       listStudent.searchStudent("O");
	}
}
