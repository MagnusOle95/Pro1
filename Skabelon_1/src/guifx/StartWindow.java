package guifx;

import application.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class StartWindow extends Application {

	
	@Override
	public void init() {
	//	Controller.initStorage(); ----Gør denne aktiv
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Skabelon 1");
		BorderPane pane = new BorderPane();
		this.initContent(pane);

		Scene scene = new Scene(pane);
		stage.setScene(scene);
		stage.show();
	}

	// -------------------------------------------------------------------------

	private void initContent(BorderPane pane) {
		TabPane tabPane = new TabPane();
		this.initTabPane(tabPane);
		pane.setCenter(tabPane);
	}

	private void initTabPane(TabPane tabPane) {
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);

		Tab tab1 = new Tab("Tab 1");
		tabPane.getTabs().add(tab1);

		Vindue1 vindue1 = new Vindue1();
		tab1.setContent(vindue1);
		tab1.setOnSelectionChanged(event -> vindue1.updateControls());

		Tab tab2 = new Tab("Tab 2");
		tabPane.getTabs().add(tab2);

		Vindue2 vindue2 = new Vindue2();
		tab2.setContent(vindue2);
		tab2.setOnSelectionChanged(event -> vindue2.updateControls());
	}

}
