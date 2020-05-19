package org.sci.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Zone implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3521281676519143099L;
	@Id
	private String zone_id;
	private String zonename;
	public Zone()
	{
		
	}
	public Zone(String zone_id, String zonename) {
		super();
		this.zone_id = zone_id;
		this.zonename = zonename;
	}
	public String getZone_id() {
		return zone_id;
	}
	public void setZone_id(String zone_id) {
		this.zone_id = zone_id;
	}
	public String getZonename() {
		return zonename;
	}
	public void setZonename(String zonename) {
		this.zonename = zonename;
	}
	@Override
	public String toString() {
		return "Zone [zone_id=" + zone_id + ", zonename=" + zonename + "]";
	}

}
