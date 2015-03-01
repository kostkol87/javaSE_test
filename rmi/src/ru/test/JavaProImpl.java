package ru.test;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Константин on 17.08.2014.
 */
public class JavaProImpl extends UnicastRemoteObject implements JavaPro {
    private int i = 0;
    private SimpleDateFormat sdf = new SimpleDateFormat("MMM dd '('HH:mm:ss')'");

    public JavaProImpl() throws RemoteException{
        super();
    }

    @Override
    public String getDate() throws RemoteException {
        return sdf.format(new Date());
    }

    @Override
    public String handShaking() throws RemoteException {
        java.util.Date sd = new Date();
        java.util.Date ed = new Date(sd.getTime() + 60*60*60*1000);
        String endOfLine = "\n";
        String pS = "<p>";
        String pE = "</p>";
        String msg = "<H1>" + (i++) + ". ";
        msg +=  "<B> WElcome to JavaPro </I>!!! </B> </H1>";
        msg += pS + "Today is " + sdf.format(sd) + "." +pE;
        msg += pS + "If you start our course right now, "+pE;
        msg += pS + "after 60 hours (i.e. " + sdf.format(ed) + ") " + pE;
        msg += pS + "you'll become a <B> Java - programmer !!!</B>" + pE;
        return msg;
    }

    public static void main(String[] args) {
        if (System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
        }
        try {
            JavaProImpl obj = new JavaProImpl();
            Naming.rebind("//TeachPro/JavaProServer", obj);
            System.out.println("JavaProServer bound in registry");
        }catch (Exception e){
            System.out.println("JavaProIml err: " + e.getMessage());
            e.printStackTrace();
        }
    }

}
