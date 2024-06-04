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

public class DeleteJournalEntry extends Application {

    private Scene deleteJournalEntryScene;
    private Stage deleteJournalEntryStage;
    private final Button backToMainMenu = new Button();
    private final GridPane deleteJournalEntriesScreen = new GridPane();
    private String viewJournalEntriesNames;
    private final TextArea viewJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final Button deleteJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField deleteJournalEntryTextField = new TextField();
    private final Label deleteJournalEntryLabel = new Label();
    private final HBox deleteJournalEntryFields = new HBox();
    private final TextArea deleteJournalEntryTextArea = new TextArea();
    private final VBox deleteJournalEntryVbox = new VBox();
    private final Label deleteJournalEntryConfirmation = new Label();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Button getDeleteJournalEntryButton() {
        return deleteJournalEntryButton;
    }

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    public String getViewJournalEntriesNames() {
        return viewJournalEntriesNames;
    }

    public Journal getJournal() {
        return journal;
    }

    public GridPane getDeleteJournalEntriesScreen() {
        return deleteJournalEntriesScreen;
    }

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    public Label getDeleteJournalEntryLabel() {
        return deleteJournalEntryLabel;
    }

    public TextField getDeleteJournalEntryTextField() {
        return deleteJournalEntryTextField;
    }

    public HBox getDeleteJournalEntryFields() {
        return deleteJournalEntryFields;
    }

    public TextArea getDeleteJournalEntryTextArea() {
        return deleteJournalEntryTextArea;
    }

    public VBox getDeleteJournalEntryVbox() {
        return deleteJournalEntryVbox;
    }

    public Label getDeleteJournalEntryConfirmation() {
        return deleteJournalEntryConfirmation;
    }

    public Scene getDeleteJournalEntryScene() {
        return deleteJournalEntryScene;
    }

    public void setDeleteJournalEntryScene(Scene deleteJournalEntryScene) {
        this.deleteJournalEntryScene = deleteJournalEntryScene;
    }

    public Stage getDeleteJournalEntryStage() {
        return deleteJournalEntryStage;
    }

    public void setDeleteJournalEntryStage(Stage deleteJournalEntryStage) {
        this.deleteJournalEntryStage = deleteJournalEntryStage;
    }

    @Override
    public void start(Stage primaryStage) {
        setDeleteJournalEntryStage(primaryStage);
        getDeleteJournalEntryButton().setText("Delete Journal Entry");
        getBackToMainMenu().setText("Back to Main Menu");
        getDeleteJournalEntryLabel().setText("Enter Journal Entry Name:");
        getDeleteJournalEntryTextArea().setEditable(false);
        getButtonsHbox().getChildren().addAll(getDeleteJournalEntryButton(), getBackToMainMenu());
        getButtonsHbox().setSpacing(12);
        getButtonsHbox().setAlignment(Pos.CENTER);
        getDeleteJournalEntryFields().getChildren().addAll(getDeleteJournalEntryLabel(), getDeleteJournalEntryTextField());
        getDeleteJournalEntryFields().setSpacing(12);
        getDeleteJournalEntryFields().setAlignment(Pos.CENTER);
        getDeleteJournalEntryVbox().getChildren().addAll(getDeleteJournalEntryTextArea(), getDeleteJournalEntryFields(), getButtonsHbox(), getDeleteJournalEntryConfirmation());
        getDeleteJournalEntryVbox().setSpacing(18);
        getDeleteJournalEntryVbox().setAlignment(Pos.CENTER);
        getDeleteJournalEntryButton().setOnAction(e -> deleteEntry());
        getBackToMainMenu().setOnAction(e -> mainMenu());
        getDeleteJournalEntriesScreen().add(getDeleteJournalEntryVbox(), 0, 0);
        getDeleteJournalEntriesScreen().setVgap(18);
        getDeleteJournalEntriesScreen().setAlignment(Pos.CENTER);
        setDeleteJournalEntryScene(new Scene(getDeleteJournalEntriesScreen(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT));
        primaryStage.setTitle("Journal System - Delete Journal Entry");
        getDeleteJournalEntryStage().setScene(getDeleteJournalEntryScene());
        getDeleteJournalEntryStage().show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void mainMenu() {
        getDeleteJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }

    private void deleteEntry() {
        getDeleteJournalEntryTextArea().setText(getJournal().deleteJournalEntry(getDeleteJournalEntryTextField().getText()));
    }
}
