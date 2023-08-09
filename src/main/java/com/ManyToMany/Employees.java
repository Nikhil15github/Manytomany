package com.ManyToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employees 
{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private int id;
    
    @Column(name="employee")
	private String employee;
	
    @ManyToMany(cascade=CascadeType.ALL,mappedBy = "employee")
    private List<Projects> project;

	public int getId() 
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public List<Projects> getProject() {
		return project;
	}

	public void setProject(List<Projects> project) {
		this.project = project;
	}

	
    
    
    
}
