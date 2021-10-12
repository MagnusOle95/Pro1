package Opgave_7_3_TegningAfHus;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class Gui extends Application {
	
	@Override
	public void start(Stage stage) {
		Pane root = initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Shapes");
		stage.setScene(scene);
		stage.show();

	}

	private Pane initContent() {
		Pane pane = new Pane();
		pane.setPrefSize(400, 400);
		drawShapes(pane);
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(Pane pane) {

		//Huset//
		Rectangle bygNing = new Rectangle(50,200,120,120);
		pane.getChildren().add(bygNing);
		bygNing.setFill(Color.RED);


		//Solen//
		Circle sol = new Circle(220, 100, 30);
		pane.getChildren().add(sol);
		sol.setFill(Color.YELLOW);
		sol.setStroke(Color.BLACK);

		//Taget//
		Polygon tag = new Polygon(30,200,190,200,110,120);
		pane.getChildren().add(tag);
		tag.setFill(Color.GREEN);

		//vindue//
		Rectangle vinDue = new Rectangle(70,220,40,40);
		pane.getChildren().add(vinDue);
		vinDue.setFill(Color.BLACK);

		//bundlinje//
		Line bundLinje = new Line(30,320,300,320);
		pane.getChildren().add(bundLinje);

		//Min forbedring en have//
		Rectangle have = new Rectangle(0,320,400,200);
		pane.getChildren().add(have);
		have.setFill(Color.DARKOLIVEGREEN);

		//Min forbedring en postkasse//
		Rectangle postKassePind = new Rectangle(350,295,2,25);
		pane.getChildren().add(postKassePind);
		postKassePind.setFill(Color.GRAY);

		Rectangle postKasse = new Rectangle(340,280,30,15);
		pane.getChildren().add(postKasse);
		postKasse.setFill(Color.BROWN);



	}

}
