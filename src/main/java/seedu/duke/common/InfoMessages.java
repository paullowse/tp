package seedu.duke.common;

/**
 * Provides enum variables for storing custom program information messages.
 */
public enum InfoMessages {
    INFO_DIVIDER("____________________________________________________________"),
    INFO_ADD_EXPENSE("I have added the following Expense transaction:"),
    INFO_ADD_INCOME("I have added the following Income transaction:"),
    INFO_DELETE("I have deleted the following transaction:"),
    INFO_EXIT("Goodbye and see you soon."),
    INFO_GET_CATEGORIES("Here are the total savings for each category:"),
    INFO_GREET("Hello! I'm Moo and I will help you to manage your finances."),
    INFO_HELP_GREET("Gotcha! Here are the commands that you may use:"),
    INFO_HELP_PROMPT("Enter <help> if you need the list of commands."),
    INFO_LIST("Here are your transaction records:"),
    INFO_LIST_EMPTY("There are no transaction records found."),
    INFO_LIST_FILTERED("Here are the transaction records that match your search expression:"),
    INFO_LIST_UNFILTERED("There are no transaction records that match your search expression."),
    INFO_PURGE("All your transactions have been purged."),
    INFO_PURGE_ABORT("Purging has been aborted. All transactions records are retained."),
    INFO_PURGE_WARNING("Are you sure you want to proceed with this command? Please enter 'Y' to confirm.");

    public final String message;

    /**
     * Instantiates a new information message when user initialises a new instance of this enum.
     *
     * @param message A string containing the message.
     */
    InfoMessages(String message) {
        this.message = message;
    }

    /**
     * Gets the information message as a string.
     *
     * @return A string containing the message.
     */
    public String toString() {
        return message;
    }
}