package Object;

public class Class implements Comparable<Class> {
	private int idClass;
	private String nameClass;
	public Class(int idClass) {
		this.idClass = idClass;
	}
	public Class(int idClass, String nameClass) {
		this.idClass = idClass;
		this.nameClass = nameClass;
	}
	public int getIdClass() {
		return idClass;
	}
	public void setIdClass(int idClass) {
		this.idClass = idClass;
	}
	public String getNameClass() {
		return nameClass;
	}
	public void setNameClass(String nameClass) {
		this.nameClass = nameClass;
	}
	
	@Override
	public String toString() {
		return "|"+ nameClass + "\t|";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameClass == null) ? 0 : nameClass.hashCode());
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
		Class other = (Class) obj;
		if (nameClass == null) {
			if (other.nameClass != null)
				return false;
		} else if (!nameClass.equals(other.nameClass))
			return false;
		return true;
	}
	@Override
	public int compareTo(Class o) {
		String nameThis=this.getNameClass();
		String nameO=o.getNameClass();
		return nameThis.compareTo(nameO);
	}
	
}
