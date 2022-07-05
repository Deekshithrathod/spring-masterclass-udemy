package com.in28minutes.database.databasedemo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

@Repository
public class PersonJdbcDao {
    class PersonRowMapper implements RowMapper<Person> {

        @Override
        public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
            Person person = new Person();
            person.setId(rs.getInt("id"));
			person.setBirthDate( rs.getTimestamp("birth_date"));
            person.setLocation(rs.getString("location"));
            person.setName(rs.getString("name"));
            return person;
        }
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){
        return jdbcTemplate.query("select * FROM person",new PersonRowMapper());
    }

    public Person findById(int id){
        return jdbcTemplate.queryForObject("select * from person where id=?",new PersonRowMapper(),id);
    }

    public List<Person> findByName(String name){
        return jdbcTemplate.query("select * from person where name=?",new PersonRowMapper(), name);
    }

    public int deleteById(int id){
        return jdbcTemplate.update("delete from person where id=?", id);
    }

    public int deleteByName(String name){
        return jdbcTemplate.update("delete from person where name=?", name);
    }

    public int insertPerson(Person person){
        return jdbcTemplate.update("insert into person (id, name, location, birth_date) values(?,?,?,?)",person.getId(), person.getName(), person.getLocation(), new Timestamp(person.getBirthDate().getTime()));
    }

    public int updatePerson(Person person){
        return jdbcTemplate.update("update person " +
                "set name=?, location=?, birth_date=? " +
                "where id=?",person.getName(), person.getLocation(),person.getBirthDate(),person.getId());
    }
}
