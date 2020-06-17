package com.learning.ssm_swagger.common.base;

import java.util.List;

/**
 * 公共的基础Mapper
 * @Author Qizy
 * @Date 2020/6/16 15:54
 * @Version 1.0
 **/
public interface BaseMapper<D, E> {

    /**
     * DTO转为entity实体类
     * @param dto
     * @return
     */
    E toEntity(D dto);

    /**
     * entity实体类转为DTO
     * @param entity
     * @return
     */
    D toDto(E entity);

    /**
     * DTO集合转为entity实体类集合
     * @param dtoList
     * @return
     */
    List<E> toEntity(List<D> dtoList);

    /**
     * entity实体类集合转为DTO集合
     * @param entityList
     * @return
     */
    List<D> toDto(List<E> entityList);
}
