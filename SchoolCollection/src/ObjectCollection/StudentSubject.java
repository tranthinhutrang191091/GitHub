package objectcollection;

import java.util.Set;
import java.util.TreeMap;

import javax.security.auth.Subject;

import object.Student;

public class StudentSubject implements Comparable<StudentSubject>{
	private Student student;
	private TreeMap <object.Subject, Float> mapSubjcet;
	private TreeMap<Student, TreeMap> mapStudentSubjcet = new TreeMap<Student, TreeMap>();
	public StudentSubject() {
		this.student= new Student();
		this.mapSubjcet= new TreeMap<object.Subject,Float>();
		this.mapStudentSubjcet= new TreeMap<Student, TreeMap>();
	}
	public StudentSubject(Student student, TreeMap<object.Subject, Float> mapSubjcet1) {
		this.student = student;
		this.mapSubjcet = mapSubjcet1;
		this.mapStudentSubjcet.put(student,mapSubjcet1);
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public TreeMap getMapSubjcet() {
		return mapSubjcet;
	}
	public void setMapSubjcet(TreeMap mapSubjcet) {
		this.mapSubjcet = mapSubjcet;
	}
	
	public TreeMap  getMapStudentSubjcet() {
		return mapStudentSubjcet;
	}
	public void setMapStudentSubjcet(TreeMap  mapStudentSubjcet) {
		this.mapStudentSubjcet = mapStudentSubjcet;
	}
	@Override
	public String toString() {
		String result="";
		Set<Student> setStudent= this.mapStudentSubjcet.keySet();
		for (Student key : setStudent) {
			result+=key + "|" + this.mapStudentSubjcet.get(key)+"\n";
		}
		return result;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mapStudentSubjcet == null) ? 0 : mapStudentSubjcet.hashCode());
		result = prime * result + ((mapSubjcet == null) ? 0 : mapSubjcet.hashCode());
		result = prime * result + ((student == null) ? 0 : student.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentSubject other = (StudentSubject) obj;
		if (mapStudentSubjcet == null) {
			if (other.mapStudentSubjcet != null)
				return false;
		} else if (!mapStudentSubjcet.equals(other.mapStudentSubjcet))
			return false;
		if (mapSubjcet == null) {
			if (other.mapSubjcet != null)
				return false;
		} else if (!mapSubjcet.equals(other.mapSubjcet))
			return false;
		if (student == null) {
			if (other.student != null)
				return false;
		} else if (!student.equals(other.student))
			return false;
		return true;
	}
	@Override
	public int compareTo(StudentSubject o) {
		String nameThis=this.getStudent().getFullName();
		String nameO=o.getStudent().getFullName();
		return nameThis.compareTo(nameO);
	}
	
}
