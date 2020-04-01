/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author LEGION
 */
public class Interface_homeController implements Initializable {
    @FXML
    private AnchorPane pane_home;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changePane_home(ActionEvent event) {
        try{
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_home_1.fxml"));
            pane_home.getChildren().setAll(pane);
        }
        catch(IOException e){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(""+e);
        }
    }

    @FXML
    private void changePane_logout(ActionEvent event) {
        System.out.println("Logout");
    }

    @FXML
    private void eventExit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    private void changePane_Barang(ActionEvent event) {
        try{
            System.out.println("Barang");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_barang.fxml"));
            pane_home.getChildren().setAll(pane);   
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }

    @FXML
    private void actionCetakBarang(ActionEvent event) {
        System.out.println("Laporan Barang");
    }

    @FXML
    private void chanePane_Transaksi(ActionEvent event) {
        try{
            System.out.println("Transaksi");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_transaksi.fxml"));
            pane_home.getChildren().setAll(pane);   
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void actionCetakTransaksi(ActionEvent event) {
        System.out.println("Laporan Transaksi");
    }

    @FXML
    private void changePane_Member(ActionEvent event) {
        try{
            System.out.println("Member");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_member.fxml"));
            pane_home.getChildren().setAll(pane);   
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void actionCetakMember(ActionEvent event) {
        System.out.println("Laporan Member");
    }

    @FXML
    private void changePane_Pegawai(ActionEvent event) {
        try{
            System.out.println("Pegawai");
            AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_pegawai.fxml"));
            pane_home.getChildren().setAll(pane);   
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    private void actionCetakPegawai(ActionEvent event) {
        System.out.println("Laporan Pegawai");
    }

    @FXML
    private void changePane_Laporan(ActionEvent event)throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/view/interface_laporan.fxml"));
        pane_home.getChildren().setAll(pane);
    }
    
}
