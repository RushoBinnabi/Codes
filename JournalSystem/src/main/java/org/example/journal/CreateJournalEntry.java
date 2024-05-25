package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CreateJournalEntry extends Application {

    private final Button createJournalEntry = new Button();
    private final Button backToMainMenu = new Button();

    private final Label createJournalEntryLabel = new Label();

    private final TextArea createJournalEntryInput = new TextArea();

    private final GridPane createJournalEntryScreen = new GridPane();
    private final HBox createJournalEntryInputHBox = new HBox();
    private final HBox createJournalEntryButtonsHBox = new HBox();
    private final Label createJournalEntryConfirmation = new Label();

    public Button getCreateJournalEntry() {
        return createJournalEntry;
    }

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Label getCreateJournalEntryLabel() {
        return createJournalEntryLabel;
    }

    public TextArea getCreateJournalEntryInput() {
        return createJournalEntryInput;
    }

    public GridPane getCreateJournalEntryScreen() {
        return createJournalEntryScreen;
    }

    public HBox getCreateJournalEntryInputHBox() {
        return createJournalEntryInputHBox;
    }

    public HBox getCreateJournalEntryButtonsHBox() {
        return createJournalEntryButtonsHBox;
    }

    public Label getCreateJournalEntryConfirmation() {
        return createJournalEntryConfirmation;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        getCreateJournalEntryLabel().setText("Enter Text: ");
        getBackToMainMenu().setText("Back to Main Menu");
        getCreateJournalEntry().setText("Create Journal Entry");
        getCreateJournalEntryInput().setMaxWidth(350);
        getCreateJournalEntryInput().setMaxHeight(200);
        getCreateJournalEntryInputHBox().getChildren().addAll(getCreateJournalEntryLabel(), getCreateJournalEntryInput());
        getCreateJournalEntryScreen().add(getCreateJournalEntryInputHBox(), 1, 0);
        getCreateJournalEntryInputHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().getChildren().addAll(getCreateJournalEntry(), getBackToMainMenu());
        getCreateJournalEntryScreen().add(getCreateJournalEntryButtonsHBox(), 1, 2);
        getCreateJournalEntryButtonsHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryScreen().setVgap(10);
        getCreateJournalEntryScreen().setAlignment(Pos.CENTER);
        Scene scene = new Scene(getCreateJournalEntryScreen(), 800, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Journal System - Create Journal Entry");
        primaryStage.show();
    }
}
