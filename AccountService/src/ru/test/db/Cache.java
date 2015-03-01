package ru.test.db;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 * Created by Константин on 14.08.2014.
 */
public class Cache {
    public static HashMap<Integer, Long> cache = new HashMap();
    private DBConnection connection = new DBConnection();

    public void putInCache(Integer id, Long value) throws SQLException, ClassNotFoundException {
        cache.put(id,value);
        putInDB(id,value);
    }
    private void putInDB(Integer id, Long value) throws SQLException, ClassNotFoundException {
        Statement statement = connection.init().createStatement();
        statement.execute("insert into accounts (amount) values ("+value+") where (id)=("+id+");");
    }
    //let's create few users with empty amounts
    public void creator() throws SQLException, ClassNotFoundException {
        for (Integer i = 0; i < 100; i++) {
            cache.put(i,0L);
            Statement statement = connection.init().createStatement();
            statement.execute("insert ignore into accounts (id, amount) values ("+i+",0);");
        }
    }
}
