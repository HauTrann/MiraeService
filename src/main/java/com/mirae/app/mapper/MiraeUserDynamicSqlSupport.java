package com.mirae.app.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MiraeUserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.215+07:00", comments="Source Table: EBANK.MIRAE_USER")
    public static final MiraeUser miraeUser = new MiraeUser();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.215+07:00", comments="Source field: EBANK.MIRAE_USER.USERID")
    public static final SqlColumn<String> userid = miraeUser.userid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.216+07:00", comments="Source field: EBANK.MIRAE_USER.USERNAME")
    public static final SqlColumn<String> username = miraeUser.username;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.216+07:00", comments="Source field: EBANK.MIRAE_USER.EMAIL")
    public static final SqlColumn<String> email = miraeUser.email;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.216+07:00", comments="Source field: EBANK.MIRAE_USER.PASSWORD")
    public static final SqlColumn<String> password = miraeUser.password;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.216+07:00", comments="Source field: EBANK.MIRAE_USER.STATUS")
    public static final SqlColumn<String> status = miraeUser.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.216+07:00", comments="Source field: EBANK.MIRAE_USER.DEPARTMENTID")
    public static final SqlColumn<String> departmentid = miraeUser.departmentid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.215+07:00", comments="Source Table: EBANK.MIRAE_USER")
    public static final class MiraeUser extends SqlTable {
        public final SqlColumn<String> userid = column("USERID", JDBCType.NVARCHAR);

        public final SqlColumn<String> username = column("USERNAME", JDBCType.NVARCHAR);

        public final SqlColumn<String> email = column("EMAIL", JDBCType.NVARCHAR);

        public final SqlColumn<String> password = column("PASSWORD", JDBCType.NVARCHAR);

        public final SqlColumn<String> status = column("STATUS", JDBCType.NVARCHAR);

        public final SqlColumn<String> departmentid = column("DEPARTMENTID", JDBCType.NVARCHAR);

        public MiraeUser() {
            super("EBANK.MIRAE_USER");
        }
    }
}