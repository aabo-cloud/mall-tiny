package com.macro.mall.tiny.service.impl;

import com.macro.mall.tiny.mbg.model.PmsBrand;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @author aabo
 * @createTime 2022/9/10 15:34
 */
public interface PmsBrandService {

    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);

}
