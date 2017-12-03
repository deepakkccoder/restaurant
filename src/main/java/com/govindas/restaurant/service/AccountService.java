package com.govindas.restaurant.service;

import com.govindas.restaurant.model.Account;

import java.util.List;

public interface AccountService {
    public List<Account> getAll();
    public Account getById(int id);
    public Account save(Account account);
    public void delete(int id);
}
