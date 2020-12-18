package com.example.demo.service;

import com.example.demo.view.office.OfficeFilterView;
import com.example.demo.view.office.OfficeView;
import com.example.demo.view.office.OfficeViewFilterOut;
import com.example.demo.view.office.OfficeViewOut;

import javax.validation.Valid;
import java.util.List;

/**
 * The interface Office service.
 */
public interface OfficeService {

    /**
     * Gets by id.
     *
     * @param id the id
     * @return the by id
     */
    public OfficeViewOut getById(long id);

    /**
     * Update by post.
     *
     * @param office the office
     */
    public void updateByPost(OfficeView office);

    /**
     * Save office.
     *
     * @param office the office
     */
    void saveOffice(OfficeView office);

    /**
     * List office list.
     *
     * @param office the office
     * @return the list
     */
    List<OfficeViewFilterOut> listOffice(@Valid OfficeFilterView office);
}


