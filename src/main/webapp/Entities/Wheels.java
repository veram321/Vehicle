package Entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entitys.Author;
import Entitys.Supplier;


@Embeddable
@Entity
@Table(name = "Wheels")

public class Wheels {

	
	// variables
	
				@Id	
				@Column (name="idWheels", nullable=false, unique=true) 
				@GeneratedValue(strategy=GenerationType.IDENTITY) 
				private long idWheels;
				
				@Column(nullable=false, length=20)	
				@Size(min=5, max=225) 
				@NotNull	
				private String tyres;
			
			
				@Author(author="Vera")
				// constructors
				public Wheels(long idWheels, String tyres)
				{
					
				}
				
				// Foreign Keys	
				
				
				
				// getters and setters


				public long getIdWheels() {
					return idWheels;
				}


				public void setIdWheels(long idWheels) {
					this.idWheels = idWheels;
				}


				public String getTyres() {
					return tyres;
				}


				public void setTyres(String tyres) {
					this.tyres = tyres;
				}

				
				
}
