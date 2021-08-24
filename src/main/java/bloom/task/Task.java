package bloom.task;

/**
 * Represents a general task.
 */

public class Task {

  /** The description of the task. */
  protected final String description;
  
  /** The status of the task. */
  protected boolean isDone;

  /**
   * Constructor for a Task.
   * 
   * @param description the description of the task
   */
  
  public Task(String description) {
    this.description = description;
    this.isDone = false;
  }

  /**
   * Gets the string representation of the task.
   *
   * @return a string representing the task
   */

  @Override
  public String toString() {
    return "[" + this.getStatusIcon() + "] " + this.description;
  }

  /**
   * Converts to the format used for database storage.
   *
   * @return a string representing the task
   */

  public String toDb() {
    return (this.isDone ? 1 : 0) + " | " + this.description;
  }

  /**
   * Gets the status icon of the task.
   * 
   * @return X if the task is done and a space otherwise
   */

  public String getStatusIcon() {
    return (this.isDone ? "X" : " ");
  }

  /**
   * Marks a task as done. 
   */
  
  public void markAsDone() {
    this.isDone = true;
  }
}
