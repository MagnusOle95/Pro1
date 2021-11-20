package guifx;

import application.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Interface extends Application {


	@Override
	public void init(){
		Controller.init();
	}

	@Override
	public void start(Stage stage) {
		stage.setTitle("konferencer");
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

		Tab tabKonferencePane = new Tab("konferencer");
		tabPane.getTabs().add(tabKonferencePane);

		KonferencePane konferencePane = new KonferencePane();
		tabKonferencePane.setContent(konferencePane);

		//tabCompanies.setOnSelectionChanged(event -> companyPane.updateControls());


		Tab tabDeltagerPane = new Tab("Deltager");
		tabPane.getTabs().add(tabDeltagerPane);

		DeltagerPane deltagerPane = new DeltagerPane();
		tabDeltagerPane.setContent(deltagerPane);
		//tabCompanies.setOnSelectionChanged(event -> companyPane.updateControls());


		Tab tabHotellerPane = new Tab("Hoteller");
		tabPane.getTabs().add(tabHotellerPane);

		HotelPane hotelpane = new HotelPane();
		tabHotellerPane.setContent(hotelpane);

	}


}
