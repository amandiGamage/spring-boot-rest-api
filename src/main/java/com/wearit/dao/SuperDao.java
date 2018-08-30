package com.wearit.dao;

import java.util.List;

/**
 * Created by ABC on 8/31/2018.
 */
public interface SuperDao <T> {
    public  T add(T t)throws Exception;
    public boolean update(T t)throws Exception;
    public int delete(Integer id)throws Exception;
    public T search(Integer id)throws Exception;
    public List<T> getAll(Integer offset,Integer limit)throws Exception;
}
