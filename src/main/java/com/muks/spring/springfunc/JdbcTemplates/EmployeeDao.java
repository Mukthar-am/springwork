package com.muks.spring.springfunc.JdbcTemplates;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 15692 on 16/06/16.
 */
public class EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int saveEmployee(Employee e){
        String ins = "'" + e.getId() + ", " + e.getName() + ", " + e.getSalary() + "'";
                String query="insert into employee values(ins)";
        return jdbcTemplate.update(query);
    }

    public int updateEmployee(Employee e) {
        String ins = "'" + e.getId() + ", " + e.getName() + ", " + e.getSalary() + " where id = '" + e.getId() + "";
        String query="update employee set name=" + ins;
        return jdbcTemplate.update(query);
    }
    public int deleteEmployee(Employee e){
        String query="delete from employee where id='"+e.getId()+"' ";
        return jdbcTemplate.update(query);
    }


    /** For prepared statement query */
    public Boolean saveEmployeeByPreparedStatement(final Employee e){
        String query="insert into employee values(?,?,?)";
        return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>(){

            public Boolean doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {

                ps.setInt(1,e.getId());
                ps.setString(2,e.getName());
                ps.setFloat(3,e.getSalary());

                return ps.execute();

            }
        });
    }


    /** Resultset extractor */
    public List<Employee> getAllEmployees(){
        return jdbcTemplate.query("select * from employee",new ResultSetExtractor<List<Employee>>(){

            public List<Employee> extractData(ResultSet rs) throws SQLException,
                    DataAccessException {

                List<Employee> list=new ArrayList<Employee>();
                while(rs.next()){
                    Employee e=new Employee();
                    e.setId(rs.getInt(1));
                    e.setName(rs.getString(2));
                    e.setSalary(rs.getInt(3));
                    list.add(e);
                }
                return list;
            }
        });
    }
}
