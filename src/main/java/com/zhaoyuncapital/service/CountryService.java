package com.zhaoyuncapital.service;

import com.github.pagehelper.PageHelper;
import com.zhaoyuncapital.mapper.CountryMapper;
import com.zhaoyuncapital.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by gongtuo on 2017/6/1.
 */
@Service
public class CountryService {
    @Autowired
    private CountryMapper countryMapper;

    public List<Country> getAll(Country country){
        if(country.getPage()!=null && country.getId()!=null){
            PageHelper.startPage(country.getPage(),country.getId());
        }
        return countryMapper.selectAll();
    }

    public Country getById(Integer id){
        return countryMapper.selectByPrimaryKey(id);
    }
    public void deleteById(Integer id){
        countryMapper.deleteByPrimaryKey(id);
    }
    public void save(Country country){
        if(country.getId()!=null){
            countryMapper.updateByPrimaryKey(country);
        }else{
            countryMapper.insert(country);
        }
    }
}
