package top.ninng.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.ninng.domain.Account;
import top.ninng.service.AccountService;

import javax.annotation.Resource;
import java.util.List;

/**
 * account 控制器
 */
@RestController
@RequestMapping(path = "/account")
public class AccountController {

    @Resource(name = "accountService")
    private AccountService accountService;

    @RequestMapping(path = "/all")
    public List<Account> selectAll() {
        return accountService.selectAll();
    }

    @RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
    Account selectById(@PathVariable(value = "id") int id) {
        return accountService.selectById(id);
    }
}
