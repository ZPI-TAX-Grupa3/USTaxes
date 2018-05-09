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
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.ComboBoxListCell;

public class FXMLDocumentController implements Initializable{


    @FXML
    private ListView<String> stateListView;
    private List<String>statesList;
    @FXML
    private ChoiceBox<?> productChoice;

    @FXML
    private TextField priceField;

    
    protected ListProperty<String> listProperty = new SimpleListProperty<>();

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        List<String> testList = new ArrayList<>();
        testList.add("Alabama");
        testList.add("Colorado");

        stateListView.getItems().addAll(testList);

        /*
        stateListView.itemsProperty().bind(listProperty);
        stateListView.setCellFactory(ComboBoxListCell.forListView(listProperty));*/

    }
}

