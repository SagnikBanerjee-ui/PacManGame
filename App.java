import javax.swing.JFrame;
public class App {
    public static void main(String[] args) {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = tileSize * columnCount;
        int boardHeight = tileSize * rowCount;

        JFrame frame = new JFrame("PacMan Game");
        frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null); //for the frame to be in the center of the screen 
        frame.setResizable(false); //so that the frame cannot be resized by the user
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit

        PacMan game = new PacMan();
        frame.add(game);
        frame.pack();
        frame.pack();
        game.requestFocus();
        frame.setVisible(true);

}
}