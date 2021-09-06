package bloom.task;

public class ToDo extends Task {

    /**
     * Constructor for a ToDo.
     *
     * @param description the description of the to-do
     */
    public ToDo(String description) {
        super(description);
    }

    /**
     * Gets the string representation of the to-do.
     *
     * @return a string representing the to-do
     */
    @Override
    public String toString() {
        return "[T]" + super.toString();
    }

    /**
     * Converts to the format used for database storage.
     *
     * @return a string representing the to-do
     */
    @Override
    public String toDb() {
        return "T | " + super.toDb();
    }
}
