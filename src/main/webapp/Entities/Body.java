package Entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import Entitys.Author;
import Entitys.Supplier;


@Embeddable
@Entity
@Table(name = "Body")

public class Body {

	// variables
	
			@Id	
			@Column (name="idBody", nullable=false, unique=true) 
			@GeneratedValue(strategy=GenerationType.IDENTITY) 
			private long idBody;
			
			@Column(nullable=false, length=20)	
			@Size(min=5, max=225) 
			@NotNull	
			private String style;
		
		
			@Author(author="Vera")
			// constructors
			public Body(long idBody, String style)
			{
				
			}

			// Foreign Keys	
				
				
				
			// getters and setters


			public long getIdBody() {
				return idBody;
			}


			public void setIdBody(long idBody) {
				this.idBody = idBody;
			}


			public String getStyle() {
				return style;
			}


			public void setStyle(String style) {
				this.style = style;
			}

			
			
			
}
