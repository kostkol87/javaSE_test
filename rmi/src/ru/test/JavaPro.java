package ru.test;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Константин on 17.08.2014.
 */
public interface JavaPro extends Remote {
    String handShaking() throws RemoteException;
    String getDate() throws RemoteException;
}
