package com.ldk.springdemo.mapper;

import com.ldk.springdemo.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository
@Mapper
public interface UserMapper {
    /**
     * 根据主键ID获取对象
     *
     * @param id 对象ID
     * @return 对象实例
     */
    UserEntity findById(Long id);
}
