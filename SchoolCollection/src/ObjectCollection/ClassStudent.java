package objectcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import object.Class;
import object.Student;

public class ClassStudent implements Comparable<ClassStudent>{
	private Class classO;
	private LinkedList<StudentSubject> stuSubjcet;
	private TreeMap<Class, LinkedList> mapClassStudent = new TreeMap<Class, LinkedList>();

	public ClassStudent() {
		this.classO = new Class();
		this.stuSubjcet = new LinkedList<StudentSubject>();
		this.mapClassStudent = new TreeMap<Class, LinkedList>();
	}

	public ClassStudent(Class classO, LinkedList<StudentSubject> stuSubjcet) {

		this.classO = classO;
		this.stuSubjcet = stuSubjcet;
		this.mapClassStudent.put(classO, stuSubjcet);
	}

	public Class getClassO() {
		return classO;
	}

	public void setClassO(Class classO) {
		this.classO = classO;
	}

	public LinkedList<StudentSubject> getStuSubjcet() {
		return stuSubjcet;
	}

	public void setStuSubjcet(LinkedList<StudentSubject> stuSubjcet) {
		this.stuSubjcet = stuSubjcet;
	}

	public TreeMap<Class, LinkedList> getMapClassStudent() {
		return mapClassStudent;
	}

	public void setMapClassStudent(TreeMap<Class, LinkedList> mapClassStudent) {
		this.mapClassStudent = mapClassStudent;
	}

	@Override
	public String toString() {
		String result = "";
		Set<Class> setClass = this.mapClassStudent.keySet();
		for (Class key : setClass) {
			for (StudentSubject ss : this.stuSubjcet) {
				result += key + ss.toString();
			}
		}
		return result;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classO == null) ? 0 : classO.hashCode());
		result = prime * result + ((mapClassStudent == null) ? 0 : mapClassStudent.hashCode());
		result = prime * result + ((stuSubjcet == null) ? 0 : stuSubjcet.hashCode());
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
		ClassStudent other = (ClassStudent) obj;
		if (classO == null) {
			if (other.classO != null)
				return false;
		} else if (!classO.equals(other.classO))
			return false;
		if (mapClassStudent == null) {
			if (other.mapClassStudent != null)
				return false;
		} else if (!mapClassStudent.equals(other.mapClassStudent))
			return false;
		if (stuSubjcet == null) {
			if (other.stuSubjcet != null)
				return false;
		} else if (!stuSubjcet.equals(other.stuSubjcet))
			return false;
		return true;
	}

	@Override
	public int compareTo(ClassStudent o) {
		String nameThis=this.stuSubjcet.toString();
		String nameO=o.stuSubjcet.toString();
		return nameThis.compareTo(nameO);
	}

	
}
