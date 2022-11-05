
package littlehelper2;

public class account {
    private String firstname  ;  
    private String lastname ; 
    private int ID ; 
    private String email ; 
    private String username ;  
    account [] stud =new account [50]; 
     
     
    public account () { 
     
} 
     
    public account (String first , String last , String email , String username, int idn ){ 
         
        this.firstname = first ; 
        this.lastname = last ; 
        this.email = email ;  
        this.username =username; 
        this.ID = idn ; 
         
         
    } 
     
    public void setFirstname(String firstname){ 
         
        this.firstname =firstname; 
         
    } 
     
    public void setLirstname(String lasttname){ 
         
        this.lastname =lasttname; 
         
    } 
    public void setEmail (String email){ 
         
        this.email =email; 
         
    } 
     
    public void setID(int ID ){ 
         
        this.ID =ID; 
         
    } 
     
    public void setUsername(String username){ 
         
        this.username = username ; 
    } 
     
     
    public String getFirstn(){ 
         
        return firstname; 
    } 
     
    public String getLasttn(){ 
         
        return lastname; 
    } 
     
    public String getEmail(){ 
         
        return email; 
    } 
    public String getUsername(){ 
         
        return username; 
    } 
    public int getID(){ 
         
        return ID; 
    } 
    public void display () 
    { 
       System.out.println("-First Name : " + firstname +" \n-Last Name : "  
            + lastname + "\n-ID : " + ID + "\n-Email adress : " + email + "\n-User name: " + username ); 
    } 
 
     
}
