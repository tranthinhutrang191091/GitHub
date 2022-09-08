package Object;

public class Class_Unit_School {
	private Class cLass;
	private Unit_School unitSchool;
	public Class_Unit_School(Class cLass, Unit_School unitSchool) {
		this.cLass = cLass;
		this.unitSchool = unitSchool;
	}
	@Override
	public String toString() {
		return cLass.toString() +  unitSchool.toString();
	}
	
}
