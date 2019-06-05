package com.example.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@SuppressWarnings({ "serial" })
@Entity
public class Location implements Serializable{
	@Id
	@GeneratedValue
	private Long id;
	private String city;
	@JsonIgnore
	@OneToMany(mappedBy="locationId",fetch=FetchType.LAZY)
	private Collection<CourseSession> courseSessions;

	public Location() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Collection<CourseSession> getCourseSessions() {
		return courseSessions;
	}

	public void setCourseSessions(Collection<CourseSession> courseSessions) {
		this.courseSessions = courseSessions;
	}

	public Location(String city) {
		super();
		this.city = city;
	}
	

	
	

}
