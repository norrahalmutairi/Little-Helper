
package littlehelper2;


public class lecture {
    private String Lecname ;  
    private int Lecid ;  
    private int starthour ;  
    private int Endmin ;  
  
     
    public lecture ()  
    { 
         
    } 
     
   
    public lecture(String name , int id , int start , int end ) 
    { 
        this.Lecname = name ; 
        this.Lecid = id ;  
        this.starthour = start ; 
        this.Endmin = end; 
    } 
     
    public void setLecName (String Lecname)  
    { 
        this.Lecname = Lecname ;  
    } 
    public void setLecId (int Lecid) { 
        this.Lecid = Lecid ; 
    } 
    public void setStart (int starthour) 
    { 
        this.starthour = starthour; 
    } 
    public void setEnd (int Endmin) 
    { 
        this.Endmin = Endmin; 
    } 
     
    public String getLecName( ) 
    { 
        return Lecname ; 
    } 
    public int getLecId ( )  
    { 
        return Lecid; 
    } 
    public int getStart () 
    { 
        return starthour; 
    } 
    public int getEnd () 
    { 
        return Endmin; 
    } 
    public void displayapp () 
    { 
        System.out.println("-Lec ID : " +Lecid +"\n-Name of class : " + Lecname + "\n-Start hour " + starthour + ": 00" + "\n-End Hour : " + Endmin + ":00" ); 
    } 
     
}
