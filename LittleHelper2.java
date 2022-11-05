
package littlehelper2;
import java.util.Scanner; 
import java.util.*; // have all packages 
import java.util.ArrayList;  
 
public class LittleHelper2 {
    static account [] student = new account [50]; 
    static account a = new account(); 
    static String usernamechk ; 
     
     
    static appountiment app = new appountiment(); 
    static lecture l = new lecture (); 
    static appountiment [] lect = new appountiment [50] ; 
    //static String usernamechk;  
     
   static Membership membership = new Membership();
    // counters 
    static int studNO = 0; // count the number of studnt 
    static int lecNO = 1; // count number of lectures and to idtify whic leture is
    public static void main(String[] args) {
        student[0] = new account ("Jinan" , "Alsaihti" , "jija@hotmail.com","JIJA" , 1); //assign one student for sign in method  
       studNO++;
         student[1] = new account ("Norah" , "AlMutairi" , "norahs.almutairi3@gmail.com","NORAH" , 2); //assign one student for sign in method  
       studNO++;
        student[2] = new account ("Fouz" , "AlKhaldi" , "fouz@hotmail.com","FOUZ" , 3); //assign one student for sign in method  
        studNO++;
         student[3] = new account ("Khloud" , "Alhajri" , "khloud@gmail.com","KHLOUD" , 4); //assign one student for sign in method  
        studNO++;
        student[4] = new account ("Danah" , "Albakheet" , "danah@gmail.com","DANAH" , 5); //assign one student for sign in method  
        studNO++;
        // only simple introduction  
         
        System.out.println("*******Welcome to ( Little Helper) to help you studying wherever you are***********\n---------------------- "); // intro 
        System.out.println("*******Our sevices are : \n 1 - Private classes with best teachers \n 2- Summrize : you can simplify your course \n 3- and you can be a  small teacher for students ********\n------------------------ "); 
        mainmenu (); 
       
    } 
     
    //main method  
     
public static void mainmenu () { 
         
        boolean inputflag = true ; 
        do{ 
             
            Scanner input = new Scanner (System.in); 
             
        System.out.println("Menu : \n 1- create new account (Sign up) \n 2- Sign in "); 
        int accountchoice = input .nextInt(); 
        
        switch (accountchoice){ 
            case 1 : 
                 SignUP(); // create new account  
                break; 
            case 2 : 
                signin(student); // if user have already account 
                break;  
            default: 
                System.out.println(" invalid input"); // if user put another number 
                inputflag = false; 
                 
        } 
        }while (!inputflag); 
        } 

public static void SignUP (){ // create a new account  
 Scanner infoinput = new Scanner (System.in); 
 
 System.out.println("****Welcome***** \n fill the following information to join to our school "); 
 //account accobj = new account (); 
 boolean infoflag = false ; 
 
 String first ; 
 String last ; 
 String username ; 
 String email ; 
 int id = 0 ; 
 
 
 do { //fill information of user 
 System.out.println("Your First name : \n >> "); 
 first = infoinput.nextLine(); 
 
 System.out.println("Your Last name : \n >> "); 
 last = infoinput.nextLine(); 
 
 System.out.println("username: \n >> "); 
 username = infoinput.nextLine(); 
 username = username.toUpperCase(); 
 
 System.out.println("Your Email adress to contact : \n >> "); 
 email = infoinput.nextLine(); 
 
 
 student [studNO] = new account (first , last , email, username , id ); 
//paremtrized constructor 
 
 System.out.println(" Hello "+first + " THANK YOU for joining us, your < SHORT NUMBER > is " + " [" + (studNO) + "]" ); 
studNO ++ ; ; // increase the counter of students , will use it to inditfy the student 

 System.out.println("DO you want to create a new account or exit \n 1- Create new account \n 2- Exit to interface menu"); 
 int infochoice1 = infoinput .nextInt(); 
 
 switch(infochoice1) { 
 case 1 : 
 infoflag = false ; // create new account 
 break ; 
 case 2 : 
 infoflag = true ; // exit to interface menu 
 break; 
 default: 
 System.out.println(" invalid input"); // if user put wrong input 
 infoflag= false; 
 break; 
 } 
 }while (infoflag = false); 
 
 
 signin(student ); 
 
    } 
// sign in method  
public static void signin (account [] student ) { 
       Scanner in = new Scanner (System.in); 
 
 String namechk ; 
 int numchk ; 
 boolean flag = true ; 
 int choice ; 
 
 do { 
 System.out.println ("enter your short number : ") ; 
 numchk = in.nextInt(); 
 if (numchk > studNO ) // cheack if exeeds number of student or not 
 { 
 System.out.println ("This number does not exit , if you want create a new account \n enter (1) \n to try again enter (2) \n Main menu (3)") ; 
 int cho2 = in.nextInt(); 
 
 if(cho2 == 1) 
 { 
 SignUP (); 
 } 
 else if (cho2 == 2 ) 
 { 
 signin(student); 
 } 
 else if (cho2 == 3 ) 
 { 
 mainmenu (); 
 } 
 else { 
 System.out.println ("Invalid input ") ; 
 mainmenu (); 
 } 
 } 
 
 System.out.println ("enter your username : ") ; 
 namechk = in.next(); 
 namechk = namechk .toUpperCase(); // to cheak without any mistake 
 
 if(student[numchk].getUsername() == null ) 
 { 
 System.out.println ("invalid input , maybe you do not have an account " ) ; 
 
 } 
 else 
 { 
 if (student[numchk].getUsername().equals(namechk)) 
 { 
 System.out.println("you sign in suesscfully "); 
displayinterface ( );
 } 
 else 
 { 
 System.out.println("error, 1 if want to try again ,\n 0 to exit "); 
 choice = in.nextInt(); 
 switch (choice) 
 { 
 case 1 : 
 signin(student); 
 break ; 
 case 0 : 
 mainmenu (); 
 } 
 
 } 
 
 } 
 }while (flag = false ); 
 mainmenu (); 
   
} 

public static void displayinterface ( ) {  
       Scanner appInput = new Scanner(System.in);

        System.out.println("*****Belive And Achieve *** \n");
        System.out.println(" interface menu ");
        System.out.println("----------------------------------------");
        System.out.println("1- Add Appointment ");
        System.out.println("2- Delete Appointment ");
        System.out.println("3- Display Appointment and Inforamtion ");
        System.out.println("4- Get Membership ");
        System.out.println("5- Exit to main menu");

        System.out.print(">>");

        int appchoi = appInput.nextInt();

        switch (appchoi) {

            case 1:
                addappointment();
                break;

            case 2:
                deleteappointment();
                break;
            case 3:
                dsplayinfo(student, studNO);
                break;
            case 4:
                membership.newMember();
                displayinterface();
                break;
                
                case 5:
                System.exit(0);
                break;
            default:
                System.out.println("invalid input try again");
                displayinterface();
                break;

        
        } 
         
    }  

public static void addappointment () 
    { 
       Scanner in = new Scanner (System.in); 
        int appchoi ; 
        int breakcho ; 
         
         
        do { 
             
        System.out.println("******Avilable Lectures : \n *** "); 
        app.display(); // display lectures time from app... class  
        System.out.println("choice number of lecture class : "); 
        appchoi = in.nextInt(); 
         
        switch(appchoi) 
        { 
            case 1 :  
                lect[lecNO] = new appountiment ("Math" , 1 , 8 ,9 ); 
                 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break; 
            case 2 :  
                lecNO=2;
                lect[lecNO] = new appountiment ("Physics" , 2 , 9 ,10 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 3 :  
                 lecNO=3;
                lect[lecNO] = new appountiment ("Basics of Programming" , 3 , 10,11 );
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 4 :
                 lecNO=4;
                lect[lecNO] = new appountiment ("History" , 4 , 11 ,12 ); 
                 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
                 
            case 5 :  
                 lecNO=5;
                lect[lecNO] = new appountiment ("Networks" , 5 , 12 ,1 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 6 :  
                 lecNO=6;
                lect[lecNO] = new appountiment ("Chemistry" , 6 , 1 ,2 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 7:
                 lecNO=7;
                lect[lecNO] = new appountiment ("Digital Hardwere " , 7 , 2 ,3 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 8:  
                 lecNO=8;
                lect[lecNO] = new appountiment ("Biology" , 8 , 3 ,4 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 9:  
                 lecNO=9;
                lect[lecNO] = new appountiment ("Calculus" , 9 , 4 ,5); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
            case 10:  
                 lecNO=10;
                lect[lecNO] = new appountiment ("Electronics" , 10 , 5 ,6 ); 
                lect[lecNO].displayapp(); 
                lecNO ++ ; 
                break ; 
                
              
            default :  
                System.out.println("invalid input , try again . "); // if user put wrong input will return to first sttement 
                addappointment (); 
        } 
         
        System.out.println(" 1 - add a new lecture \n 0 - to exit "); 
        breakcho = in.nextInt(); 
         
        }while (breakcho != 0  ); 
        displayinterface ( ); 
         
         
    } 
public static void deleteappointment() 
    { 
       int lecnum ; 
       Scanner in = new Scanner (System.in); 
       int delcho ;  
        
       do { 
       System.out.println("Enter lecture id you want to delete it / (-1) to exit  " ); 
       lecnum = in.nextInt(); 
        
        
       if (lecNO >= lecnum ) 
       { 
            System.out.println("Do you want to delete "); 
            lect[lecnum].displayapp(); 
             System.out.println("\n 1/ yes \n 0/ NO " ); 
            delcho = in.nextInt(); 
              
             if(delcho > 0 ) 
             { 
                 lect[lecnum] =new appountiment (null , 0 , 0 , 0 );      
                 System.out.println("lecture appointement deleted " ); 
             } 
            
 
               System.out.println("do you want delete another levture ? \n 1- yes \n (-1) to exit " );
                int cho1 = in.nextInt(); 
              
              
                  
                 switch (cho1) { 
                      
                     case 1 :  
                         deleteappointment(); 
                         break; 
                     case -1 :  
                         displayinterface ( ); 
                         break ; 
                          
                     default :  
                         System.out.println("invalid input" ); 
                         break; 
                 } 
              
       } 
       else  
       { 
           System.out.println("invalid input" ); 
           deleteappointment(); 
       } 
        
        
       }while (lecnum == 0); 
    } 
public static void dsplayinfo (account [] student , int num) 
    { 
        int num1 ;
        int numchk ;  
        Scanner in = new Scanner (System.in); 
        account a = new account (); 
        boolean flag = true  ; 
        do { 
              
        System.out.println("enter your short number : "); 
        num1 = in.nextInt(); 
         
        if ( num1 <= num ) 
        { 
           student[num1].display() ; 
            
        } 
        else { 
            System.out.println("invalid input"); 
            flag = false; 
        }
        
          System.out.println("enter lecture ID : "); 
            numchk = in.nextInt(); 
             
            if (numchk <= lecNO ) 
            { 
                System.out.println("********************"); 
                lect[numchk].displayapp(); 
                System.out.println("********************"); 
            } 
            else { 
                 System.out.println("invalid input"); 
                 flag = false ; 
            } 
         
        } while (flag = false); 
        displayinterface (); 
    }
}