package com.jiahao.DAO;

import org.apache.ibatis.annotations.Select;
import com.jiahao.Domain.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface Usermapper {

    @Select("select * from tu_user where id=#{id}")
    public User selectByid (int id);
}
