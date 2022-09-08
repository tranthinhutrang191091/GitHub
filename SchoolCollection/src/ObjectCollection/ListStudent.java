package ObjectCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import Object.Student;

public class ListStudent {
	private List<Student> listStudent;

	public ListStudent() {
		listStudent= new LinkedList<Student>();
		
	}

	public ListStudent(List<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public void addStudent(Student student) {
		this.listStudent.add(student);
	}
	public void loadListStudent() {
		for(Student student : listStudent) {
			System.out.println(student);
		}
	}
	public void searchStudent(String name) {
		int cout=0;
		for(Student student: this.listStudent) {
			if(student.getFullName().indexOf(name)>=0) {
				System.out.println(student);
				cout++;
			}
		}
		if(cout==0) {
			System.out.println("Haven't student name: "+ name);
		}	
	}
	public void sortStudentScoreDEC() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getScore()<student2.getScore()) {
					return 1;
				}else if(student1.getScore()>student2.getScore()) {
					return -1;
				}else {
				return 0;
				}
				
			}
		});
	}
	public void sortStudentScoreASC() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				if(student1.getScore()<student2.getScore()) {
					return -1;
				}else if(student1.getScore()>student2.getScore()) {
					return 1;
				}else {
				return 0;
				}
				
			}
		});
	}
	public void sortStudentNameASC() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				String nameThis=student1.getName();
				String nameO=student2.getName();
				return nameThis.compareTo(nameO);
				}
		});
	}
	public void sortStudentNameDEC() {
		Collections.sort(this.listStudent, new Comparator<Student>() {

			@Override
			public int compare(Student student1, Student student2) {
				String nameThis=student1.getName();
				String nameO=student2.getName();
				return nameO.compareTo(nameThis);
				}
		});
	}
}
