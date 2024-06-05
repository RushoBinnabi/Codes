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

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public GridPane getViewJournalEntriesScreen() {
        return viewJournalEntriesScreen;
    }

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    public Journal getJournal() {
        return journal;
    }

    public VBox getVbox() {
        return vbox;
    }

    public Scene getViewJournalEntriesScene() {
        return viewJournalEntriesScene;
    }

    public Stage getViewJournalEntriesStage() {
        return viewJournalEntriesStage;
    }

    public void setViewJournalEntriesScene(Scene viewJournalEntriesScene) {
        this.viewJournalEntriesScene = viewJournalEntriesScene;
    }

    public void setViewJournalEntriesStage(Stage viewJournalEntriesStage) {
        this.viewJournalEntriesStage = viewJournalEntriesStage;
    }

    public ArrayList<String> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<String> files) {
        this.files = new ArrayList<>(files);
    }

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

    private void getEntries() {
        setFiles(getJournal().viewJournalEntries());
        if (getFiles().isEmpty()) {
            getViewJournalEntries().setText("No journal entries available");
        }
        else {
            getViewJournalEntries().setText(String.valueOf(getFiles()).replaceAll(",", "").replace('[', ' ').replaceAll("]", ""));
        }
    }

    private void mainMenu() {
        getViewJournalEntriesStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }

    public static void main(String[] args) {
        launch(args);
    }
}