package org.example.journal;

import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;

public class ViewJournalEntries extends Application {

    private final Button backToMainMenu = new Button();
    private final GridPane viewJournalEntriesScreen = new GridPane();
    private String viewJournalEntriesNames;
    private final TextArea viewJournalEntries = new TextArea();
    private final HBox viewJournalEntriesHBox = new HBox();
    private final Journal journal = new Journal();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public GridPane getViewJournalEntriesScreen() {
        return viewJournalEntriesScreen;
    }

    public String getViewJournalEntriesNames() {
        return viewJournalEntriesNames;
    }

    public HBox getViewJournalEntriesHBox() {
        return viewJournalEntriesHBox;
    }

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    public void setViewJournalEntriesNames(String string) {
        viewJournalEntriesNames = string.concat(".txt");
    }

    public Journal getJournal() {
        return journal;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // continue here.
    }
}
