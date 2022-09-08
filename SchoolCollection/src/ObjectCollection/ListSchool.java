package ObjectCollection;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import Object.School;

public class ListSchool  {
		private Set<School> listSchool;

		public ListSchool() {
			this.listSchool = new HashSet<School>();
		}
		public ListSchool(Set<School> listSchool) {
			this.listSchool = listSchool;
		}
		
		public Set<School> getListSchool() {
			return listSchool;
		}
		public void setListSchool(Set<School> listSchool) {
			this.listSchool = listSchool;
		}
		private void loadListSchool() {
			for(School school : listSchool) {
				System.out.println(school);
			}
		}
		public void addSchool(School school) {
			this.listSchool.add(school);
		}
		public boolean checkSchoolNull() {
			return this.listSchool.isEmpty();
		}
		public int countSchool() {
			return this.listSchool.size();
		}
		public void removeAllSchool() {
			this.listSchool.removeAll(listSchool);
		}
		public boolean checkSchool(School school) {
			return this.listSchool.contains(school);
		}
		public boolean removeSchool(School school) {
			return this.listSchool.remove(school);
		}
		public void searchSchool(String name) {
			int cout=0;
			for(School school: this.listSchool) {
				if(school.getNameSchool().indexOf(name)>=0) {
					System.out.println(school);
					cout++;
				}
			}
			if(cout==0) {
				System.out.println("Haven't school name: "+ name);
			}	
		}
		
}
