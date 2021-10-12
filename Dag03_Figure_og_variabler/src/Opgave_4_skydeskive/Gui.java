package Opgave_4_skydeskive;

import javafx.application.Application;
import javafx.css.Size;
import javafx.css.SizeUnits;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
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

		//variabler til cirkler//

		//Yder sort cirkel//
		Circle Cirkel_1 = new Circle(200,200,100);
		pane.getChildren().add(Cirkel_1);
		Cirkel_1.setFill(Color.BLACK);

		//Yder hvid Cirkel//
		Circle Cirkel_2 = new Circle(200,200,80);
		pane.getChildren().add(Cirkel_2);
		Cirkel_2.setFill(Color.WHITE);

		//midt sort cirkel//
		Circle cirkel_3 = new Circle(200,200,60);
		pane.getChildren().add(cirkel_3);
		cirkel_3.setFill(Color.BLACK);

		//inder hvid cirkel//
		Circle Cirkel_4 = new Circle(200,200,40);
		pane.getChildren().add(Cirkel_4);
		Cirkel_4.setFill(Color.WHITE);

		//sort midte//
		Circle Cirkel_5 = new Circle(200,200,20);
		pane.getChildren().add(Cirkel_5);
		Cirkel_5.setFill(Color.BLACK);

	}

}
