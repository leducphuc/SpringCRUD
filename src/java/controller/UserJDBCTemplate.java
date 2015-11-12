/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;
import javax.sql.DataSource;
import model.Student;
import model.User;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserJDBCTemplate {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    
    public void setDataSource(DataSource dataSource){
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    
    }
    public boolean  checkLogin(User user){
        String sql = "select * from tbluser where username =?"
                + "and password =?";
        List<User> result = jdbcTemplate.query(sql, new Object[]{user.getUsername(),user.getPassword()},new UserMapper() );
        if(result.size()>0)
            return true;
        return false;
    }
    public void createUser(User user){
        String sql="insert into tbluser(id,username,password) values(?,?,?) ";
        jdbcTemplate.update(sql,user.getId(),user.getUsername(),user.getPassword());
    }
    public void deleteUser(int userId){
        String sql="delete from tbluser where id=?";
    }
     public List<User> listUser() {
        String sql = "select * from tbluser";
        List <User> users = jdbcTemplate.query(sql, new UserMapper());
        return users;
        
    }
    public User getUser(int userId){
        String sql="select * from tbluser where id=?";
        User user = jdbcTemplate.queryForObject(sql, new Object[]{userId}, new UserMapper());
        return user;
    }
    public void update(User user) {
        String sql = "update tbluser set username =?, password =? where id=?";
        jdbcTemplate.update(sql,  new Object[] { user.getUsername(),user.getPassword(),user.getId() });
        return;
    }
}
