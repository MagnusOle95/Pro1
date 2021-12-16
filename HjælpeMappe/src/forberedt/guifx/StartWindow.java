package forberedt.guifx;

import Gui.application.controller.Controller;
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
		Controller.init();
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("Arcitecture Demo");
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

		Tab tabCompanies = new Tab("Vindue1");
		tabPane.getTabs().add(tabCompanies);

		Vindue1 vindue1 = new Vindue1();
		tabCompanies.setContent(vindue1);
		tabCompanies.setOnSelectionChanged(event -> vindue1.updateControls());

		Tab tabEmployees = new Tab("Vindue2");
		tabPane.getTabs().add(tabEmployees);

		Vindue2 vindue2 = new Vindue2();
		tabEmployees.setContent(vindue2);
		tabEmployees.setOnSelectionChanged(event -> vindue2.updateControls());
	}

}
