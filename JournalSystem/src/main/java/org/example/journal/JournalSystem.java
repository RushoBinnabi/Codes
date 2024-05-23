package org.example.journal;

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JournalSystem extends Application {

    private final GridPane welcomeScreen = new GridPane();
    private final Journal journal = new Journal();

    public Journal getJournal() {
        return journal;
    }

    public GridPane getWelcomeScreen() {
        return welcomeScreen;
    }

    @Override
    public void start(Stage stage) {

    }

    public static void main(String[] args) {
        launch();
    }
}