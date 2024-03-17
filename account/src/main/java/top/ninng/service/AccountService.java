package top.ninng.service;

import org.springframework.stereotype.Service;
import top.ninng.clients.StudentApi;
import top.ninng.dao.IAccountDao;
import top.ninng.domain.Account;
import top.ninng.domain.Student;

import java.util.List;

@Service("accountService")
public class AccountService {

    private IAccountDao accountDao;
    private StudentApi studentApi;

    public AccountService(IAccountDao accountDao, StudentApi studentApi) {
        this.accountDao = accountDao;
        this.studentApi = studentApi;
    }

    public List<Account> selectAll() {
        List<Account> accounts = accountDao.selectAll();
        for (Account account : accounts) {
            Student student = studentApi.selectById(account.getStudentId());
            account.setStudent(student);
        }
        return accounts;
    }

    public Account selectById(int id) {
        Account account = accountDao.selectById(id);
        account.setStudent(studentApi.selectById(id));
        return account;
    }
}
