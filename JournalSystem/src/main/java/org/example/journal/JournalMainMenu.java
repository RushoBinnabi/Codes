/**
 * Name: Rusho Binnabi
 * Date: 6/1/2024
 * Project: Journaling System - Main Menu
 * Contact Information: RushoBinnabi123@yahoo.com
 */

package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JournalMainMenu extends Application {

    // this JournalSystem class creates a GUI using the JavaFX library
    // for displaying the main menu for the journaling system.

    private Scene journalSystemScene;
    private Stage journalSystemStage;
    private final CreateJournalEntry createJournalEntry = new CreateJournalEntry();
    private final  DeleteJournalEntry deleteJournalEntry = new DeleteJournalEntry();
    private final OpenJournalEntry openJournalEntry = new OpenJournalEntry();
    private final ReadJournalEntry readJournalEntry = new ReadJournalEntry();
    private final ViewJournalEntries viewJournalEntries = new ViewJournalEntries();
    private final StackPane mainMenuScreen = new StackPane();
    private final HBox buttons = new HBox(14); // sets the spacing to 14.
    private final Button createJournalEntryButton = new Button();
    private final Button viewJournalEntriesButton = new Button();
    private final Button deleteJournalEntriesButton = new Button();
    private final Button readJournalEntryButton = new Button();
    private final Button openJournalEntryButton = new Button();
    private final VBox mainMenuPlacement = new VBox();
    private final Label mainMenuTitle = new Label();

    /**
     * this getMainMenuScreen() method gets the stack pane that is the main menu screen.
     * @return the main menu screen.
     */

    public StackPane getMainMenuScreen() {
        return mainMenuScreen;
    }

    /**
     * this getCreateJournalEntryButton() method gets the button that will
     * redirect the screen to the menu for creating journal entries.
     * @return the button for creating journal entries.
     */

    public Button getCreateJournalEntryButton() {
        return createJournalEntryButton;
    }

    /**
     * this getDeleteJournalEntriesButton() method gets the button that will
     * redirect the screen to the manu for deleting journal entries.
     * @return the button for deleting journal entries.
     */

    public Button getDeleteJournalEntriesButton() {
        return deleteJournalEntriesButton;
    }

    /**
     * this getViewJournalEntriesButton() method gets the button that will
     * redirect the screen to the menu for deleting journal entries.
     * @return the button for viewing journal entries.
     */

    public Button getViewJournalEntriesButton() {
        return viewJournalEntriesButton;
    }

    /**
     * this getButton() method gets the hbox that has the buttons' layout.
     * @return the hbox that has the buttons' layout.
     */

    public HBox getButtons() {
        return buttons;
    }

    /**
     * this getReadJournalEntryButton() method gets the button that will
     * redirect the screen to the menu for reading journal entries.
     * @return the button for reading journal entries.
     */

    public Button getReadJournalEntryButton() {
        return readJournalEntryButton;
    }

    /**
     * this getOpenJournalEntryButton() method gets the button that will
     * redirect the screen to the menu for opening journal entries.
     * @return the button for opening journal entries.
     */

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
    }

    /**
     * this getJournalSystemScene() method gets the scene for the main menu of the journaling system.
     * @return the main menu for the journaling system.
     */

    public Scene getJournalSystemScene() {
        return journalSystemScene;
    }

    /**
     * this getJournalSystemStage() method gets the stage for the main menu of the journaling system.
     * @return the main menu of the journaling system.
     */

    public Stage getJournalSystemStage() {
        return journalSystemStage;
    }

    /**
     * this setJournalSystemScene() method sets the scene for the main menu of the journaling system.
     * @param journalSystemScene the scene for the main menu of the journaling system being set.
     */

    public void setJournalSystemScene(Scene journalSystemScene) {
        this.journalSystemScene = journalSystemScene;
    }

    /**
     * this setJournalSystemStage() method sets the stage for the main menu of the journaling system.
     * @param journalSystemStage the stage for the main menu of the journaling system being set.
     */

    public void setJournalSystemStage(Stage journalSystemStage) {
        this.journalSystemStage = journalSystemStage;
    }

    /**
     * this getCreateJournalEntry() method gets the CreateJournalEntry object.
     * @return the CreateJournalEntry object.
     */

    public CreateJournalEntry getCreateJournalEntry() {
        return createJournalEntry;
    }

    /**
     * this getViewJournalEntries() method gets the ViewJournalEntries object.
     * @return the ViewJournalEntries object.
     */

    public ViewJournalEntries getViewJournalEntries() {
        return viewJournalEntries;
    }

    /**
     * this getReadJournalEntry() method gets the ReadJournalEntry object.
     * @return the ReadJournalEntry object.
     */

    public ReadJournalEntry getReadJournalEntry() {
        return readJournalEntry;
    }

    /**
     * this getOpenJournalEntry() method gets the OpenJournalEntry object.
     * @return the OpenJournalEntry object.
     */

    public OpenJournalEntry getOpenJournalEntry() {
        return openJournalEntry;
    }

    /**
     * this getDeleteJournalEntry() method gets the DeleteJournalEntry object.
     * @return the DeleteJournalEntry object.
     */

    public DeleteJournalEntry getDeleteJournalEntry() {
        return deleteJournalEntry;
    }

    /**
     * this getMainMenuPlacement() method gets the vbox that has the layout for the label and buttons.
     * @return the vbox that has the layout for the label and buttons.
     */

    public VBox getMainMenuPlacement() {
        return mainMenuPlacement;
    }

    /**
     * this getMainMenuTitle() method gets the label for the main menu.
     * @return the label for the main menu.
     */

    public Label getMainMenuTitle() {
        return mainMenuTitle;
    }

    /**
     * this start() method contains everything for the main menu of the journaling system to function.
     * @param stage the stage that has everything for the main menu of the journaling system.
     */

    @Override
    public void start(Stage stage) {
        setJournalSystemStage(stage);
        getCreateJournalEntryButton().setText("Create Journal Entry");
        getViewJournalEntriesButton().setText("View Journal Entries");
        getDeleteJournalEntriesButton().setText("Delete Journal Entry");
        getOpenJournalEntryButton().setText("Open Journal Entry");
        getReadJournalEntryButton().setText("Read Journal Entry");
        getMainMenuTitle().setText("Select one of the following:");
        getMainMenuTitle().setScaleX(1.5);
        getMainMenuTitle().setScaleY(1.5);
        getButtons().getChildren().addAll(getCreateJournalEntryButton(), getReadJournalEntryButton(), getViewJournalEntriesButton(), getOpenJournalEntryButton(), getDeleteJournalEntriesButton());
        getButtons().setAlignment(Pos.CENTER);
        getMainMenuScreen().getChildren().add(getButtons());
        getMainMenuPlacement().getChildren().addAll(getMainMenuTitle(), getMainMenuScreen());
        getCreateJournalEntryButton().setOnAction(e -> switchToCreateJournalEntryScreen());
        getReadJournalEntryButton().setOnAction(e -> switchToReadJournalEntryScreen());
        getViewJournalEntriesButton().setOnAction(e -> switchToViewJournalEntriesScreen());
        getOpenJournalEntryButton().setOnAction(e -> switchToOpenJournalEntryScreen());
        getDeleteJournalEntriesButton().setOnAction(e -> switchToDeleteJournalEntryScreen());
        getMainMenuPlacement().setAlignment(Pos.CENTER);
        getMainMenuPlacement().setSpacing(20);
        setJournalSystemScene(new Scene(getMainMenuPlacement(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT));
        getJournalSystemStage().setTitle("Journal System - Welcome");
        getJournalSystemStage().setScene(getJournalSystemScene());
        getJournalSystemStage().show();
    }

    /**
     * this switchToCreateJournalEntryScreen() method switches the screen
     * to the menu for creating journal entries when the appropriate button
     * is clicked. it also closes the main menu.
     */

    private void switchToCreateJournalEntryScreen() {
        getJournalSystemStage().close();
        getCreateJournalEntry().start(new Stage());
    }

    /**
     * this switchToReadJournalEntryScreen() method switches the screen
     * to the menu for reading journal entries when the appropriate button
     * is clicked. it also closes the main menu.
     */

    private void switchToReadJournalEntryScreen() {
        getJournalSystemStage().close();
        getReadJournalEntry().start(new Stage());
    }

    /**
     * this switchToViewJournalEntriesScreen() method switches the screen
     * to the manu for viewing journal entries when the appropriate button
     * is clicked. it also closes the main menu.
     */

    private void switchToViewJournalEntriesScreen() {
        getJournalSystemStage().close();
        getViewJournalEntries().start(new Stage());
    }

    /**
     * this switchToOpenJournalEntryScreen() method switches the screen
     * to the menu for opening journal entries when the appropriate button
     * is clicked. it also closes the main menu.
     */

    private void switchToOpenJournalEntryScreen() {
        getJournalSystemStage().close();
        getOpenJournalEntry().start(new Stage());
    }

    /**
     * this switchToDeleteJournalEntryScreen() method switches the screen
     * to the menu for deleting journal entries when the appropriate button
     * is clicked. it also closes the main menu.
     */

    private void switchToDeleteJournalEntryScreen() {
        getJournalSystemStage().close();
        getDeleteJournalEntry().start(new Stage());
    }

    /**
     * this main() method runs the program.
     * @param args the program being run.
     */

    public static void main(String[] args) {
        launch();
    }
}