package datas;

import java.util.ArrayList;
import java.util.List;

public class Person<Skill> {
	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Skill> getSkillset() {
		return skillset;
	}

	public void setSkillset(List<Skill> skillset) {
		this.skillset = skillset;
	}

	public String email;
	List<Skill> skillset = new ArrayList<Skill>();

}
