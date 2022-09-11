package objectcollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

import object.Class;
import object.School;
import object.Student;
import object.Unit;

public class SchoolUnit {
	private School school;
	private LinkedList<UnitClass> listUnitClass;
	private TreeMap<School, LinkedList> mapSchoolUnit= new TreeMap<School, LinkedList>();
	public SchoolUnit() {
		this.school = new School();
		this.listUnitClass = new LinkedList<UnitClass>();
		this.mapSchoolUnit = new TreeMap<School, LinkedList>();
	}
	public SchoolUnit(School school, LinkedList<UnitClass> listUnitClass) {
		
		this.school = school;
		this.listUnitClass = listUnitClass;
		this.mapSchoolUnit.put(school, listUnitClass);
		
	}
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public LinkedList<UnitClass> getListUnitClass() {
		return listUnitClass;
	}
	public void setListUnitClass(LinkedList<UnitClass> listUnitClass) {
		this.listUnitClass = listUnitClass;
	}
	public TreeMap<School, LinkedList> getMapSchoolUnit() {
		return mapSchoolUnit;
	}
	public void setMapSchoolUnit(TreeMap<School, LinkedList> mapSchoolUnit) {
		this.mapSchoolUnit = mapSchoolUnit;
	}
	@Override
	public String toString() {
		String result = "";
		Set<School>setSchool= this.mapSchoolUnit.keySet();
		for(School school: setSchool) {
			for(UnitClass uc: this.listUnitClass) {
				Set<Unit> setUnit= uc.getMapUnitClass().keySet();
				for(Unit u: setUnit) {
					for (ClassStudent cs : uc.getTreeClassStudent()) {
						Set<Class> setClass = cs.getMapClassStudent().keySet();
						for (Class cl : setClass) {
							for (StudentSubject ss : cs.getStuSubjcet()) {
								result += school.toString() + u.toString() + cl.toString() + ss.toString();
							}
						}
					}
				}
			}
		}
		
		return result;
	}
	
}
