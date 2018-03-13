/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendanceprojectgroupgroup.dal;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import java.sql.Connection;

/**
 *
 * @author Samuel
 */
public class ConnectionManager {

    private SQLServerDataSource ds = new SQLServerDataSource();

    /**
     * All the information to connect to the database.
     */
    public ConnectionManager() {
        ds.setDatabaseName("AttendanceProject");
        ds.setUser("CS2017B_14_java");
        ds.setPassword("javajava");
        ds.setPortNumber(1433);
        ds.setServerName("10.176.111.31");

    }

    /**
     * Will get the connection with the database.
     *
     * @return
     * @throws SQLServerException
     */
    public Connection getConnection() throws SQLServerException {
        return ds.getConnection();
    }

}
