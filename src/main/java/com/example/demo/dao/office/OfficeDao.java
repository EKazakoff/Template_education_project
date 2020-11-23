package com.example.demo.dao.office;

import com.example.demo.model.Office;
import com.example.demo.view.OfficeView;

import java.util.List;

public interface OfficeDao {
    public Office loadById (Long id);

    void update(OfficeView office);

    void deletebyId(Long id);

    void save(OfficeView office);

    List<Office> list(OfficeView office);
}
