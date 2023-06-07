import java.awt.Color;

/**
* This program is the beginning for OOP.
*
* @author Logan S
* @version 1.0
* @since 2023-05-22
*/

public class Main {
    /**
     * The main method of the program.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        // Creating the objects
        final Balloon balloon1 = new Balloon(78, 27, Color.GREEN, 1);
        final Balloon balloon2 = new Balloon(56, 23, Color.YELLOW, 2);
        final Spike spike = new Spike(30);

        // Proof all methods work
        System.out.println("Balloon 1 \nX Position: " + balloon1.xPosition
                + "\nY Position: " + balloon1.yPosition + "\nID: "
                + balloon1.id + "\nPopped? - " + balloon1.isPopped
                + "\nColor: " + balloon1.color);
        System.out.println("Balloon 2\nX Position: " + balloon2.xPosition
                + "\nY Position: " + balloon2.yPosition + "\nID: "
                + balloon2.id + "\nPopped? - " + balloon2.isPopped
                + "\nColor: " + balloon2.color);
        // using the methods to manipulate the first balloon
        balloon1.changeColor(Color.BLUE);
        balloon1.moveBalloon(6, 27);
        System.out.println(output(balloon1));
    }

    /**
     * Generates an output string based on the provided balloon.
     *
     * @param balloon the balloon object
     * @return the generated output string
     */
    public static String output(Balloon balloon) {
        return (balloon.isPopped) ? "Balloon" + balloon.id + " has popped!"
            : "New values for Ballon#" + balloon.id + "\nX Position: "
                + balloon.xPosition + "\nY Position: " + balloon.yPosition + "\nID: "
                + balloon.id + "\nPopped? - " + balloon.isPopped
                + "\nColor: " + balloon.color;
    }
}
