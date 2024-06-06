/**
 * Name: Rusho Binnabi
 * Date: 6/5/2024
 * Project: Journaling System - ViewJournalEntries
 * Contact Information: RushoBinnabi123@yahoo.com
 */

package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ViewJournalEntries extends Application {

    // this ViewJournalEntries file has the menu for viewing journal entries.

    private Scene viewJournalEntriesScene;
    private Stage viewJournalEntriesStage;
    private final Button backToMainMenu = new Button();
    private final GridPane viewJournalEntriesScreen = new GridPane();
    private final TextArea viewJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final VBox vbox = new VBox();
    private ArrayList<String> files;

    /**
     * this getBackToMainMenu() method gets the Button object for the main menu.
     * @return the Button object for the main menu.
     */

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    /**
     * this getViewJournalEntriesScreen() method gets the GridPane object that has the screen for the menu.
     * @return the GridPane object that has the screen for the menu.
     */

    public GridPane getViewJournalEntriesScreen() {
        return viewJournalEntriesScreen;
    }

    /**
     * this getViewJournalEntries() method gets the TextArea object that shows the list of journal entries.
     * @return the TextArea that shows the list of journal entries.
     */

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    /**
     * this getJournal() method gets the Journal object that has the functionality for the journaling system.
     * @return the Journal object that has the functionality for the journaling system.
     */

    public Journal getJournal() {
        return journal;
    }

    /**
     * this getVbox() method gets the VBox object that has everything arranged for the menu.
     * @return the VBox object that has everything arranged for the menu.
     */

    public VBox getVbox() {
        return vbox;
    }

    /**
     * this getViewJournalEntriesScreen() method gets the Scene object for the menu.
     * @return the Scene object for the menu.
     */

    public Scene getViewJournalEntriesScene() {
        return viewJournalEntriesScene;
    }

    /**
     * this getViewJournalEntriesStage() method gets the Stage object for the menu.
     * @return the Stage object for the menu.
     */

    public Stage getViewJournalEntriesStage() {
        return viewJournalEntriesStage;
    }

    /**
     * this setViewJournalEntriesScene() method sets the Scene for the menu.
     * @param viewJournalEntriesScene the Scene for the menu being set.
     */

    public void setViewJournalEntriesScene(Scene viewJournalEntriesScene) {
        this.viewJournalEntriesScene = viewJournalEntriesScene;
    }

    /**
     * this setViewJournalEntriesStage() method sets the Stage for the menu.
     * @param viewJournalEntriesStage the Stage for the menu being set.
     */

    public void setViewJournalEntriesStage(Stage viewJournalEntriesStage) {
        this.viewJournalEntriesStage = viewJournalEntriesStage;
    }

    /**
     * this getFiles() method gets the ArrayList of files for the journal entries.
     * @return the ArrayList of files for the journal entries.
     */

    public ArrayList<String> getFiles() {
        return files;
    }

    /**
     * this setFiles() method sets the ArrayList of files to a new ArrayList of files for the journal entries.
     * @param files the ArrayList of files for the journal entries being set.
     */

    public void setFiles(ArrayList<String> files) {
        this.files = new ArrayList<>(files);
    }

    /**
     * this stage() method has everything needed for the menu for viewing journal entries.
     * @param primaryStage the stage for the menu for viewing journal entries.
     */

    @Override
    public void start(Stage primaryStage) {
        setViewJournalEntriesStage(primaryStage);
        getViewJournalEntries().setEditable(false);
        getBackToMainMenu().setText("Back to Main Menu");
        getVbox().getChildren().addAll(getViewJournalEntries(), getBackToMainMenu());
        getVbox().setAlignment(Pos.CENTER);
        getVbox().setSpacing(50);
        getBackToMainMenu().setOnAction(e -> mainMenu());
        getViewJournalEntriesScreen().add(getVbox(), 0, 0);
        getViewJournalEntriesScreen().setAlignment(Pos.CENTER);
        getViewJournalEntries().setScaleX(1.3);
        getViewJournalEntries().setScaleY(1.3);
        getEntries();
        setViewJournalEntriesScene(new Scene(getViewJournalEntriesScreen(), Journal.SCREEN_WIDTH,  Journal.SCREEN_HEIGHT));
        getViewJournalEntriesStage().setScene(getViewJournalEntriesScene());
        getViewJournalEntriesStage().setTitle("Journal System - View Journal Entries");
        getViewJournalEntriesStage().show();
    }

    /**
     * this getEntries() method gets the list of journal entries that can be viewed.
     */

    private void getEntries() {
        setFiles(getJournal().viewJournalEntries());
        if (getFiles().isEmpty()) {
            getViewJournalEntries().setText("No journal entries available");
        }
        else {
            getViewJournalEntries().setText(String.valueOf(getFiles()).replaceAll(",", "").replace('[', ' ').replaceAll("]", ""));
        }
    }

    /**
     * this mainMenu() method redirects the screen to the main menu when the appropriate button is clicked.
     * it also closes the screen for viewing journal entries.
     */

    private void mainMenu() {
        getViewJournalEntriesStage().close();
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