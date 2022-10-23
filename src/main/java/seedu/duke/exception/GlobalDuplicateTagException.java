package seedu.duke.exception;

//@@author wcwy
import seedu.duke.common.ErrorMessages;

public class GlobalDuplicateTagException extends MoolahException {
    /**
     * Returns the error message of the exception to alert user of the exception.
     *
     * @return A string containing the error message
     */
    @Override
    public String getMessage() {
        return ErrorMessages.ERROR_GLOBAL_DUPLICATE_TAG.toString();
    }
}
