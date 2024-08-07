import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth = 360;
        int boardHeight = 640; //units is Pixels (360 x 640)px

        JFrame frame = new JFrame("Flappy Bird");
        // frame.setVisible(true);
        frame.setSize(boardWidth, boardHeight); //size of the frame
        frame.setLocationRelativeTo(null); //place the window at the centre of the screen.
        frame.setResizable(false); //user cannot resize the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //when user clicks on the 'X' button on the program it will close the game.

        FlappyBird flappyBird = new FlappyBird(); //instance of Flappy Bird class
        frame.add(flappyBird); //adding the flappy bird class to our frame
        frame.pack(); //it ensures that the dimension of the game would be 360x640px without including the title bar.
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}
