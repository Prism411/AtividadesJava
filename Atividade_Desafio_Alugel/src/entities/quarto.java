package entities;

public class quarto {
	private String name ="a";
	private String email;


 public quarto(String name, String email) {
	 this.name = name;
	 this.email = email;

 }
 public void setName(String name) {
	 this.name = name;
 }
 
 public String getName() {
	 return name;
 }
 
 public String getEmail() {
	 return email;
 }
 
 public String toString() {
	 return String.format("Quarto de %s%nEmail: %s", name,email );
 }

 
}

