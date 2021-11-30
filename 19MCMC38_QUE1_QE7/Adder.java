
import java.rmi.*;  
public interface Adder extends Remote{  
 
	public void castVote(String con) throws RemoteException; 
	public String getResult() throws RemoteException;
}  