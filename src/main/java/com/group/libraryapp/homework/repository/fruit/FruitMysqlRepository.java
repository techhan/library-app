package com.group.libraryapp.homework.repository.fruit;

import com.group.libraryapp.homework.dto.request.FruitSaveRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Qualifier("first")
@Repository
public class FruitMysqlRepository implements FruitRepository{

    private final JdbcTemplate jdbcTemplate;

    public FruitMysqlRepository(JdbcTemplate jdbcTemplate) {
        System.out.println("FruitMysqlRepository.FruitMysqlRepository");
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(FruitSaveRequest request){
        String sql = "insert into fruit (name, warehousingDate, price) values (?, ?, ?)";
        jdbcTemplate.update(sql, request.getName(), request.getWarehousingDate(), request.getPrice());
    }

    public void update(long id) {
        String sql =  "update fruit set salesYN = 1 where id = ?";
        jdbcTemplate.update(sql, id);
    }

    public long getAmount(String name, int salesYN) {
        String salesSql = "select sum(price) as sum from fruit where salesYN = ? group by name having name = ?";
        return jdbcTemplate.queryForObject(salesSql, Long.class, salesYN, name);
    }
}

