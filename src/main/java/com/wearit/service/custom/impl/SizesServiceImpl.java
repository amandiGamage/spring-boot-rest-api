package com.wearit.service.custom.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wearit.dao.custom.SizeDao;
import com.wearit.dto.SizesDTO;
import com.wearit.model.Sizes;
import com.wearit.service.custom.SizesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Amandi on 8/31/2018.
 */
@Service
public class SizesServiceImpl implements SizesService{

   @Autowired
   ObjectMapper modelMapper;

    @Autowired
    SizeDao sizeDao;

    @Override
    public SizesDTO add(SizesDTO sizesDTO) throws Exception {
        Sizes size = modelMapper.convertValue(sizesDTO, Sizes.class);
        Sizes add = sizeDao.add(size);
        if(add!=null){
            SizesDTO addedSize = modelMapper.convertValue(size, SizesDTO.class);
            return addedSize;
        }
        return null;
    }

    @Override
    public boolean update(SizesDTO sizesDTO) throws Exception {
        return false;
    }

    @Override
    public boolean delete(Integer id) throws Exception {
        return false;
    }

    @Override
    public SizesDTO search(Integer id) throws Exception {
        return null;
    }

    @Override
    public List<SizesDTO> getAll(Integer offset, Integer limit) throws Exception {
        return null;
    }

    @Override
    public SizesDTO getSizeByName(String size) throws Exception {
        return null;
    }
}
