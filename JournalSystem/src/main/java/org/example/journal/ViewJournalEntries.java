package org.example.journal;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewJournalEntries extends Application {

    private Scene viewJournalEntriesScene;
    private Stage viewJournalEntriesStage;
    private final Button backToMainMenu = new Button();
    private final GridPane viewJournalEntriesScreen = new GridPane();
    private String viewJournalEntriesNames;
    private final TextArea viewJournalEntries = new TextArea();
    private final Journal journal = new Journal();
    private final VBox vbox = new VBox();

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public GridPane getViewJournalEntriesScreen() {
        return viewJournalEntriesScreen;
    }

    public String getViewJournalEntriesNames() {
        return viewJournalEntriesNames;
    }

    public TextArea getViewJournalEntries() {
        return viewJournalEntries;
    }

    public void setViewJournalEntriesNames(String string) {
        viewJournalEntriesNames = string.concat(".txt");
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

    @Override
    public void start(Stage primaryStage) {
        setViewJournalEntriesStage(primaryStage);
        getViewJournalEntries().setEditable(false);
        getBackToMainMenu().setText("Back to Main Menu");
        getVbox().getChildren().addAll(getViewJournalEntries(), getBackToMainMenu());
        getVbox().setAlignment(Pos.CENTER);
        getVbox().setSpacing(18);
        getBackToMainMenu().setOnAction(e -> mainMenu());
        getViewJournalEntriesScreen().add(getVbox(), 0, 0);
        getViewJournalEntriesScreen().setAlignment(Pos.CENTER);
        setViewJournalEntriesScene(new Scene(getViewJournalEntriesScreen(), Journal.SCREEN_WIDTH,  Journal.SCREEN_HEIGHT));
        primaryStage.setScene(getViewJournalEntriesScene());
        getViewJournalEntriesStage().setTitle("Journal System - View Journal Entries");
        getViewJournalEntriesStage().show();
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
