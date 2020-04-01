/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static javafx.application.Application.launch;
import javafx.scene.control.Alert;

public class connection {
    private static void launch(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Connection conn = null;
    public static Connection koneksi() {
        String driver = "com.mysql.jdbc.Driver";
        String host = "jdbc:mysql://localhost/bolapp";
        String user = "root";
        String pass = "";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(host, user, pass);
            Alert peringatan = new Alert (Alert.AlertType.INFORMATION);
            peringatan.setTitle("Peringatan SQL Connection");
            peringatan.setHeaderText((null));
            peringatan.setContentText("Berhasil mengkoneksikan ke host" +host);
            peringatan.showAndWait();
        }catch (ClassNotFoundException | SQLException e) {
            Alert peringatan = new Alert(Alert.AlertType.ERROR);
            peringatan.setTitle("Peringatan SQL Connection");
            peringatan.setHeaderText((null));
            peringatan.setContentText("" +e);
            peringatan.showAndWait();
            }
        return null;
       }
      public static void main(String[] args) {
    }
}
      
   

      
    
    
        

  

