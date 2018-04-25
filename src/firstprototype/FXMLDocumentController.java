/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstprototype;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class FXMLDocumentController implements Initializable{

    @FXML
    private ListView<String> statesListView;
    private List<String>statesList;
    
    protected ListProperty<String> listProperty = new SimpleListProperty<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        statesList = new ArrayList();
        statesList.add("Alabama");
        statesList.add("Colorado");
        
        statesListView.itemsProperty().bind(listProperty);
    }
}

