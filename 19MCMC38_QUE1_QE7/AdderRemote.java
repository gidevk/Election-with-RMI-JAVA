import java.rmi.*;  
import java.rmi.server.*;  
public class AdderRemote extends UnicastRemoteObject implements Adder{  
	static int c1=0,c2=0;
	static String con1="smith",con2 = "jones";
	AdderRemote() throws RemoteException{  
		super();  
	}  
  
	public void castVote(String con) throws RemoteException{
		if(con1.equalsIgnoreCase(con)){
			c1++;
			System.out.println("Smith :"+c1 +"\nJones :"+ c2);
		 }
		else if(con2.equalsIgnoreCase(con)) {
			c2++;
			System.out.println("Smith :"+c1 +"\nJones :"+ c2);
		}
		else {
			System.out.println("This is not valid condidate Please choose " +con1 +" and " +con2);
		}
			
	}
	public String getResult() throws RemoteException{
		String str="";

      if(c1>c2) str = con1 +" won the election with >>"+ (c1-c2) +"<< votes";  
      else if(c1<c2) str = con2 +" won the election with >> "+ (c2-c1) +" <<votes";
      else str = con1 +" and "+ con2+ " got equal votes";


      return str;
	}
}  