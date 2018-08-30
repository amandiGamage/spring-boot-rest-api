package com.wearit.service;

import java.util.List;

/**
 * Created by Amandi on 8/31/2018.
 */
public interface SuperService<T> {
    public  T add(T t)throws Exception;
    public boolean update(T t)throws Exception;
    public boolean delete(Integer id)throws Exception;
    public T search(Integer id)throws Exception;
    public List<T> getAll(Integer offset, Integer limit)throws Exception;
}
