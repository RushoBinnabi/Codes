/**
 * Name: Rusho Binnabi
 * Date: 6/5/2024
 * Project: Journal System - OpenEditJournalEntry
 * Contact Information: RushoBinnabi123@yahoo.com
 */

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

    // this OpenEditJournalEntry class file has the menu for opening and editing journal entries.

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

    /**
     * this getBackToMainMenu() method gets the Button object that has the main menu.
     * @return the Button object that has the main menu.
     */

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    /**
     * this getOpenJournalEntryButton() method gets the Button object that opens journal entries.
     * @return the Button object that opens journal entries.
     */

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
    }

    /**
     * this getJournal() method gets the Journal object that has the functionality for the journaling system.
     * @return the Journal object that has the functionality for the journaling system.
     */

    public Journal getJournal() {
        return journal;
    }

    /**
     * this getOpenJournalEntriesScreen() method gets the GridPane object that has the menu
     * for opening or editing journal entries.
     * @return the GridPane object that has the menu for opening or editing journal entries.
     */

    public GridPane getOpenJournalEntriesScreen() {
        return openJournalEntriesScreen;
    }

    /**
     * this getButtonsHbox() method gets the HBox object that has the arrangement for the buttons.
     * @return the HBox object that has the arrangement for the buttons.
     */

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    /**
     * this getOpenJournalEntryLabel() method gets the Label object that has the prompt
     * for opening or editing journal entries.
     * @return the Label object that has the prompt for opening or editing journal entries.
     */

    public Label getOpenJournalEntryLabel() {
        return openJournalEntryLabel;
    }

    /**
     * this getOpenJournalEntryTextField() method gets the TextField object that has the input
     * for opening or editing a journal entry.
     * @return the TextField object that has the input for opening or editing a journal entry.
     */

    public TextField getOpenJournalEntryTextField() {
        return openJournalEntryTextField;
    }

    /**
     * this getOpenJournalEntryFields() method gets the HBox object that has the arrangement of the inputs.
     * @return the HBox object that has the arrangement of the inputs.
     */

    public HBox getOpenJournalEntryFields() {
        return openJournalEntryFields;
    }

    /**
     * this getOpenJournalEntryTextArea() method gets the TextArea object
     * that has the list of files that can be opened and edited.
     * @return the TextArea object that has the list of files that can be opened and edited.
     */

    public TextArea getOpenJournalEntryTextArea() {
        return openJournalEntryTextArea;
    }

    /**
     * this getOpenJournalEntryVbox() method gets the VBox object that has the arrangement of the menu.
     * @return the VBox object that has the arrangement of the menu.
     */

    public VBox getOpenJournalEntryVbox() {
        return openJournalEntryVbox;
    }

    /**
     * this getOpenJournalEntryConfirmation() method gets the Label object that tells the user
     * if the journal entry has been opened or edited.
     * @return the Label object that tells the user if the journal entry has been opened or edited.
     */

    public Label getOpenJournalEntryConfirmation() {
        return openJournalEntryConfirmation;
    }

    /**
     * this getOpenJournalEntryScene() method gets the Scene object for the menu.
     * @return the scene object for the menu.
     */

    public Scene getOpenJournalEntryScene() {
        return openJournalEntryScene;
    }

    /**
     * this getOpenJournalEntryStage() method gets the Stage object for the menu.
     * @return the stage object for the menu.
     */

    public Stage getOpenJournalEntryStage() {
        return openJournalEntryStage;
    }

    /**
     * this setOpenJournalEntryScene() method sets the Scene object for the menu.
     * @param openJournalEntryScene the Scene object being set for the menu.
     */

    public void setOpenJournalEntryScene(Scene openJournalEntryScene) {
        this.openJournalEntryScene = openJournalEntryScene;
    }

    /**
     * this setOpenJournalEntryStage() method sets the Stage object for the menu.
     * @param openJournalEntryStage the Stage object being set for the menu.
     */

    public void setOpenJournalEntryStage(Stage openJournalEntryStage) {
        this.openJournalEntryStage = openJournalEntryStage;
    }

    /**
     * this getSaveJournalEntryButton() method gets the Button object that saves the journal entry when clicked.
     * @return the Button object that saves the journal entry when clicked.
     */

    public Button getSaveJournalEntryButton() {
        return saveJournalEntryButton;
    }

    /**
     * this start() method contains everything for the menu for opening or editing journal entries of the journaling system to function.
     * @param primaryStage the stage that has everything for the menu for opening or editing journal entries of the journaling system.
     */

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

    /**
     * this main() method runs the program.
     * @param args the program being run.
     */

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * this saveEntry() method saves the journal entry when the appropriate button is clicked.
     */

    private void saveEntry() {
        String input = getOpenJournalEntryTextArea().getText();
        String name = getOpenJournalEntryTextField().getText();
        getOpenJournalEntryConfirmation().setScaleX(1.3);
        getOpenJournalEntryConfirmation().setScaleY(1.3);
        getJournal().createJournalEntry(name, input); // the filename that gets returned gets ignored here because there's no need for it.
                                                        // the function for creating journal entries gets reused for saving the journal entries.
        getOpenJournalEntryConfirmation().setText("Journal Entry Saved");
    }

    /**
     * this openEntry() method opens the journal entry when the appropriate button is clicked.
     */

    private void openEntry() {
        String input = getOpenJournalEntryTextField().getText();
        getOpenJournalEntryTextArea().setEditable(true);
        getOpenJournalEntryTextArea().setText(getJournal().readJournalEntry(input)); // the function for reading journal entries gets reused for opening journal entries.
    }

    /**
     * this mainMenu() method switches the screen to the main menu when the appropriate button is clicked.
     */

    private void mainMenu() {
        getOpenJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }
}
