package com.revature.models;

import com.revature.annotations.Column;
import com.revature.annotations.Entity;
import com.revature.annotations.Id;
import com.revature.annotations.Table;


@Table(tableName = "crimes")
@Entity
public class Crime {
	
	@Id
	@Column(columnName = "crime_id")
	private int crimeId;
	@Column(columnName = "crime_name")
	private String crimeName;
	@Column(columnName = "crime_description")
	private String description;
	
	public Crime() {}

	public Crime(String crimeName, String description) {
		super();
		this.crimeName = crimeName;
		this.description = description;
	}

	public Crime(int crimeId, String crimeName, String description) {
		super();
		this.crimeId = crimeId;
		this.crimeName = crimeName;
		this.description = description;
	}

	public int getCrimeId() {
		return crimeId;
	}

	public void setCrimeId(int crimeId) {
		this.crimeId = crimeId;
	}

	public String getCrimeName() {
		return crimeName;
	}

	public void setCrimeName(String crimeName) {
		this.crimeName = crimeName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + crimeId;
		result = prime * result + ((crimeName == null) ? 0 : crimeName.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
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
		Crime other = (Crime) obj;
		if (crimeId != other.crimeId)
			return false;
		if (crimeName == null) {
			if (other.crimeName != null)
				return false;
		} else if (!crimeName.equals(other.crimeName))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Crime [crimeId=" + crimeId + ", crimeName=" + crimeName + ", description=" + description + "]";
	}
	
	
}
