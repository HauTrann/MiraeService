package com.mirae.app.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class MiraeRoleDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    public static final MiraeRole miraeRole = new MiraeRole();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source field: EBANK.MIRAE_ROLE.ROLEID")
    public static final SqlColumn<Short> roleid = miraeRole.roleid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source field: EBANK.MIRAE_ROLE.ROLECODE")
    public static final SqlColumn<String> rolecode = miraeRole.rolecode;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source field: EBANK.MIRAE_ROLE.ROLENAME")
    public static final SqlColumn<String> rolename = miraeRole.rolename;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source field: EBANK.MIRAE_ROLE.ROLENAMEEN")
    public static final SqlColumn<String> rolenameen = miraeRole.rolenameen;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2021-05-11T01:17:34.24+07:00", comments="Source Table: EBANK.MIRAE_ROLE")
    public static final class MiraeRole extends SqlTable {
        public final SqlColumn<Short> roleid = column("ROLEID", JDBCType.NUMERIC);

        public final SqlColumn<String> rolecode = column("ROLECODE", JDBCType.NVARCHAR);

        public final SqlColumn<String> rolename = column("ROLENAME", JDBCType.NVARCHAR);

        public final SqlColumn<String> rolenameen = column("ROLENAMEEN", JDBCType.NVARCHAR);

        public MiraeRole() {
            super("EBANK.MIRAE_ROLE");
        }
    }
}