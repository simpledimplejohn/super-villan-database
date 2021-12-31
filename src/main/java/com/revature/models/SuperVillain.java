package com.revature.models;

import java.util.List;

public class SuperVillain {
	private int svillId;
	private String name;
	private String superPower;
	private double bounty;
	
	private List<Crime> crimes;
	private SuperPrison superPrisonHolder;
	
	SuperVillain(){}

	public SuperVillain(String name, String superPower, double bounty, List<Crime> crimes,
			SuperPrison superPrisonHolder) {
		super();
		this.name = name;
		this.superPower = superPower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.superPrisonHolder = superPrisonHolder;
	}

	public SuperVillain(int svillId, String name, String superPower, double bounty, List<Crime> crimes,
			SuperPrison superPrisonHolder) {
		super();
		this.svillId = svillId;
		this.name = name;
		this.superPower = superPower;
		this.bounty = bounty;
		this.crimes = crimes;
		this.superPrisonHolder = superPrisonHolder;
	}

	public int getSvillId() {
		return svillId;
	}

	public void setSvillId(int svillId) {
		this.svillId = svillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSuperPower() {
		return superPower;
	}

	public void setSuperPower(String superPower) {
		this.superPower = superPower;
	}

	public double getBounty() {
		return bounty;
	}

	public void setBounty(double bounty) {
		this.bounty = bounty;
	}

	public List<Crime> getCrimes() {
		return crimes;
	}

	public void setCrimes(List<Crime> crimes) {
		this.crimes = crimes;
	}

	public SuperPrison getSuperPrisonHolder() {
		return superPrisonHolder;
	}

	public void setSuperPrisonHolder(SuperPrison superPrisonHolder) {
		this.superPrisonHolder = superPrisonHolder;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(bounty);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((crimes == null) ? 0 : crimes.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((superPower == null) ? 0 : superPower.hashCode());
		result = prime * result + ((superPrisonHolder == null) ? 0 : superPrisonHolder.hashCode());
		result = prime * result + svillId;
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
		SuperVillain other = (SuperVillain) obj;
		if (Double.doubleToLongBits(bounty) != Double.doubleToLongBits(other.bounty))
			return false;
		if (crimes == null) {
			if (other.crimes != null)
				return false;
		} else if (!crimes.equals(other.crimes))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (superPower == null) {
			if (other.superPower != null)
				return false;
		} else if (!superPower.equals(other.superPower))
			return false;
		if (superPrisonHolder == null) {
			if (other.superPrisonHolder != null)
				return false;
		} else if (!superPrisonHolder.equals(other.superPrisonHolder))
			return false;
		if (svillId != other.svillId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SuperVillain [svillId=" + svillId + ", name=" + name + ", superPower=" + superPower + ", bounty="
				+ bounty + ", crimes=" + crimes + ", superPrisonHolder=" + superPrisonHolder + "]";
	}
	
	
}
