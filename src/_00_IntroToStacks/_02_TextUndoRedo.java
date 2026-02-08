package _00_IntroToStacks;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;
public class _02_TextUndoRedo implements KeyListener {
    /* 
     * Create a JFrame with a JPanel and a JLabel.
     * 
     * Every time a key is pressed, add that character to the JLabel. It should
     * look like a basic text editor.
     * 
     * Make it so that every time the BACKSPACE key is pressed, the last
     * character is erased from the JLabel.
     * 
     * Save that deleted character onto a Stack of Characters.
     * 
     * Choose a key to be the Undo key. Make it so that when that key is
     * pressed, the top Character is popped  off the Stack and added back to
     * the JLabel.
     */
public static void main(String[] args) {
	_02_TextUndoRedo bob = new _02_TextUndoRedo();
	bob.run();
}
JFrame frame = new JFrame();
JLabel label = new JLabel();
String jeff = "";
Stack<Character> letters = new Stack<Character>();
Stack<Character> removed = new Stack<Character>();
void run () {
	frame.setVisible(true);
	frame.addKeyListener(this);
	frame.add(label);
	frame.pack();
}
@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	int pressed = arg0.getKeyCode();
	char pressedChar = arg0.getKeyChar();
	System.out.println(pressed);
	System.out.println(pressedChar);
	letters.push(pressedChar);
	String bob = ""+letters;
	label.setText(bob);
	if(pressed == 8) {
		char popped = letters.pop();
		removed.push(popped);
		label.setText(""+letters);
	}
	if(pressed ==48) {
		char popback = removed.pop();
		letters.push(popback);
		label.setText(""+letters);
	}
	
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
