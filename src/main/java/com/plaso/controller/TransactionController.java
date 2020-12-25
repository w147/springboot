package com.plaso.controller;

import com.plaso.service.TransactionService;
import com.plaso.service.User2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @Autowired
    private User2Service user2Service;

    @PostMapping("/add")
    public void notransaction_exception_required_required() {
        transactionService.notransaction_exception_required_required();
    }

    @PostMapping("/add1")
    public void notransaction_required_required_exception() {
        transactionService.notransaction_required_required_exception();
    }

    @PostMapping("/add2")
    public void transaction_exception_required_required() {
    }

}