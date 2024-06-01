package org.example.journal;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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

    public Button getCreateJournalEntry() {
        return createJournalEntry;
    }

    public Button getBackToMainMenu() {
        return backToMainMenu;
    }

    public Label getCreateJournalEntryLabel() {
        return createJournalEntryLabel;
    }

    public TextArea getCreateJournalEntryInput() {
        return createJournalEntryInput;
    }

    public GridPane getCreateJournalEntryScreen() {
        return createJournalEntryScreen;
    }

    public HBox getCreateJournalEntryInputHBox() {
        return createJournalEntryInputHBox;
    }

    public HBox getCreateJournalEntryButtonsHBox() {
        return createJournalEntryButtonsHBox;
    }

    public Label getCreateJournalEntryConfirmation() {
        return createJournalEntryConfirmation;
    }

    public TextField getCreateJournalEntryFilenameInput() {
        return createJournalEntryFilenameInput;
    }

    public Label getCreateJournalEntryFilenameLabel() {
        return createJournalEntryFilenameLabel;
    }

    public HBox getCreateJournalEntryFilenameHBox() {
        return createJournalEntryFilenameHBox;
    }

    public VBox getCreateJournalEntryFilenameVBox() {
        return createJournalEntryFilenameVBox;
    }

    public Stage getCreateJournalEntryStage() {
        return createJournalEntryStage;
    }

    public Scene getCreateJournalEntryScene() {
        return createJournalEntryScene;
    }

    public void setCreateJournalEntryStage(Stage createJournalEntryStage) {
        this.createJournalEntryStage = createJournalEntryStage;
    }

    public void setCreateJournalEntryScene(Scene createJournalEntryScene) {
        this.createJournalEntryScene = createJournalEntryScene;
    }

    @Override
    public void start(Stage primaryStage) {
        setCreateJournalEntryStage(primaryStage);
        getCreateJournalEntryLabel().setText("Enter Text: ");
        getBackToMainMenu().setText("Back to Main Menu");
        getCreateJournalEntry().setText("Create Journal Entry");
        getCreateJournalEntryFilenameLabel().setText("Enter filename:");
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
        getCreateJournalEntryButtonsHBox().setSpacing(8);
        getCreateJournalEntryButtonsHBox().setAlignment(Pos.CENTER);
        getCreateJournalEntryScreen().setVgap(14);
        getCreateJournalEntryScreen().setAlignment(Pos.CENTER);
        getBackToMainMenu().setOnAction(actionEvent -> mainMenu());
        setCreateJournalEntryScene(new Scene(getCreateJournalEntryScreen(), Journal.SCREEN_WIDTH, Journal.SCREEN_HEIGHT));
        getCreateJournalEntryStage().setScene(getCreateJournalEntryScene());
        getCreateJournalEntryStage().setTitle("Journal System - Create Journal Entry");
        getCreateJournalEntryStage().show();
    }

    private void mainMenu() {
        getCreateJournalEntryStage().close();
        JournalMainMenu journalMainMenu = new JournalMainMenu();
        journalMainMenu.start(new Stage());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
