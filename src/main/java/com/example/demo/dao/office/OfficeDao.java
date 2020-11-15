package com.example.demo.dao.office;

import com.example.demo.model.Office;
import org.springframework.stereotype.Repository;

public interface OfficeDao {
    public Office loadById (Long id);
}
