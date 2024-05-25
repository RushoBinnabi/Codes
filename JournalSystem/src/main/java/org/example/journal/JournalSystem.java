package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JournalSystem extends Application {

    private final StackPane welcomeScreen = new StackPane();
    private final HBox buttons = new HBox(14); // sets the spacing to 14.
    private final Journal journal = new Journal();
    private final Button createJournalEntryButton = new Button();
    private final Button viewJournalEntriesButton = new Button();
    private final Button deleteJournalEntriesButton = new Button();
    private final Button readJournalEntryButton = new Button();
    private final Button openJournalEntryButton = new Button();

    public Journal getJournal() {
        return journal;
    }

    public StackPane getWelcomeScreen() {
        return welcomeScreen;
    }

    public Button getCreateJournalEntryButton() {
        return createJournalEntryButton;
    }

    public Button getDeleteJournalEntriesButton() {
        return deleteJournalEntriesButton;
    }

    public Button getViewJournalEntriesButton() {
        return viewJournalEntriesButton;
    }

    public HBox getButtons() {
        return buttons;
    }

    public Button getReadJournalEntryButton() {
        return readJournalEntryButton;
    }

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
    }

    @Override
    public void start(Stage stage) {
        getCreateJournalEntryButton().setText("Create Journal Entry");
        getViewJournalEntriesButton().setText("View Journal Entries");
        getDeleteJournalEntriesButton().setText("Delete Journal Entry");
        getOpenJournalEntryButton().setText("Open Journal Entry");
        getReadJournalEntryButton().setText("Read Journal Entry");
        getButtons().getChildren().addAll(getCreateJournalEntryButton(), getReadJournalEntryButton(), getViewJournalEntriesButton(), getOpenJournalEntryButton(), getDeleteJournalEntriesButton());
        getButtons().setAlignment(Pos.CENTER);
        getWelcomeScreen().getChildren().addAll(getButtons());
        Scene welcomeScreenScene = new Scene(getWelcomeScreen(), 800, 500);
        stage.setTitle("Welcome - Journal System - Select one of the following:");
        stage.setScene(welcomeScreenScene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}