package com.revature.models;

import java.util.ArrayList;
import java.util.List;

public class SuperPrison {
	private int spId;
	private String name;
	private String location;
	
	private List<SuperVillain> villList = new ArrayList<SuperVillain>();
	
	public SuperPrison() {}

	public SuperPrison(String name, String location, List<SuperVillain> villList) {
		super();
		this.name = name;
		this.location = location;
		this.villList = villList;
	}

	public SuperPrison(int spId, String name, String location, List<SuperVillain> villList) {
		super();
		this.spId = spId;
		this.name = name;
		this.location = location;
		this.villList = villList;
	}

	public int getSpId() {
		return spId;
	}

	public void setSpId(int spId) {
		this.spId = spId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<SuperVillain> getVillList() {
		return villList;
	}

	public void setVillList(List<SuperVillain> villList) {
		this.villList = villList;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + spId;
		result = prime * result + ((villList == null) ? 0 : villList.hashCode());
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
		SuperPrison other = (SuperPrison) obj;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (spId != other.spId)
			return false;
		if (villList == null) {
			if (other.villList != null)
				return false;
		} else if (!villList.equals(other.villList))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SuperPrison [spId=" + spId + ", name=" + name + ", location=" + location + ", villList=" + villList
				+ "]";
	}
	
	
}
