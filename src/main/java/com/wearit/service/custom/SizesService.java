package com.wearit.service.custom;

import com.wearit.dto.SizesDTO;
import com.wearit.service.SuperService;

/**
 * Created by Amandi on 8/31/2018.
 */
public interface SizesService extends SuperService<SizesDTO> {
    public SizesDTO getSizeByName(String size) throws Exception;
}
