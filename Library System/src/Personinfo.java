
public class Personinfo {
	
    private String name;
    private String contact;
    private String nationality;
	
    
    public Personinfo(String name, String contact, String nationality) {
		super();
		this.name = name;
		this.contact = contact;
		this.nationality = nationality;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    public void displayinfo(){
    	System.out.println("Person Name"+name);
    	System.out.println("Contact Number"+contact);
    	System.out.println("Nationality"+nationality);
    
    }
    
}
