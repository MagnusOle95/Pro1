package opgave_3_popupvindue_til_addPerson_Opgave_1_Og_2;

import Model2.demoopenwindow.MovieInputWindow;
import javafx.application.Application;
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

        addPerson = new InputAddPerson("Add a Person",stage);

    }

    // -------------------------------------------------------------------------

    private final ListView<Person> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();

    private InputAddPerson addPerson;

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

        // add a listView to the pane(at col=1, row=0)
        pane.add(lvwPersons, 0, 0, 4, 5);
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
        addPerson.showAndWait();
        if (addPerson.name != null || addPerson.title != null) {
            Person p = new Person(addPerson.name, addPerson.title, addPerson.senior);
            persons.add(p);
            lvwPersons.getItems().setAll(persons);
            addPerson.name = null;
            addPerson.title = null;
            addPerson.senior = false;
        }
    }


    private void initPersons() {
        persons.add(new Person("Jens", "Doctor",false));
        persons.add(new Person("Hans", "Landmand",true));
        persons.add(new Person("Pia", "Købmand",false));
    }

}
