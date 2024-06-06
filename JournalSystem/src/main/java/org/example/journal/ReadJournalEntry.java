/**
 * Name: Rusho Binnabi
 * Date: 6/6/2024
 * Project: Journal System - ReadJournalEntry
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

public class ReadJournalEntry extends Application {

    // this ReadJournalEntry claas file has the menu for reading journal entries.

    private Stage readJournalEntryStage;
    private final Button backToMainMenu = new Button();
    private final GridPane readJournalEntriesScreen = new GridPane();
    private final Journal journal = new Journal();
    private final Button readJournalEntryButton = new Button();
    private final HBox buttonsHbox = new HBox();
    private final TextField readJournalEntryTextField = new TextField();
    private final Label readJournalEntryLabel = new Label();
    private final HBox readJournalEntryFields = new HBox();
    private final TextArea readJournalEntryTextArea = new TextArea();
    private final VBox readJournalEntryVbox = new VBox();

    /**
     * this getBackToMainMenu() method gets the Button object for the main menu.
     * @return the Button object for the main menu.
     */

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    /**
     * this getReadJournalEntryButton() method gets the Button object for reading journal entries.
     * @return the Button object for reading journal entries.
     */

    public Button getReadJournalEntryButton() {
        return readJournalEntryButton;
    }

    /**
     * this getJournal() method gets the Journal object that has the functionality for the journaling system.
     * @return the Journal object that has the functionality for the journaling system.
     */

    public Journal getJournal() {
        return journal;
    }

    /**
     * this getReadJournalEntriesScreen() method gets the GridPane object that has the screen for the menu.
     * @return the GridPane object that has the screen for the menu.
     */

    public GridPane getReadJournalEntriesScreen() {
        return readJournalEntriesScreen;
    }

    /**
     * this getButtonsHbox() method gets the HBox object that has the arrangement of the Button objects.
     * @return the HBox object that has the arrangement of the Button objects.
     */

    public HBox getButtonsHbox() {
        return buttonsHbox;
    }

    /**
     * this getReadJournalEntryLabel() method gets the Label object that tells the user to
     * enter the name of the journal entry that will be read.
     * @return the Label object that tells the user to enter the name of the journal entry that will be read.
     */

    public Label getReadJournalEntryLabel() {
        return readJournalEntryLabel;
    }

    /**
     * this getReadJournalEntryTextField() method gets the TextField object that gets the input
     * from the user for the name of the journal entry that will be read.
     * @return the TextField object that gets the input from the user for the name of the journal entry that will be read.
     */

    public TextField getReadJournalEntryTextField() {
        return readJournalEntryTextField;
    }


    /**
     * this getReadJournalEntryFields() method gets the HBox object that has the arrangement for the inputs.
     * @return the HBox object that has the arrangement for the inputs.
     */

    public HBox getReadJournalEntryFields() {
        return readJournalEntryFields;
    }

    /**
     * this getReadJournalEntryTextArea() method gets the TextArea object that will
     * show the contents of the journal entry being read.
     * @return the TextArea object that will show the contents of the journal entry being read.
     */

    public TextArea getReadJournalEntryTextArea() {
        return readJournalEntryTextArea;
    }

    /**
     * this getReadJournalEntryVbox() method gets the VBox object that has the arrangement for the menu.
     * @return the VBox object that has the arrangement for the menu.
     */

    public VBox getReadJournalEntryVbox() {
        return readJournalEntryVbox;
    }

    /**
     * this getReadJournalEntryStage() method gets the Stage object for the menu.
     * @return the Stage object for the menu.
     */

    public Stage getReadJournalEntryStage() {
        return readJournalEntryStage;
    }

    /**
     * this setReadJournalEntryStage() method sets the stage for the menu.
     * @param readJournalEntryStage the stage for the menu being set.
     */

    public void setReadJournalEntryStage(Stage readJournalEntryStage) {
        this.readJournalEntryStage = readJournalEntryStage;
    }

    /**
     * this start() method has everything needed for the menu for reading journal entries.
     * @param primaryStage the stage for the menu for reading journal entries.
     */

    @Override
    public void start(Stage primaryStage) {
        setReadJournalEntryStage(primaryStage);
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
        getReadJournalEntryVbox().getChildren().addAll(getReadJournalEntryFields(), getReadJournalEntryTextArea(), getButtonsHbox());
        getReadJournalEntryVbox().setSpacing(18);
        getReadJournalEntryVbox().setAlignment(Pos.CENTER);
        getReadJournalEntriesScreen().add(getReadJournalEntryVbox(), 0, 0);
        getReadJournalEntryButton().setOnAction(e -> readEntry());
        getBackToMainMenu().setOnAction(e -> mainMenu());
        getReadJournalEntriesScreen().setVgap(18);
        getReadJournalEntriesScreen().setAlignment(Pos.CENTER);
        Scene scene = new Scene(getReadJournalEntriesScreen(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT);
        primaryStage.setTitle("Journal System - Read Journal Entry");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * this readEntry() method reads the journal entries.
     */

    private void readEntry() {
        getReadJournalEntryTextArea().setText(getJournal().readJournalEntry(getReadJournalEntryTextField().getText()));
    }

    /**
     * this mainMenu() method redirects the screen to the main menu when the appropriate button is clicked.
     * it also closes the screen for reading journal entries.
     */

    private void mainMenu() {
        getReadJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }

    /**
     * this main() method runs the program.
     * @param args the program being run.
     */

    public static void main(String[] args) {
        launch(args);
    }
}