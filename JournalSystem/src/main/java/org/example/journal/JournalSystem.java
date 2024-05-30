package org.example.journal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class JournalSystem extends Application {

    private Scene journalSystemScene;
    private Stage journalSystemStage;
    private final CreateJournalEntry createJournalEntry = new CreateJournalEntry();
    private final  DeleteJournalEntry deleteJournalEntry = new DeleteJournalEntry();
    private final OpenJournalEntry openJournalEntry = new OpenJournalEntry();
    private final ReadJournalEntry readJournalEntry = new ReadJournalEntry();
    private final ViewJournalEntries viewJournalEntries = new ViewJournalEntries();
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

    public Scene getJournalSystemScene() {
        return journalSystemScene;
    }

    public Stage getJournalSystemStage() {
        return journalSystemStage;
    }

    public void setJournalSystemScene(Scene journalSystemScene) {
        this.journalSystemScene = journalSystemScene;
    }

    public void setJournalSystemStage(Stage journalSystemStage) {
        this.journalSystemStage = journalSystemStage;
    }

    public CreateJournalEntry getCreateJournalEntry() {
        return createJournalEntry;
    }

    public ViewJournalEntries getViewJournalEntries() {
        return viewJournalEntries;
    }

    public ReadJournalEntry getReadJournalEntry() {
        return readJournalEntry;
    }

    public OpenJournalEntry getOpenJournalEntry() {
        return openJournalEntry;
    }

    public DeleteJournalEntry getDeleteJournalEntry() {
        return deleteJournalEntry;
    }

    @Override
    public void start(Stage stage) {
        setJournalSystemStage(stage);
        getCreateJournalEntryButton().setText("Create Journal Entry");
        getViewJournalEntriesButton().setText("View Journal Entries");
        getDeleteJournalEntriesButton().setText("Delete Journal Entry");
        getOpenJournalEntryButton().setText("Open Journal Entry");
        getReadJournalEntryButton().setText("Read Journal Entry");
        getButtons().getChildren().addAll(getCreateJournalEntryButton(), getReadJournalEntryButton(), getViewJournalEntriesButton(), getOpenJournalEntryButton(), getDeleteJournalEntriesButton());
        getButtons().setAlignment(Pos.CENTER);
        getWelcomeScreen().getChildren().addAll(getButtons());
        getCreateJournalEntryButton().setOnAction(e -> switchToCreateJournalEntryScreen());
        getDeleteJournalEntriesButton().setOnAction(e -> switchToDeleteJournalEntryScreen());
        // continue adding button functionality here.
        setJournalSystemScene(new Scene(getWelcomeScreen(), 800, 500));
        getJournalSystemStage().setTitle("Welcome - Journal System - Select one of the following:");
        getJournalSystemStage().setScene(getJournalSystemScene());
        getJournalSystemStage().show();
    }

    public static void main(String[] args) {
        launch();
    }

    private void switchToCreateJournalEntryScreen() {
        getCreateJournalEntry().start(new Stage());
    }

    private void switchToDeleteJournalEntryScreen() {
        getDeleteJournalEntry().start(new Stage());
    }
}