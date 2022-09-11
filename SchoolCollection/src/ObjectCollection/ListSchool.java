package objectcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import object.School;
import object.Student;

public class ListSchool {
	private HashSet<SchoolUnit> listSchool = new HashSet<SchoolUnit>();

	public ListSchool() {
		this.listSchool = new HashSet<SchoolUnit>();
	}

	public ListSchool(HashSet<SchoolUnit> listSchool) {
		this.listSchool = listSchool;
	}

	public HashSet<SchoolUnit> getListSchool() {
		return listSchool;
	}

	public void setListSchool(HashSet<SchoolUnit> listSchool) {
		this.listSchool = listSchool;
	}
	
	public void addSchool(SchoolUnit school) {
		this.listSchool.add(school);
	}
	public void searchStudent(String name) {
		int cout=0;
		for(SchoolUnit listSchool: this.listSchool) {
			for(UnitClass listUnit: listSchool.getListUnitClass()) {
				for(ClassStudent listClass: listUnit.getTreeClassStudent()) {
					for(StudentSubject listStudent : listClass.getStuSubjcet()) {
							if(listStudent.getStudent().getFullName().indexOf(name)>=0) {
								System.out.println(listStudent.getStudent());
								cout++;
							
						}
					}
				}
			}
		}
		if(cout==0) {
			System.out.println("Haven't student name: "+ name);
		}	
	}
	
}
