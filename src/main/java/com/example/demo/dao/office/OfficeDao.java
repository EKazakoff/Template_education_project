package com.example.demo.dao.office;

import com.example.demo.model.Office;
import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;

import javax.validation.Valid;
import java.util.List;

/**
 * The interface Office dao.
 */
public interface OfficeDao {
    /**
     * Load by id office.
     *
     * @param id the id
     * @return the office
     */
    public Office loadById(Long id);

    /**
     * Update.
     *
     * @param office the office
     */
    void update(OfficeView office);

    /**
     * Save.
     *
     * @param office the office
     */
    void save(OfficeView office);

    /**
     * List list.
     *
     * @param office the office
     * @return the list
     */
    List<Office> list(@Valid OfficeFilterView office);
}
