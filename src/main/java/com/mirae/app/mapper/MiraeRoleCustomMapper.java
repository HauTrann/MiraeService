package com.mirae.app.mapper;

import com.mirae.app.model.MiraeRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MiraeRoleCustomMapper {
    List<MiraeRole> getAll();
}
