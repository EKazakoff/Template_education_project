package com.example.demo.dao.office;

import com.example.demo.model.Office;
import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;

import javax.validation.Valid;
import java.util.List;

public interface OfficeDao {
    public Office loadById(Long id);

    void update(OfficeView office);

    void save(OfficeView office);

    List<Office> list(@Valid OfficeFilterView office);
}
