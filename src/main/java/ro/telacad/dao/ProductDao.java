/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ro.telacad.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author crist
 */
@Repository
public class ProductDao {

    @Autowired
    private DataSource dataSource;

    public void adaugaProdus(String nume) {
        try (Connection con = dataSource.getConnection()) {
            
            String sql = "INSERT INTO produse VALUES(NULL, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, nume);
            stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
