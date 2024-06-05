/**
 * Name: Rusho Binnabi
 * Date: 6/3/2024
 * Project: Journal System - DeleteJournalEntry
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

public class DeleteJournalEntry extends Application {

    // this DeleteJournalEntry file has the menu for deleting journal entries.

    private Scene deleteJournalEntryScene;
    private Stage deleteJournalEntryStage;
    private final Button backToMainMenu = new Button();
    private final GridPane deleteJournalEntriesScreen = new GridPane();
    private final Journal journal = new Journal();
    private final Button deleteJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField deleteJournalEntryTextField = new TextField();
    private final Label deleteJournalEntryLabel = new Label();
    private final HBox deleteJournalEntryFields = new HBox();
    private final TextArea deleteJournalEntryTextArea = new TextArea();
    private final VBox deleteJournalEntryVbox = new VBox();
    private final Label deleteJournalEntryConfirmation = new Label();

    /**
     * this getBackToMainMenu() method gets the Button object that gets the main menu.
     * @return the Button object that gets the main menu.
     */

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    /**
     * this getDeleteJournalEntryButton() method gets the Button object that deletes the journal entries.
     * @return the Button object that deletes the journal entries.
     */

    public Button getDeleteJournalEntryButton() {
        return deleteJournalEntryButton;
    }

    /**
     * this getJournal() method gets the Journal object that has the functionality for the journaling system.
     * @return the Journal object that has the functionality for the journaling system.
     */

    public Journal getJournal() {
        return journal;
    }

    /**
     * this getDeleteJournalEntriesScreen() method gets the GridPane object that has the menu for deleting journal entries.
     * @return the GridPane object that has the menu for deleting journal entries.
     */

    public GridPane getDeleteJournalEntriesScreen() {
        return deleteJournalEntriesScreen;
    }

    /**
     * this getButtonsHbox() method gets the HBox object that has the arrangement for the buttons.
     * @return the HBox object that has the arrangement for the buttons.
     */

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    /**
     * this getDeleteJournalEntryLabel() method gets the Label object that has the prompt for the input.
     * @return the Label object that has the prompt for the input.
     */

    public Label getDeleteJournalEntryLabel() {
        return deleteJournalEntryLabel;
    }

    /**
     * this getDeleteJournalEntryTextField() method has the TextArea object
     * that has the name of the journal entry from the list of files that will be deleted.
     * @return the TextArea object that has the list of the files.
     */

    public TextField getDeleteJournalEntryTextField() {
        return deleteJournalEntryTextField;
    }

    /**
     * this getDeleteJournalEntryFields() method gets the HBox object that has the arrangement of the two TextAreas.
     * @return the HBox object that has the arrangements for the TextAreas.
     */

    public HBox getDeleteJournalEntryFields() {
        return deleteJournalEntryFields;
    }

    /**
     * this getDeleteJournalEntryTextArea() method gets the TextArea object that has the list of files.
     * @return the TextArea object that has the list of files.
     */

    public TextArea getDeleteJournalEntryTextArea() {
        return deleteJournalEntryTextArea;
    }

    /**
     * this getDeleteJournalEntryVbox() method gets the VBox object that has the arrangement of the menu.
     * @return the VBox object that has the arrangement of the menu.
     */


    public VBox getDeleteJournalEntryVbox() {
        return deleteJournalEntryVbox;
    }

    /**
     * this getDeleteJournalEntryConfirmation() method gets the Label object
     * that tells the user if the journal entry was deleted or not.
     * @return the Label object that tells the user if the journal entry was deleted or not.
     */

    public Label getDeleteJournalEntryConfirmation() {
        return deleteJournalEntryConfirmation;
    }

    /**
     * this getDeleteJournalEntryScene() gets the Scene object for the menu.
     * @return the Scene object for the menu.
     */

    public Scene getDeleteJournalEntryScene() {
        return deleteJournalEntryScene;
    }

    /**
     * this setDeleteJournalEntryScene() method sets the scene for the menu.
     * @param deleteJournalEntryScene the scene for the menu being set.
     */

    public void setDeleteJournalEntryScene(Scene deleteJournalEntryScene) {
        this.deleteJournalEntryScene = deleteJournalEntryScene;
    }

    /**
     * this getDeleteJournalEntryStage() method gets the Stage object for the menu.
     * @return the Stage object for the menu.
     */

    public Stage getDeleteJournalEntryStage() {
        return deleteJournalEntryStage;
    }

    /**
     * this setDeleteJournalEntryStage() method sets the stage for the menu.
     * @param deleteJournalEntryStage the stage for the menu being set.
     */

    public void setDeleteJournalEntryStage(Stage deleteJournalEntryStage) {
        this.deleteJournalEntryStage = deleteJournalEntryStage;
    }

    /**
     * this start() method contains everything for the menu for deleting journal entries of the journaling system to function.
     * @param primaryStage the stage that has everything for the menu for deleting journal entries of the journaling system.
     */

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
        ArrayList<String> files = new ArrayList<>(getJournal().viewJournalEntries());
        getDeleteJournalEntryTextArea().setEditable(false); // the TextArea will only be used to show the list of journal entries that can be deleted.
        if (files.isEmpty()) {
            getDeleteJournalEntryTextArea().setText("No journal entries available");
        }
        else {
            getDeleteJournalEntryTextArea().setText(String.valueOf(files).replaceAll(",", "").replace('[', ' ').replaceAll("]", ""));
        }
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

    /**
     * the main() method runs the program.
     * @param args the program being run.
     */

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * this mainMenu() method switches the screen to the main menu when the appropriate button
     * is clicked. it also closes the current screen.
     */

    private void mainMenu() {
        getDeleteJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }

    /**
     * this deleteEntry() method deletes a journal entry when the appropriate button is clicked.
     */

    private void deleteEntry() {
        getDeleteJournalEntryConfirmation().setScaleX(1.3);
        getDeleteJournalEntryConfirmation().setScaleY(1.3);
        getDeleteJournalEntryConfirmation().setText(getJournal().deleteJournalEntry(getDeleteJournalEntryTextField().getText()));
    }
}
