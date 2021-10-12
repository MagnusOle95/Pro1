package Opgave_5_Ol_logo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Text;
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


		//Cirklernes radius//

		//Blå Cirkel/
		Circle blåCirkel = new Circle(100, 100,50);
		pane.getChildren().add(blåCirkel);
		blåCirkel.setFill(null);
		blåCirkel.setStroke(Color.BLUE);
		blåCirkel.setStrokeWidth(5);

		//Sort Cirkel//
		Circle sortCirkel = new Circle(200,100,50);
		pane.getChildren().add(sortCirkel);
		sortCirkel.setFill(null);
		sortCirkel.setStroke(Color.BLACK);
		sortCirkel.setStrokeWidth(5);

		//rød Cirkel//
		Circle rødCirkel = new Circle(300,100,50);
		pane.getChildren().add(rødCirkel);
		rødCirkel.setFill(null);
		rødCirkel.setStroke(Color.RED);
		rødCirkel.setStrokeWidth(5);

		//Gul Cirkel//
		Circle gulCirkel = new Circle(150,150,50);
		pane.getChildren().add(gulCirkel);
		gulCirkel.setFill(null);
		gulCirkel.setStroke(Color.YELLOW);
		gulCirkel.setStrokeWidth(5);

		//Grøn Cirkel//
		Circle grønCirkel = new Circle(250,150,50);
		pane.getChildren().add(grønCirkel);
		grønCirkel.setFill(null);
		grønCirkel.setStroke(Color.GREEN);
		grønCirkel.setStrokeWidth(5);


	}

}
