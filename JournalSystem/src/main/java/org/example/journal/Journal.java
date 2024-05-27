/**
 * Name: Rusho Binnabi
 * Date: 5/23/2024
 * Project: JournalSystem - Journal
 * Contact Information: RushoBinnabi123@yahoo.com
 */

package org.example.journal;

import java.io.*;
import java.util.ArrayList;

public class Journal {

    // this Journal file has the name and the functionality of the journal files that will be used for the journal entries.

    private String journalEntryName;
    private File fileHandler;
    private FileReader fileReader;
    private FileWriter fileWriter;
    private String errorMessage;
    private String readJournalEntry;
    private final ArrayList<String> listOfFiles = new ArrayList<>();


    /**
     * empty Journal Constructor.
     */

    public Journal() {

    }

    /**
     * this getJournalEntryName() method gets the name of the journal entry.
     * @return the name of the journal entry.
     */

    public String getJournalEntryName() {
        return journalEntryName;
    }

    /**
     * this setJournalEntryName() method sets the name of the journal entry.
     * @param journalEntryName the name of the journal entry being set.
     */

    public void setJournalEntryName(String journalEntryName) {
        this.journalEntryName = journalEntryName.concat(".txt"); // adds a text file extension so that users won't have to.
    }

    /**
     * this getFileHandler() method gets the file handler that handles the journal entries.
     * @return the file handler.
     */

    public File getFileHandler() {
        return fileHandler;
    }

    /**
     * this setFileHandler() method sets the file handler for the journal entries.
     * @param fileHandler the journal entry files being set for the file handler.
     */

    public void setFileHandler(File fileHandler) {
        this.fileHandler = fileHandler;
    }

    /**
     * this getFileReader() method gets the file reader for reading the journal entries.
     * @return the file reader.
     */

    public FileReader getFileReader() {
        return fileReader;
    }

    /**
     * this setFileReader() method sets the file reader for reading the journal entries.
     * @param fileReader the file reader being set.
     */

    public void setFileReader(FileReader fileReader) {
        this.fileReader = fileReader;
    }

    /**
     * this getFileWriter() method gets the file writer for writing the journal entries.
     * @return the file writer.
     */

    public FileWriter getFileWriter() {
        return fileWriter;
    }

    /**
     * this setFileWriter() method sets the file writer for writing the journal entries.
     * @param fileWriter the file writer being set.
     */

    public void setFileWriter(FileWriter fileWriter) {
        this.fileWriter = fileWriter;
    }

    /**
     * this getErrorMessage() method gets the error message if anything goes wrong with creating a journal entry.
     * @return the error message.
     */

    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * this setErrorMessage() method sets the error message if anything goes wrong with creating a journal entry.
     * @param errorMessage the error message being set.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * this getReadJournalEntry() method gets the text that was read from the journal entry.
     * @return the text that was read from the journal entry.
     */

    public String getReadJournalEntry() {
        return readJournalEntry;
    }

    /**
     * this setReadJournalEntry() method sets the text that was read from the journal entry.
     * @param readJournalEntry the text that was read from the journal entry being set.
     */

    public void setReadJournalEntry(String readJournalEntry) {
        this.readJournalEntry += readJournalEntry;
    }

    /**
     * this getListOfFiles() method gets the arraylist of files.
     * @return the arraylist of files.
     */

    public ArrayList<String> getListOfFiles() {
        return listOfFiles;
    }

    /**
     * this createJournalEntry() method creates a journal entry.
     * @param name the name of the journal entry.
     * @param contents the contents that will be written to the journal entry.
     * @return the name of the journal entry that had contents written to it.
     */

    public String createJournalEntry(String name, String contents) {
        setJournalEntryName(name);
        try {
            setFileHandler(new File(getJournalEntryName()));
            setFileWriter(new FileWriter(getFileHandler()));
            getFileWriter().write(contents);
            getFileWriter().close();
        }
        catch (Exception e) {
            setErrorMessage("Error. The journal entry could not be created.");
            return getErrorMessage();
        }
        return getJournalEntryName();
    }

    /**
     * this readJournalEntry() method reads a journal entry.
     * @param name the name of the journal entry.
     * @return what was read from the journal entry.
     */

    public String readJournalEntry(String name) {
        setJournalEntryName(name);
        try {
            setFileHandler(new File(getJournalEntryName()));
            setFileReader(new FileReader(getFileHandler()));
            while (getFileReader().read() != -1) {
                // To-Do: add this functionality.
            }
        }
        catch (Exception e) {
            setErrorMessage("Error. The journal entry could not be read.");
            return getErrorMessage();
        }
        return getReadJournalEntry();
    }

    /**
     * this viewJournalEntries() method views the journal entries.
     * @return the list of journal entries.
     */

    public ArrayList<String> viewJournalEntries() {
        try {
            setFileHandler(new File(System.getProperty("user.dir")));
            File[] files = getFileHandler().listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.getName().endsWith(".txt")) {
                        getListOfFiles().add(file.getName());
                    }
                }
            }
        }
        catch (Exception e) {
            setErrorMessage("Error. The journal entries could not be viewed.");
            // To-Do: try to make sure the error message gets returned if something goes wrong.
        }
        return getListOfFiles();
    }
}
