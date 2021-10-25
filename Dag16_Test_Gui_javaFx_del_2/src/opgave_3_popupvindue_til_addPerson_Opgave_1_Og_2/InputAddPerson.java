package opgave_3_popupvindue_til_addPerson_Opgave_1_Og_2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.awt.*;

public class InputAddPerson extends Stage {

    public InputAddPerson(String title, Stage owner) {
        this.initOwner(owner);
        this.initStyle(StageStyle.UTILITY);
        this.initModality(Modality.APPLICATION_MODAL);
        this.setMinHeight(100);
        this.setMinWidth(200);
        this.setResizable(false);

        this.setTitle(title);
        GridPane Pane = new GridPane();

        this.initContent(Pane);

        Scene scene = new Scene(Pane);
        this.setScene(scene);
    }

    /////////////////////////////////////////////////////////////////
    private final TextField txfName = new TextField();
    private final TextField txfTitle = new TextField();
    private final CheckBox chkSenior = new CheckBox();
    public String name;
    public String title;
    public boolean senior;


    private void initContent(GridPane pane){
        pane.setPadding(new Insets(20));
        pane.setGridLinesVisible(false);
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName,0 ,0,2,1 );

        pane.add(txfName,5 ,0,3,1 );

        Label lblTitle = new Label("Titel:");
        pane.add(lblTitle,0 ,1,2,1 );

        pane.add(txfTitle,5 ,1,3,1 );

        Label lblChkSenior = new Label("Senior");
        pane.add(lblChkSenior,1 ,2 );
        pane.add(chkSenior,0 ,2 );

        Button Cancel = new Button("Cancel");
        pane.add(Cancel,0 ,3,3,1 );
        Cancel.setOnAction(event -> this.cancelAktion());

        Button Ok = new Button("Ok");
        pane.add(Ok,3 ,3 );
        Ok.setOnAction(event -> this.okAction());
    }

    private void okAction(){
        if (txfName.getText().trim().length() > 0 && txfTitle.getText().trim().length() > 0){
            this.name = txfName.getText().trim();
            this.title = txfTitle.getText().trim();
            this.senior = chkSenior.isSelected();
            txfName.clear();
            txfTitle.clear();
            chkSenior.setSelected(false);
            InputAddPerson.this.hide();
        }else{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Ad person");
            alert.setHeaderText("Missing name or title");
            alert.setContentText("Name and title fields, must not be empty ");
            alert.show();
        }
    }

    private void cancelAktion(){
        txfName.clear();
        txfTitle.clear();
        chkSenior.setSelected(false);
        InputAddPerson.this.hide();
    }

}
