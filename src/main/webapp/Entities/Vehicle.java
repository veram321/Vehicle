package Entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entitys.Author;
import Entitys.Supplier;


@Embeddable
@Entity
@Table(name = "Vehicle")

public class Vehicle {

	
// variables
	
	@Id	
	@Column (name="idVehicle", nullable=false, unique=true) 
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private long idVehicle;
	
	@Column(nullable=false, length=20)	
	@Size(min=5, max=225) 
	@NotNull	
	private String model;


	@Author(author="Vera")
	// constructors
	public Vehicle(long idVehicle, String model)
	{
		
	}

// Foreign Keys	

// Cardinality
	
	
	
	
// getters and setters
		
	public long getIdVehicle() {
		return idVehicle;
	}


	public void setIdVehicle(long idVehicle) {
		this.idVehicle = idVehicle;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}
	
	
	
}
