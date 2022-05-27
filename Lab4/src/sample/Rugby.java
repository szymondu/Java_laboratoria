package sample;

import javafx.scene.transform.Affine;
import javafx.scene.transform.Rotate;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.Kulka;
import java.util.Random;

public class Rugby extends Kulka {

    protected double rx;
    protected double ry;
    protected double omega;
    protected double rot;

    public Rugby(double xPos, double yPos, double xSpeed, double ySpeed, double rx, double ry, double omega) {
        super(xPos, yPos, xSpeed, ySpeed);
        this.rx = rx;
        this.ry = ry;
        this.omega = omega;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.save();
        gc.setFill(color);
        gc.transform(new Affine(new Rotate(rot,xPos, yPos)));
        gc.fillOval(xPos - rx, yPos - ry, 2 * rx, 2 * ry);
        gc.restore();
    }
    public void update(){
        super.update();
        rot += omega;
        System.out.printf("rotation: %f\n", rot);
    }
}
