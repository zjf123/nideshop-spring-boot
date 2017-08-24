package com.xie.service.impl;

import com.xie.bean.SearchHistory;
import com.xie.mapper.SearchHistoryMapper;
import com.xie.service.SearchHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xie on 17/8/23.
 */
@Service
public class SearchHistoryServiceImpl implements SearchHistoryService {

    @Autowired
    private SearchHistoryMapper searchHistoryMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return searchHistoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SearchHistory record) {
        return searchHistoryMapper.insert(record);
    }

    @Override
    public int insertSelective(SearchHistory record) {
        return searchHistoryMapper.insertSelective(record);
    }

    @Override
    public SearchHistory selectByPrimaryKey(Integer id) {
        return searchHistoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SearchHistory record) {
        return searchHistoryMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SearchHistory record) {
        return searchHistoryMapper.updateByPrimaryKey(record);
    }
}