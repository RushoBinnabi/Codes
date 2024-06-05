/**
 * Name: Rusho Binnabi
 * Date: 6/2/2024
 * Project: Journal System - CreateJournalEntry
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

public class CreateJournalEntry extends Application {

    // this CreateJournalEntry file has the menu for creating journal entries.

    private Stage createJournalEntryStage;
    private Scene createJournalEntryScene;
    private final Button createJournalEntry = new Button();
    private final Button backToMainMenu = new Button();
    private final Label createJournalEntryLabel = new Label();
    private final TextArea createJournalEntryInput = new TextArea();
    private final GridPane createJournalEntryScreen = new GridPane();
    private final HBox createJournalEntryInputHBox = new HBox();
    private final HBox createJournalEntryButtonsHBox = new HBox();
    private final Label createJournalEntryConfirmation = new Label();
    private final TextField createJournalEntryFilenameInput = new TextField();
    private final Label createJournalEntryFilenameLabel = new Label();
    private final HBox createJournalEntryFilenameHBox = new HBox();
    private final VBox createJournalEntryFilenameVBox = new VBox();
    private final Journal journal = new Journal();
    private final VBox createJournalEntryConfirmationVBox = new VBox();
    private String name;
    private String contents;

    /**
     * this getCreateJournalEntry() method gets the Button object that will create the journal entry when pressed.
     * @return the button that will create the journal entry when pressed.
     */

    public Button getCreateJournalEntry() {
        return createJournalEntry;
    }

    /**
     * this getBackToMainMenu() method gets the Button object that will redirect the screen to the main menu when pressed.
     * @return the button object that will redirect the screen to the main menu when pressed.
     */

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    /**
     * this getCreateJournalEntryLabel() gets the Label object that has the text
     * for prompting the user to enter the contents for the journal entry.
     * @return the Label object that has the text for prompting the user to enter the contents for the journal entry.
     */

    public Label getCreateJournalEntryLabel() {
        return createJournalEntryLabel;
    }

    /**
     * this getCreateJournalEntryInput() method gets the TextArea object
     * that has the contents that the user entered for the journal entry.
     * @return the TextArea object that has the contents that the user entered for the journal entry.
     */

    public TextArea getCreateJournalEntryInput() {
        return createJournalEntryInput;
    }

    /**
     * this getCreateJournalEntryScreen() method gets the GridPane object that has everything arranged for the menu.
     * @return the GridPane object that has everything arranged for the menu.
     */

    public GridPane getCreateJournalEntryScreen() {
        return createJournalEntryScreen;
    }

    /**
     * this getCreateJournalEntryInputHBox() method gets the HBox object that has everything
     * arranged for the input for creating journal entries of the menu.
     * @return the HBox object that has everything arranged for the input for creating journal entries of the menu.
     */

    public HBox getCreateJournalEntryInputHBox() {
        return createJournalEntryInputHBox;
    }

    /**
     * this getCreateJournalEntryButtonsHBox() method gets the HBox object that has everything
     * arranged for the buttons for creating journal entries of the menu.
     * @return the HBox object that has everything arranged for the buttons for creating journal
     * entries of the menu.
     */

    public HBox getCreateJournalEntryButtonsHBox() {
        return createJournalEntryButtonsHBox;
    }

    /**
     * this getCreateJournalEntryConfirmation() method gets the Label object
     * that has the Label that tells the user if the journal entry was created or not.
     * @return the Label object that tells the user if the journal entry was created or not.
     */

    public Label getCreateJournalEntryConfirmation() {
        return createJournalEntryConfirmation;
    }

    /**
     * this getCreateJournalEntryFilenameInput() method gets the TextField object
     * that has the input for the filename for the journal entry.
     * @return the TextField object that has the input for the filename of the journal entry.
     */

    public TextField getCreateJournalEntryFilenameInput() {
        return createJournalEntryFilenameInput;
    }

    /**
     * this getCreateJournalEntryFilenameLabel gets the Label object that has the Label
     * that tells the user to enter the filename for the journal entry.
     * @return the Label that tells the user to enter the filename for the journal entry.
     */

    public Label getCreateJournalEntryFilenameLabel() {
        return createJournalEntryFilenameLabel;
    }

    /**
     * this getCreateJournalEntryFilenameHBox() method gets the HBox object
     * that has the filename for the journal entry.
     * @return the HBox object that has the filename for the journal entry.
     */

    public HBox getCreateJournalEntryFilenameHBox() {
        return createJournalEntryFilenameHBox;
    }

    /**
     * this getCreateJournalEntryFilenameVBox() method gets the VBox object
     * that has the filename for the journal entry.
     * @return the VBox object that has the filename for the journal entry.
     */

    public VBox getCreateJournalEntryFilenameVBox() {
        return createJournalEntryFilenameVBox;
    }

    /**
     * this getCreateJournalEntryStage() method gets the Stage object that
     * has the stage for the menu for creating journal entries.
     * @return the stage for the menu for creating journal entries.
     */

    public Stage getCreateJournalEntryStage() {
        return createJournalEntryStage;
    }

    /**
     * this getCreateJournalEntryScene() method gets the Scene object that
     * has the scene for the menu for creating journal entries.
     * @return the scene for the menu for creating journal entries.
     */

    public Scene getCreateJournalEntryScene() {
        return createJournalEntryScene;
    }

    /**
     * this setCreateJournalEntryStage() method sets the stage for the menu for creating journal entries.
     * @param createJournalEntryStage the stage for the menu for creating journal entries being set.
     */

    public void setCreateJournalEntryStage(Stage createJournalEntryStage) {
        this.createJournalEntryStage = createJournalEntryStage;
    }

    /**
     * this setCreateJournalEntryScene() method sets the scene for the menu for creating journal entries.
     * @param createJournalEntryScene the scene for the menu for creating journal entries.
     */

    public void setCreateJournalEntryScene(Scene createJournalEntryScene) {
        this.createJournalEntryScene = createJournalEntryScene;
    }

    /**
     * this getJournal() method gets the Journal object that has the functionality for the journaling system.
     * @return the Journal object that has the functionality for the journaling system.
     */

    public Journal getJournal() {
        return journal;
    }

    /**
     * this getCreateJournalEntryConfirmationLabelVBox() method gets the VBox object
     * that has the confirmation label after creating the journal entries.
     * @return the VBox object that has the confirmation label after creating the journal entries.
     */

    public VBox getCreateJournalEntryConfirmationLabelVBox() {
        return createJournalEntryConfirmationVBox;
    }

    /**
     * this getContents() method gets the contents of the journal entry.
     * @return the contents of the journal entry.
     */

    public String getContents() {
        return contents;
    }

    /**
     * this getName() method gets the name of the journal entry.
     * @return the name of the journal entry.
     */

    public String getName() {
        return name;
    }

    /**
     * this setContents() method sets the contents of the journal entry.
     * @param contents the contents of the journal entry being set.
     */

    public void setContents(String contents) {
        this.contents = contents;
    }

    /**
     * this setName() method sets the name of the journal entry.
     * @param name the name of the journal entry being set.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * this start() method contains everything for the menu for creating journal entries of the journaling system to function.
     * @param primaryStage the stage that has everything for the menu for creating journal entries of the journaling system.
     */

    @Override
    public void start(Stage primaryStage) {
        setCreateJournalEntryStage(primaryStage);
        getCreateJournalEntryLabel().setText("Enter Text: ");
        getBackToMainMenu().setText("Back to Main Menu");
        getCreateJournalEntry().setText("Create Journal Entry");
        getCreateJournalEntryFilenameLabel().setText("Enter filename:");
        getCreateJournalEntryConfirmationLabelVBox().getChildren().add(getCreateJournalEntryConfirmation());
        getCreateJournalEntryConfirmationLabelVBox().setSpacing(8);
        getCreateJournalEntryConfirmationLabelVBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryFilenameHBox().getChildren().addAll(getCreateJournalEntryFilenameLabel(), getCreateJournalEntryFilenameInput());
        getCreateJournalEntryInput().setMaxWidth(350);
        getCreateJournalEntryInput().setMaxHeight(200);
        getCreateJournalEntryInputHBox().getChildren().addAll(getCreateJournalEntryLabel(), getCreateJournalEntryInput());
        getCreateJournalEntryScreen().add(getCreateJournalEntryInputHBox(), 1, 1);
        getCreateJournalEntryInputHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().getChildren().addAll(getCreateJournalEntry(), getBackToMainMenu());
        getCreateJournalEntryFilenameHBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryFilenameVBox().getChildren().add(getCreateJournalEntryFilenameHBox());
        getCreateJournalEntryFilenameVBox().setSpacing(8);
        getCreateJournalEntryFilenameVBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryScreen().add(getCreateJournalEntryFilenameVBox(), 1, 0);
        getCreateJournalEntryFilenameHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryScreen().add(getCreateJournalEntryButtonsHBox(), 1, 2);
        getCreateJournalEntryScreen().add(getCreateJournalEntryConfirmationLabelVBox(), 1, 3);
        getCreateJournalEntryButtonsHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryScreen().setVgap(20);
        getCreateJournalEntryScreen().setAlignment(Pos.CENTER);
        getCreateJournalEntryConfirmation().setScaleX(1.3);
        getCreateJournalEntryConfirmation().setScaleY(1.3);
        getCreateJournalEntry().setOnAction(e -> createEntry());
        getBackToMainMenu().setOnAction(actionEvent -> mainMenu());
        setCreateJournalEntryScene(new Scene(getCreateJournalEntryScreen(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT));
        getCreateJournalEntryStage().setScene(getCreateJournalEntryScene());
        getCreateJournalEntryStage().setTitle("Journal System - Create Journal Entry");
        getCreateJournalEntryStage().show();
    }

    /**
     * this createEntry() method creates the journal entries when the appropriate button is clicked.
     */

    private void createEntry() {
        setContents(getCreateJournalEntryInput().getText());
        setName(getCreateJournalEntryFilenameInput().getText());
        getCreateJournalEntryConfirmation().setText(getJournal().createJournalEntry(getName(), getContents()));
    }

    /**
     * this mainMenu() method redirects the screen back to the main menu when the appropriate button
     * is clicked. it also closes the current screen for creating journal entries.
     */

    private void mainMenu() {
        getCreateJournalEntryStage().close();
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