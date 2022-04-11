package com.mirae.app.mapper;

import static com.mirae.app.mapper.MiraeRoleDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.mirae.app.model.MiraeRole;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface MiraeRoleMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    BasicColumn[] selectList = BasicColumn.columnList(roleid, rolecode, rolename, rolenameen);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MiraeRole> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MiraeRole> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MiraeRoleResult")
    Optional<MiraeRole> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MiraeRoleResult", value = {
        @Result(column="ROLEID", property="roleid", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ROLECODE", property="rolecode", jdbcType=JdbcType.NVARCHAR),
        @Result(column="ROLENAME", property="rolename", jdbcType=JdbcType.NVARCHAR),
        @Result(column="ROLENAMEEN", property="rolenameen", jdbcType=JdbcType.NVARCHAR)
    })
    List<MiraeRole> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int deleteByPrimaryKey(Short roleid_) {
        return delete(c -> 
            c.where(roleid, isEqualTo(roleid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int insert(MiraeRole record) {
        return MyBatis3Utils.insert(this::insert, record, miraeRole, c ->
            c.map(roleid).toProperty("roleid")
            .map(rolecode).toProperty("rolecode")
            .map(rolename).toProperty("rolename")
            .map(rolenameen).toProperty("rolenameen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int insertMultiple(Collection<MiraeRole> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, miraeRole, c ->
            c.map(roleid).toProperty("roleid")
            .map(rolecode).toProperty("rolecode")
            .map(rolename).toProperty("rolename")
            .map(rolenameen).toProperty("rolenameen")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int insertSelective(MiraeRole record) {
        return MyBatis3Utils.insert(this::insert, record, miraeRole, c ->
            c.map(roleid).toPropertyWhenPresent("roleid", record::getRoleid)
            .map(rolecode).toPropertyWhenPresent("rolecode", record::getRolecode)
            .map(rolename).toPropertyWhenPresent("rolename", record::getRolename)
            .map(rolenameen).toPropertyWhenPresent("rolenameen", record::getRolenameen)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default Optional<MiraeRole> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default List<MiraeRole> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.241+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default List<MiraeRole> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default Optional<MiraeRole> selectByPrimaryKey(Short roleid_) {
        return selectOne(c ->
            c.where(roleid, isEqualTo(roleid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, miraeRole, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    static UpdateDSL<UpdateModel> updateAllColumns(MiraeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleid).equalTo(record::getRoleid)
                .set(rolecode).equalTo(record::getRolecode)
                .set(rolename).equalTo(record::getRolename)
                .set(rolenameen).equalTo(record::getRolenameen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MiraeRole record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(roleid).equalToWhenPresent(record::getRoleid)
                .set(rolecode).equalToWhenPresent(record::getRolecode)
                .set(rolename).equalToWhenPresent(record::getRolename)
                .set(rolenameen).equalToWhenPresent(record::getRolenameen);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int updateByPrimaryKey(MiraeRole record) {
        return update(c ->
            c.set(rolecode).equalTo(record::getRolecode)
            .set(rolename).equalTo(record::getRolename)
            .set(rolenameen).equalTo(record::getRolenameen)
            .where(roleid, isEqualTo(record::getRoleid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.242+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    default int updateByPrimaryKeySelective(MiraeRole record) {
        return update(c ->
            c.set(rolecode).equalToWhenPresent(record::getRolecode)
            .set(rolename).equalToWhenPresent(record::getRolename)
            .set(rolenameen).equalToWhenPresent(record::getRolenameen)
            .where(roleid, isEqualTo(record::getRoleid))
        );
    }
}