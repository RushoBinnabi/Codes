package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class OpenJournalEntry extends Application {

    private final Button backToMainMenu = new Button();
    private final GridPane openJournalEntriesScreen = new GridPane();
    private String openJournalEntriesNames;
    private final TextArea viewJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final Button openJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField openJournalEntryTextField = new TextField();
    private final Label openJournalEntryLabel = new Label();
    private final HBox openJournalEntryFields = new HBox();
    private final TextArea openJournalEntryTextArea = new TextArea();
    private final VBox openJournalEntryVbox = new VBox();
    private final Label openJournalEntryConfirmation = new Label();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
    }

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    public String getOpenJournalEntriesNames() {
        return openJournalEntriesNames;
    }

    public Journal getJournal() {
        return journal;
    }

    public GridPane getOpenJournalEntriesScreen() {
        return openJournalEntriesScreen;
    }

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    public Label getOpenJournalEntryLabel() {
        return openJournalEntryLabel;
    }

    public TextField getOpenJournalEntryTextField() {
        return openJournalEntryTextField;
    }

    public HBox getOpenJournalEntryFields() {
        return openJournalEntryFields;
    }

    public TextArea getOpenJournalEntryTextArea() {
        return openJournalEntryTextArea;
    }

    public VBox getOpenJournalEntryVbox() {
        return openJournalEntryVbox;
    }

    public Label getOpenJournalEntryConfirmation() {
        return openJournalEntryConfirmation;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        getOpenJournalEntryButton().setText("Open Journal Entry");
        getBackToMainMenu().setText("Back to Main Menu");
        getOpenJournalEntryLabel().setText("Enter Journal Entry Name:");
        getOpenJournalEntryTextArea().setEditable(false);
        getButtonsHbox().getChildren().addAll(getOpenJournalEntryButton(), getBackToMainMenu());
        getButtonsHbox().setSpacing(12);
        getButtonsHbox().setAlignment(Pos.CENTER);
        getOpenJournalEntryFields().getChildren().addAll(getOpenJournalEntryLabel(), getOpenJournalEntryTextField());
        getOpenJournalEntryFields().setSpacing(12);
        getOpenJournalEntryFields().setAlignment(Pos.CENTER);
        getOpenJournalEntryVbox().getChildren().addAll(getOpenJournalEntryTextArea(), getOpenJournalEntryFields(), getButtonsHbox());
        getOpenJournalEntryVbox().setSpacing(18);
        getOpenJournalEntryVbox().setAlignment(Pos.CENTER);
        getOpenJournalEntriesScreen().add(getOpenJournalEntryVbox(), 0, 0);
        getOpenJournalEntriesScreen().setVgap(18);
        getOpenJournalEntriesScreen().setAlignment(Pos.CENTER);
        Scene scene = new Scene(getOpenJournalEntriesScreen(), 800, 500);
        primaryStage.setTitle("Journal System - Open Journal Entry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
