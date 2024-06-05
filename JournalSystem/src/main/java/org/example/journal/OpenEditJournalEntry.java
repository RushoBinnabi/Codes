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

import java.util.ArrayList;

public class OpenEditJournalEntry extends Application {

    private Scene openJournalEntryScene;
    private Stage openJournalEntryStage;
    private final Button backToMainMenu = new Button();
    private final GridPane openJournalEntriesScreen = new GridPane();
    private final Journal journal = new Journal();
    private final Button openJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField openJournalEntryTextField = new TextField();
    private final Label openJournalEntryLabel = new Label();
    private final HBox openJournalEntryFields = new HBox();
    private final TextArea openJournalEntryTextArea = new TextArea();
    private final VBox openJournalEntryVbox = new VBox();
    private final Label openJournalEntryConfirmation = new Label();
    private final Button saveJournalEntryButton = new Button();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
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

    public Scene getOpenJournalEntryScene() {
        return openJournalEntryScene;
    }

    public Stage getOpenJournalEntryStage() {
        return openJournalEntryStage;
    }

    public void setOpenJournalEntryScene(Scene openJournalEntryScene) {
        this.openJournalEntryScene = openJournalEntryScene;
    }

    public void setOpenJournalEntryStage(Stage openJournalEntryStage) {
        this.openJournalEntryStage = openJournalEntryStage;
    }

    public Button getSaveJournalEntryButton() {
        return saveJournalEntryButton;
    }

    @Override
    public void start(Stage primaryStage) {
        setOpenJournalEntryStage(primaryStage);
        getOpenJournalEntryButton().setText("Open Journal Entry");
        getBackToMainMenu().setText("Back to Main Menu");
        getOpenJournalEntryLabel().setText("Enter Journal Entry Name:");
        getSaveJournalEntryButton().setText("Save Journal Entry");
        getButtonsHbox().getChildren().addAll(getOpenJournalEntryButton(), getSaveJournalEntryButton(), getBackToMainMenu());
        getButtonsHbox().setSpacing(12);
        getButtonsHbox().setAlignment(Pos.CENTER);
        getOpenJournalEntryFields().getChildren().addAll(getOpenJournalEntryLabel(), getOpenJournalEntryTextField());
        getOpenJournalEntryFields().setSpacing(18);
        getOpenJournalEntryFields().setAlignment(Pos.CENTER);
        getOpenJournalEntryTextArea().setScaleX(1.3);
        getOpenJournalEntryTextArea().setScaleY(1.3);
        getOpenJournalEntryVbox().getChildren().addAll(getOpenJournalEntryFields(), getOpenJournalEntryTextArea(), getButtonsHbox(), getOpenJournalEntryConfirmation());
        getOpenJournalEntryVbox().setSpacing(45);
        getOpenJournalEntryVbox().setAlignment(Pos.CENTER);
        getOpenJournalEntriesScreen().add(getOpenJournalEntryVbox(), 0, 0);
        ArrayList<String> files = new ArrayList<>(getJournal().viewJournalEntries());
        getOpenJournalEntryTextArea().setEditable(false);
        if (files.isEmpty()) {
            getOpenJournalEntryTextArea().setText("No journal entries available");
        }
        else {
            getOpenJournalEntryTextArea().setText(String.valueOf(files).replaceAll(",", "").replace('[', ' ').replaceAll("]", ""));
        }
        getOpenJournalEntryButton().setOnAction(e -> openEntry());
        getSaveJournalEntryButton().setOnAction(e -> saveEntry());
        getBackToMainMenu().setOnAction(e -> mainMenu());
        getOpenJournalEntriesScreen().setVgap(18);
        getOpenJournalEntriesScreen().setAlignment(Pos.CENTER);
        setOpenJournalEntryScene(new Scene(getOpenJournalEntriesScreen(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT));
        primaryStage.setTitle("Journal System - Open Journal Entry");
        getOpenJournalEntryStage().setScene(getOpenJournalEntryScene());
        getOpenJournalEntryStage().show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private void saveEntry() {
        String input = getOpenJournalEntryTextArea().getText();
        String name = getOpenJournalEntryTextField().getText();
        getOpenJournalEntryConfirmation().setScaleX(1.3);
        getOpenJournalEntryConfirmation().setScaleY(1.3);
        getJournal().createJournalEntry(name, input); // the filename that gets returned gets ignored here because there's no need for it.
                                                        // the function for creating journal entries gets reused for saving the journal entries.
        getOpenJournalEntryConfirmation().setText("Journal Entry Saved");
    }


    private void openEntry() {
        String input = getOpenJournalEntryTextField().getText();
        getOpenJournalEntryTextArea().setEditable(true);
        getOpenJournalEntryTextArea().setText(getJournal().readJournalEntry(input)); // the function for reading journal entries gets reused for opening journal entries.
    }

    private void mainMenu() {
        getOpenJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }
}
