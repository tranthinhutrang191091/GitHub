package objectcollection;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import object.Class;
import object.Unit;

public class UnitClass {
	private Unit unit;
	private LinkedList<ClassStudent> listClassStudent;
	private TreeMap<Unit, LinkedList> mapUnitClass = new TreeMap<Unit, LinkedList>();

	public UnitClass() {
		this.unit = new Unit();
		this.listClassStudent = new LinkedList<ClassStudent>();
		this.mapUnitClass = new TreeMap<Unit, LinkedList>();
	}

	public UnitClass(Unit unit, LinkedList<ClassStudent> listClassStudent) {

		this.unit = unit;
		this.listClassStudent = listClassStudent;
		this.mapUnitClass.put(unit, listClassStudent);
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public LinkedList<ClassStudent> getTreeClassStudent() {
		return listClassStudent;
	}

	public void setTreeClassStudent(TreeSet<ClassStudent> treeClassStudent) {
		this.listClassStudent = listClassStudent;
	}

	public TreeMap<Unit, LinkedList> getMapUnitClass() {
		return mapUnitClass;
	}

	public void setMapUnitClass(TreeMap<Unit, LinkedList> mapUnitClass) {
		this.mapUnitClass = mapUnitClass;
	}

	@Override
	public String toString() {
		String result = "";
		Set<Unit> setUnit = this.mapUnitClass.keySet();
		for (Unit key : setUnit) {
			for (ClassStudent cs : this.listClassStudent) {
				Set<Class> setClass = cs.getMapClassStudent().keySet();
				for (Class cl : setClass) {
					for (StudentSubject ss : cs.getStuSubjcet()) {
						result += key.toString() + cl.toString() + ss.toString();
					}
				}
			}
		}
		return result;
	}

}
