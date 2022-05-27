package sample;
import java.util.Random;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Kulka {
    private static final double R = 10;
    private double ySpeed;
    private double xSpeed;
    private double xPos;
    private double yPos;

    Kulka (double xPos, double yPos, double xSpeed, double ySpeed){
        this.xPos = xPos;
        this.yPos = yPos;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void checkBinaryCollision(double xLeft, double yTop, double xRight, double yBottom){
        if ((xPos - R <= xLeft) || (xPos + R >= xRight)){
            xSpeed =-xSpeed;
        }
        if ((yPos - R <= xLeft) || (yPos + R >= xRight)){
            ySpeed =-ySpeed;
        }
    }
    public void draw(GraphicsContext gc){
        gc.setFill(Color.WHITESMOKE);
        gc.fillOval(xPos - R, yPos - R, 2 * R, 2 * R);
    }
    public void update(){
        xPos += xSpeed;
        yPos += ySpeed;
    }
}
