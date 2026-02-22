package net.javaguides.service.impl;

import org.springframework.stereotype.Service;

import net.javaguides.dto.AccountDto;
import net.javaguides.entity.Account;
import net.javaguides.mapper.AccountMapper;
import net.javaguides.repository.AccountRepository;
import net.javaguides.service.AccountService;

@Service
public class AccountServiceImpl  implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account = accountRepository
                    .findById(id)
                    .orElseThrow(() -> new RuntimeException("Account not found"));
        return AccountMapper.mapToAccountDto(account);
    }


}
