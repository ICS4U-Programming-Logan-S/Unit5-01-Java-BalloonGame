import java.awt.Color;

/**
 * The Balloon class represents a balloon object with position, color, and
 * state information.
 */
public class Balloon {
    // Creating the fields
    int xPosition;
    int yPosition;
    Color color;
    boolean isPopped;
    int id;

    /**
     * Constructs a Balloon object with the specified position, color, and ID.
     *
     * @param xPos        the x-coordinate of the balloon's position
     * @param yPos        the y-coordinate of the balloon's position
     * @param prncplColor the principal color of the balloon
     * @param idMain      the ID of the balloon
     */
    public Balloon(int xPos, int yPos, Color prncplColor, int idMain) {
        // Setting the values of the fields
        xPosition = xPos;
        yPosition = yPos;
        color = prncplColor;
        isPopped = false;
        id = idMain;
    }

    /**
     * Changes the color of the balloon.
     *
     * @param newColor the new color to set for the balloon
     */
    public void changeColor(Color newColor) {
        // Change current color
        this.color = newColor;
    }

    /**
     * Moves the balloon by the specified amount in the x and y directions.
     *
     * @param xChange the amount to change the x-coordinate of the balloon's
     *          position
     * @param yChange the amount to change the y-coordinate of the balloon's
     *          position
     */
    public void moveBalloon(int xChange, int yChange) {
        // Change current values
        this.xPosition += xChange;
        this.yPosition += yChange;
    }
}
