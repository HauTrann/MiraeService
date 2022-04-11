package com.mirae.app.mapper;

import static com.mirae.app.mapper.MiraeUserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.mirae.app.model.MiraeUser;
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
public interface MiraeUserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.23+07:00", comments="Source Table: EBANK.MIRAE_USER")
    BasicColumn[] selectList = BasicColumn.columnList(userid, username, email, password, status, departmentid);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.217+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.218+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.219+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<MiraeUser> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.219+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<MiraeUser> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.22+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("MiraeUserResult")
    Optional<MiraeUser> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.221+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="MiraeUserResult", value = {
        @Result(column="USERID", property="userid", jdbcType=JdbcType.NVARCHAR, id=true),
        @Result(column="USERNAME", property="username", jdbcType=JdbcType.NVARCHAR),
        @Result(column="EMAIL", property="email", jdbcType=JdbcType.NVARCHAR),
        @Result(column="PASSWORD", property="password", jdbcType=JdbcType.NVARCHAR),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.NVARCHAR),
        @Result(column="DEPARTMENTID", property="departmentid", jdbcType=JdbcType.NVARCHAR)
    })
    List<MiraeUser> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.223+07:00", comments="Source Table: EBANK.MIRAE_USER")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.223+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.224+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.224+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int deleteByPrimaryKey(String userid_) {
        return delete(c ->
            c.where(userid, isEqualTo(userid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.225+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int insert(MiraeUser record) {
        return MyBatis3Utils.insert(this::insert, record, miraeUser, c ->
            c.map(userid).toProperty("userid")
            .map(username).toProperty("username")
            .map(email).toProperty("email")
            .map(password).toProperty("password")
            .map(status).toProperty("status")
            .map(departmentid).toProperty("departmentid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.226+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int insertMultiple(Collection<MiraeUser> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, miraeUser, c ->
            c.map(userid).toProperty("userid")
            .map(username).toProperty("username")
            .map(email).toProperty("email")
            .map(password).toProperty("password")
            .map(status).toProperty("status")
            .map(departmentid).toProperty("departmentid")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.227+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int insertSelective(MiraeUser record) {
        return MyBatis3Utils.insert(this::insert, record, miraeUser, c ->
            c.map(userid).toPropertyWhenPresent("userid", record::getUserid)
            .map(username).toPropertyWhenPresent("username", record::getUsername)
            .map(email).toPropertyWhenPresent("email", record::getEmail)
            .map(password).toPropertyWhenPresent("password", record::getPassword)
            .map(status).toPropertyWhenPresent("status", record::getStatus)
            .map(departmentid).toPropertyWhenPresent("departmentid", record::getDepartmentid)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.231+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default Optional<MiraeUser> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.232+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default List<MiraeUser> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.232+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default List<MiraeUser> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.233+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default Optional<MiraeUser> selectByPrimaryKey(String userid_) {
        return selectOne(c ->
            c.where(userid, isEqualTo(userid_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.233+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, miraeUser, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.234+07:00", comments="Source Table: EBANK.MIRAE_USER")
    static UpdateDSL<UpdateModel> updateAllColumns(MiraeUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userid).equalTo(record::getUserid)
                .set(username).equalTo(record::getUsername)
                .set(email).equalTo(record::getEmail)
                .set(password).equalTo(record::getPassword)
                .set(status).equalTo(record::getStatus)
                .set(departmentid).equalTo(record::getDepartmentid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.235+07:00", comments="Source Table: EBANK.MIRAE_USER")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(MiraeUser record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userid).equalToWhenPresent(record::getUserid)
                .set(username).equalToWhenPresent(record::getUsername)
                .set(email).equalToWhenPresent(record::getEmail)
                .set(password).equalToWhenPresent(record::getPassword)
                .set(status).equalToWhenPresent(record::getStatus)
                .set(departmentid).equalToWhenPresent(record::getDepartmentid);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.236+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int updateByPrimaryKey(MiraeUser record) {
        return update(c ->
            c.set(username).equalTo(record::getUsername)
            .set(email).equalTo(record::getEmail)
            .set(password).equalTo(record::getPassword)
            .set(status).equalTo(record::getStatus)
            .set(departmentid).equalTo(record::getDepartmentid)
            .where(userid, isEqualTo(record::getUserid))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.236+07:00", comments="Source Table: EBANK.MIRAE_USER")
    default int updateByPrimaryKeySelective(MiraeUser record) {
        return update(c ->
            c.set(username).equalToWhenPresent(record::getUsername)
            .set(email).equalToWhenPresent(record::getEmail)
            .set(password).equalToWhenPresent(record::getPassword)
            .set(status).equalToWhenPresent(record::getStatus)
            .set(departmentid).equalToWhenPresent(record::getDepartmentid)
            .where(userid, isEqualTo(record::getUserid))
        );
    }
}
