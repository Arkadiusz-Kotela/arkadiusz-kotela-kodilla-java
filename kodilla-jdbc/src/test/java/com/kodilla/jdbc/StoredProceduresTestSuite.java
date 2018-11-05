package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProceduresTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testUpdateVipLevels() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE READERS SET VIP_LEVEL=\"NOT SET\"";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlCallProcedure = "CALL UpdateVipLevels";
        statement.execute(sqlCallProcedure);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM READERS WHERE VIP_LEVEL=\"NOT SET\"";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;

        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }

        Assert.assertEquals(0, howMany);
    }

    @Test
    public void testBestsellers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String sqlUpdate = "UPDATE BOOKS SET BESTSELLER=FALSE";
        Statement statement = dbManager.getConnection().createStatement();
        statement.execute(sqlUpdate);

        //When
        String sqlCallProcedure = "CALL UpdateBestsellers";
        statement.execute(sqlCallProcedure);

        //Then
        String sqlCheckTable = "SELECT COUNT(*) AS HOW_MANY FROM BOOKS WHERE BESTSELLER=TRUE";
        ResultSet rs = statement.executeQuery(sqlCheckTable);
        int howMany = -1;

        if (rs.next()) {
            howMany = rs.getInt("HOW_MANY");
        }

        Assert.assertEquals(2, howMany);
    }

}
