package com.govindas.restaurant.serviceImpl;

import com.govindas.restaurant.model.Account;
import com.govindas.restaurant.repository.AccountRepository;
import com.govindas.restaurant.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public List<Account> getAll() {
        return (List<Account>) accountRepository.findAll();
    }

    @Override
    public Account getById(int id) {
        return accountRepository.findOne(id);
    }

    @Override
    public Account save(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public void delete(int id) {
        accountRepository.delete(id);
    }
}
