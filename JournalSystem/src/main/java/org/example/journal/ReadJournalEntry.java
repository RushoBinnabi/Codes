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

public class ReadJournalEntry extends Application {

    private final Button backToMainMenu = new Button();
    private final GridPane readJournalEntriesScreen = new GridPane();
    private String openJournalEntriesNames;
    private final TextArea readJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final Button readJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField readJournalEntryTextField = new TextField();
    private final Label readJournalEntryLabel = new Label();
    private final HBox readJournalEntryFields = new HBox();
    private final TextArea readJournalEntryTextArea = new TextArea();
    private final VBox readJournalEntryVbox = new VBox();
    private final Label readJournalEntryConfirmation = new Label();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Button getReadJournalEntryButton() {
        return readJournalEntryButton;
    }

    public TextArea getReadJournalEntries() {
        return readJournalEntries;
    }

    public String getOpenJournalEntriesNames() {
        return openJournalEntriesNames;
    }

    public Journal getJournal() {
        return journal;
    }

    public GridPane getReadJournalEntriesScreen() {
        return readJournalEntriesScreen;
    }

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    public Label getReadJournalEntryLabel() {
        return readJournalEntryLabel;
    }

    public TextField getReadJournalEntryTextField() {
        return readJournalEntryTextField;
    }

    public HBox getReadJournalEntryFields() {
        return readJournalEntryFields;
    }

    public TextArea getReadJournalEntryTextArea() {
        return readJournalEntryTextArea;
    }

    public VBox getReadJournalEntryVbox() {
        return readJournalEntryVbox;
    }

    public Label getReadJournalEntryConfirmation() {
        return readJournalEntryConfirmation;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        getReadJournalEntryButton().setText("Read Journal Entry");
        getBackToMainMenu().setText("Back to Main Menu");
        getReadJournalEntryLabel().setText("Enter Journal Entry Name:");
        getReadJournalEntryTextArea().setEditable(false);
        getButtonsHbox().getChildren().addAll(getReadJournalEntryButton(), getBackToMainMenu());
        getButtonsHbox().setSpacing(12);
        getButtonsHbox().setAlignment(Pos.CENTER);
        getReadJournalEntryFields().getChildren().addAll(getReadJournalEntryLabel(), getReadJournalEntryTextField());
        getReadJournalEntryFields().setSpacing(12);
        getReadJournalEntryFields().setAlignment(Pos.CENTER);
        getReadJournalEntryVbox().getChildren().addAll(getReadJournalEntryTextArea(), getReadJournalEntryFields(), getButtonsHbox());
        getReadJournalEntryVbox().setSpacing(18);
        getReadJournalEntryVbox().setAlignment(Pos.CENTER);
        getReadJournalEntriesScreen().add(getReadJournalEntryVbox(), 0, 0);
        getReadJournalEntriesScreen().setVgap(18);
        getReadJournalEntriesScreen().setAlignment(Pos.CENTER);
        Scene scene = new Scene(getReadJournalEntriesScreen(), 800, 500);
        primaryStage.setTitle("Journal System - Read Journal Entry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}