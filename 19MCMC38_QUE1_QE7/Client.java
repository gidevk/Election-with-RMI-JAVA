
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
 
public class Client{  
	public static void main(String args[]){  
		Scanner sc = new Scanner(System.in);
		try{  
			// Getting the registry 
	         Registry registry = LocateRegistry.getRegistry(null); 
	    
	         // Looking up the registry for the remote object 
	         Adder stub = (Adder) registry.lookup("Adder");
			  
			System.out.print("NOTE:-You got cahance only one time for VOTE so choose carefully.\nEnter The valid condidate name (i.e jones/smith) :");
			String con,res;
			do{
				con=sc.next();
				if(con.equalsIgnoreCase("smith") || con.equalsIgnoreCase("jones")){
					stub.castVote(con); 
					System.out.println("your vote is counted");
				}
				else{
					System.out.println("This is not valid condidate Please choose Smith OR Jones");
				}
			}while(!(con.equalsIgnoreCase("smith") || con.equalsIgnoreCase("jones")));
			
			System.out.print("Enter \"End\" for result and closed the program :");
			do{
				res= sc.next();
				if(res.equalsIgnoreCase("end")){
					System.out.println(stub.getResult());
				}
				else{
					System.out.println("Wrong input !!!!\n Please Enter valid input...");
				}
			}while(!(res.equalsIgnoreCase(res)));
					
			
		}catch(Exception e){} 
		finally{
			sc.close();
		} 
	}  
}  