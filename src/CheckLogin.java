import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;





public class CheckLogin extends UnicastRemoteObject implements LoginInterface
{
    public CheckLogin()throws RemoteException
    {}
    
    @Override
    public boolean check(String id, String pass)throws RemoteException
    {
    
    if(id.equals("abc")&& pass.equals("adi"))
        return true;
    else
        return false;
    }
    
    }