package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Details 
{

	@Id
	private String projectname;
    private String category;
    private String descriptions;
    private String startdate;
    private String enddate;
    private String comments;
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescriptions() {
		return descriptions;
	}
	public void setDescriptions(String descriptions) {
		this.descriptions = descriptions;
	}
	public String getStartdate() {
		return startdate;
	}
	public void setStartdate(String startdate) {
		this.startdate = startdate;
	}
	public String getEnddate() {
		return enddate;
	}
	public void setEnddate(String enddate) {
		this.enddate = enddate;
	}
	public String getcomments() {
		return comments;
	}
	public void setcomments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Details [projectname=" + projectname + ", category=" + category + ", descriptions=" + descriptions
				+ ", startdate=" + startdate + ", enddate=" + enddate + ", comments=" + comments + "]";
	}
	
	
	

    

}
