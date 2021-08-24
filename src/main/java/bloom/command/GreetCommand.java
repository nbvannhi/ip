package bloom.command;

import bloom.constant.Drawing;
import bloom.constant.Message;

/**
 * Represents a start command which starts running the bot.
 * This command is automatically called whenever the bot is started.
 */

public class GreetCommand extends Command {

	/**
	 * Starts the bot and greets users.
	 */
	
	public void run() {
		System.out.println(Drawing.LOGO.getDrawing());
		System.out.println(Message.COMMAND_GREET.getMessage());
	}
}
