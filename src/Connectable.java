/**
 * 
 */
package src/edu/rpi/csci2600/gildem4/TicTacToeApp.java


import java.io.IOException;

/**
 * @author gildem4
 *
 */
public interface Connectable {
	public void connect() throws IOException;
	public void send(String message);	
	public String receive();
	public int getPort();
}