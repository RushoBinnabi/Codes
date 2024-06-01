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

public class JournalSystem extends Application {

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

    public Button getDeleteJournalEntriesButton() {
        return deleteJournalEntriesButton;
    }

    public Button getViewJournalEntriesButton() {
        return viewJournalEntriesButton;
    }

    public HBox getButtons() {
        return buttons;
    }

    public Button getReadJournalEntryButton() {
        return readJournalEntryButton;
    }

    public Button getOpenJournalEntryButton() {
        return openJournalEntryButton;
    }

    public Scene getJournalSystemScene() {
        return journalSystemScene;
    }

    public Stage getJournalSystemStage() {
        return journalSystemStage;
    }

    public void setJournalSystemScene(Scene journalSystemScene) {
        this.journalSystemScene = journalSystemScene;
    }

    public void setJournalSystemStage(Stage journalSystemStage) {
        this.journalSystemStage = journalSystemStage;
    }

    public CreateJournalEntry getCreateJournalEntry() {
        return createJournalEntry;
    }

    public ViewJournalEntries getViewJournalEntries() {
        return viewJournalEntries;
    }

    public ReadJournalEntry getReadJournalEntry() {
        return readJournalEntry;
    }

    public OpenJournalEntry getOpenJournalEntry() {
        return openJournalEntry;
    }

    public DeleteJournalEntry getDeleteJournalEntry() {
        return deleteJournalEntry;
    }

    public VBox getMainMenuPlacement() {
        return mainMenuPlacement;
    }

    public Label getMainMenuTitle() {
        return mainMenuTitle;
    }

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

    private void switchToCreateJournalEntryScreen() {
        getJournalSystemStage().close();
        getCreateJournalEntry().start(new Stage());
    }

    private void switchToReadJournalEntryScreen() {
        getJournalSystemStage().close();
        getReadJournalEntry().start(new Stage());
    }

    private void switchToViewJournalEntriesScreen() {
        getJournalSystemStage().close();
        getViewJournalEntries().start(new Stage());
    }

    private void switchToOpenJournalEntryScreen() {
        getJournalSystemStage().close();
        getOpenJournalEntry().start(new Stage());
    }

    private void switchToDeleteJournalEntryScreen() {
        getJournalSystemStage().close();
        getDeleteJournalEntry().start(new Stage());
    }

    public static void main(String[] args) {
        launch();
    }
}