package Object;

public class School implements Comparable<School> {
	private int idSchool;
	private String nameSchool;
	
	public School(int idSchool) {
		this.idSchool = idSchool;
	}
	public School(int idSchool, String nameSchool) {
		this.idSchool = idSchool;
		this.nameSchool = nameSchool;
	}
	public int getIdSchool() {
		return idSchool;
	}
	public void setIdSchool(int idSchool) {
		this.idSchool = idSchool;
	}
	public String getNameSchool() {
		return nameSchool;
	}
	public void setNameSchool(String nameSchool) {
		this.nameSchool = nameSchool;
	}
	@Override
	public String toString() {
		return "|" + nameSchool + "\t|";
	}
	@Override
	public int compareTo(School o) {
		return this.idSchool-o.idSchool;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSchool;
		result = prime * result + ((nameSchool == null) ? 0 : nameSchool.hashCode());
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
		School other = (School) obj;
		if (idSchool != other.idSchool)
			return false;
		if (nameSchool == null) {
			if (other.nameSchool != null)
				return false;
		} else if (!nameSchool.equals(other.nameSchool))
			return false;
		return true;
	}
	
	
}
