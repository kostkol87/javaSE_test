package ru.test.service;
import ru.test.db.Cache;
import java.sql.SQLException;

/**
 * Created by Константин on 14.08.2014.
 */
public class Service implements AccountService {
    Cache cache = new Cache();
    private long tmp;
    @Override
    public Long getAmount(Integer id) {
        return Cache.cache.get(id);
    }

    @Override
    public void addAmount(Integer id, Long value) {
        try {
            tmp = Cache.cache.get(id);
            value=value+tmp;
            cache.putInCache(id,value);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
