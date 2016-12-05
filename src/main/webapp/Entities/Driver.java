package Entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entitys.Author;
import Entitys.Supplier;


@Embeddable
@Entity
@Table(name = "Driver")

public class Driver {
	// variables
	
	@Id	
	@Column (name="idDriver", nullable=false, unique=true) 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long idDriver;
	
	@Column(nullable=false, length=20)	
	@Size(min=5, max=225) 
	@NotNull	
	private String fname;
	
	@Column(nullable=false, length=20)	
	@Size(min=5, max=225) 
	@NotNull	
	private String sname;


	@Author(author="Vera")
	// constructors
	public Driver(long idDriver, String fname, String sname)
	{
		
	}

	// Foreign Keys	
	
	
	
	// getters and setters

	public long getIdDriver() {
		return idDriver;
	}


	public void setIdDriver(long idDriver) {
		this.idDriver = idDriver;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}
	

}
