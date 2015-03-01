package ru.test.service;

/**
 * Created by Константин on 14.08.2014.
 */
public interface AccountService {
    Long getAmount(Integer id);
    void addAmount(Integer id, Long value);
}
