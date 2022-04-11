package com.mirae.app.controller;

import com.mirae.app.mapper.MiraeRoleCustomMapper;
import com.mirae.app.mapper.MiraeRoleDynamicSqlSupport;
import com.mirae.app.mapper.MiraeRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "abc")
public class TestController {

    @Autowired
    MiraeRoleMapper miraeRoleMapper;

    @Autowired
    MiraeRoleCustomMapper miraeRoleCustomMapper;


    @PostMapping(value = "/demo", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object testAPI(@RequestBody Object object) {
//        return miraeRoleMapper.select(n->n.orderBy(MiraeRoleDynamicSqlSupport.rolename));
        return miraeRoleCustomMapper.getAll(); // test mapper custom
    }
}
