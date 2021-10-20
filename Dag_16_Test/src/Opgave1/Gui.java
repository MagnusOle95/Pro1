package Opgave1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Gui extends Application {

  
    @Override
    public void start(Stage stage) {
        stage.setTitle("ListView Demo3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();
    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox chkSenior = new CheckBox();

    private void initContent(GridPane pane) {
        this.initPersons();

        // show or hide grid lines
        pane.setGridLinesVisible(false);
        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lbltitle = new Label("Titel:");
        pane.add(lbltitle,0 ,1 );

        Label lblNames = new Label("Persons:");
        pane.add(lblNames, 0, 3);

        Label lblSenior = new Label("Senior");
        pane.add(lblSenior,2,2 );

        pane.add(txfName, 1, 0, 4, 1);
        pane.add(txfTitle,1 ,1,4,1);
        pane.add(chkSenior,1 ,2 );

        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 1, 3, 4, 5);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getItems().setAll(persons);

        Button btnAdd = new Button("Add person");
        pane.add(btnAdd, 5, 2,2,1);

        // connect a method to the button
        btnAdd.setOnAction(event -> this.addAction());
    }

    // -------------------------------------------------------------------------
    // Button actions

    private void addAction() {
        String name = txfName.getText().trim();
        String title = txfTitle.getText().trim();
        String senior = "";
        if (chkSenior.isSelected()){
            senior = "(Senior)";
        }
        if (name.length() > 0 && title.length() > 0) {
            Person p = new Person(name,title,senior);
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
            txfName.clear();
            txfTitle.clear();
            chkSenior.setSelected(false);
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ad person");
            alert.setHeaderText("Missing name or title");
            alert.setContentText("Name and title fields, must not be empty ");
            alert.show();
        }
    }

    private void initPersons() {
        persons.add(new Person("Jens", "Doctor","(Senior)"));
        persons.add(new Person("Hans", "Landmand",""));
        persons.add(new Person("Pia", "Købmand",""));
    }

}
