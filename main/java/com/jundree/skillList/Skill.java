package com.jundree.skillList;

public abstract class Skill {
	double totalExperience;
	int level;

	public double getExperience() {
		return totalExperience;
	}

	public void setExperience(double experience) {
		this.totalExperience = experience;
	}
	
	public void addExperience(double experience) {
		this.totalExperience += experience;
	}
}
