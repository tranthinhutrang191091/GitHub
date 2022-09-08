package Object;

public class Unit implements Comparable<Unit>{
	private int idUnit;
	private String nameUnit;
	
	
	public Unit(int idUnit) {
		this.idUnit = idUnit;
	}

	public Unit(int idUnit, String nameUnit) {
		this.idUnit = idUnit;
		this.nameUnit = nameUnit;
	}

	public int getIdUnit() {
		return idUnit;
	}

	public void setIdUnit(int idUnit) {
		this.idUnit = idUnit;
	}

	public String getNameUnit() {
		return nameUnit;
	}

	public void setNameUnit(String nameUnit) {
		this.nameUnit = nameUnit;
	}

	@Override
	public String toString() {
		return "|" + nameUnit + "\t|";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameUnit == null) ? 0 : nameUnit.hashCode());
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
		Unit other = (Unit) obj;
		if (nameUnit == null) {
			if (other.nameUnit != null)
				return false;
		} else if (!nameUnit.equals(other.nameUnit))
			return false;
		return true;
	}

	@Override
	public int compareTo(Unit o) {
		String nameThis=this.getNameUnit();
		String nameO=o.getNameUnit();
		return nameThis.compareTo(nameO);
	}
	
}
