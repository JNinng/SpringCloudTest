package top.ninng.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import top.ninng.domain.Account;

import java.util.List;

/**
 * 表 account
 */
@Repository("accountDao")
@Mapper
public interface IAccountDao {

    @Select(value = "select * from account")
    List<Account> selectAll();

    @Select(value = "select * from account where id=#{id}")
    Account selectById(int id);

    @Update("update account set balance=#{balance} where id=#{id}")
    int updateById(Account account);
}
