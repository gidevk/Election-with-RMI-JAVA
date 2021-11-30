
import java.rmi.*;  
import java.rmi.registry.*;  
public class Server{  
	public static void main(String args[]){  
		try{  
			
			Adder stub = new AdderRemote();
			
			// Binding the remote object (stub) in the registry 
	         Registry registry = LocateRegistry.getRegistry(); 
	         
	         registry.bind("Adder", stub);
			
		}catch(Exception e){System.out.println(e);}  
	}  
} 