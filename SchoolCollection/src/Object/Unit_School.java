package Object;

public class Unit_School {
	private Unit unit;
	private School school;
	public Unit_School(Unit unit, School school) {
		this.unit = unit;
		this.school = school;
	}
	@Override
	public String toString() {
		return  unit.toString() + school.toString();
	}
	
}
