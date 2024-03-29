public class Spike {
    // creating the fields
    int positionX;
    public static final int positionY = 0;
    
    public Spike(int posX) {
        positionX = posX;
    }

    public void popBalloon(Balloon balloon) {
        if (balloon.xPosition == this.positionX && balloon.yPosition
            == positionY) {
            balloon.isPopped = true;
        }
    }

    public void moveSpike(int amount) {
        // Changing the x value of the spike
        this.positionX += amount;
    }
}
