package forberedt.guifx;

import Gui.application.model.Company;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

    public class Vindue2 extends GridPane {

        private TextField txf1, txf2;
        private TextArea txa;
        private ListView<Company> lvw;

        public Vindue2() {
            this.setPadding(new Insets(20));
            this.setHgap(20);
            this.setVgap(10);
            this.setGridLinesVisible(false);

            Label lblComp = new Label("Vindue1");
            this.add(lblComp, 0, 0);

            lvw = new ListView<>();
            this.add(lvw, 0, 1, 1, 3);
            lvw.setPrefWidth(200);
            lvw.setPrefHeight(200);


            Label lbl1 = new Label("Lbl1:");
            this.add(lbl1, 1, 1);

            txf1 = new TextField();
            this.add(txf1, 2, 1);
            txf1.setEditable(false);

            Label lbl2 = new Label("Lbl2:");
            this.add(lbl2, 1, 2);

            txf2 = new TextField();
            this.add(txf2, 2, 2);
            txf2.setEditable(false);

            Label lbl3 = new Label("Lbl3:");
            this.add(lbl3, 1, 3);
            GridPane.setValignment(lbl3, VPos.BASELINE);
            lbl3.setPadding(new Insets(4, 0, 4, 0));

            txa = new TextArea();
            this.add(txa, 2, 3);
            txa.setPrefWidth(200);
            txa.setPrefHeight(100);
            txa.setEditable(false);

            HBox hbxButtons = new HBox(40);
            this.add(hbxButtons, 0, 4, 3, 1);
            hbxButtons.setPadding(new Insets(10, 0, 0, 0));
            hbxButtons.setAlignment(Pos.BASELINE_CENTER);

            Button btnCreate = new Button("Create");
            hbxButtons.getChildren().add(btnCreate);
            btnCreate.setOnAction(event -> this.createAction());

            Button btnUpdate = new Button("Update");
            hbxButtons.getChildren().add(btnUpdate);
            btnUpdate.setOnAction(event -> this.updateAction());

            Button btnDelete = new Button("Delete");
            hbxButtons.getChildren().add(btnDelete);
            btnDelete.setOnAction(event -> this.deleteAction());

        }

        // -------------------------------------------------------------------------

        private void createAction() {

        }

        private void updateAction() {

        }

        private void deleteAction() {

        }

        // -------------------------------------------------------------------------

        public void updateControls() {

        }


    }



