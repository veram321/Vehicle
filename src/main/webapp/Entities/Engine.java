package Entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entitys.Author;
import Entitys.Supplier;


@Embeddable
@Entity
@Table(name = "Engine")

public class Engine {

	// variables
	
		@Id	
		@Column (name="idEngine", nullable=false, unique=true) 
		@GeneratedValue(strategy=GenerationType.IDENTITY) 
		private long idEngine;
		
		@Column(nullable=false, length=20)	
		@Size(min=5, max=225) 
		@NotNull	
		private String gasType;

		@Column(nullable = false)
		@NotNull
		private double volume;
	
	
		@Author(author="Vera")
		// constructors
		public Engine(long idEngine, String gasType, double volume)
		{
			
		}

	// Foreign Keys	
		
		
		
	// getters and setters

		public long getIdEngine() {
			return idEngine;
		}


		public void setIdEngine(long idEngine) {
			this.idEngine = idEngine;
		}


		public String getGasType() {
			return gasType;
		}


		public void setGasType(String gasType) {
			this.gasType = gasType;
		}


		public double getVolume() {
			return volume;
		}


		public void setVolume(double volume) {
			this.volume = volume;
		};
		
	
		
		
		
		
		
		
		
}
