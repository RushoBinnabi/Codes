package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewJournalEntries extends Application {

    private final Button backToMainMenu = new Button();
    private final GridPane viewJournalEntriesScreen = new GridPane();
    private String viewJournalEntriesNames;
    private final TextArea viewJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final VBox vbox = new VBox();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public GridPane getViewJournalEntriesScreen() {
        return viewJournalEntriesScreen;
    }

    public String getViewJournalEntriesNames() {
        return viewJournalEntriesNames;
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

    public VBox getVbox() {
        return vbox;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        getViewJournalEntries().setEditable(false);
        getBackToMainMenu().setText("Back to Main Menu");
        getVbox().getChildren().addAll(getViewJournalEntries(), getBackToMainMenu());
        getVbox().setAlignment(Pos.CENTER);
        getVbox().setSpacing(18);
        getViewJournalEntriesScreen().add(getVbox(), 0, 0);
        getViewJournalEntriesScreen().setAlignment(Pos.CENTER);
        Scene scene = new Scene(getViewJournalEntriesScreen(), 800, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Journal System - View Journal Entries");
        primaryStage.show();
    }
}
