package game;

import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

class Fire {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Fire(int x, int y) {
        this.x = x;
        this.y = y;




    }
}

public class Game extends JPanel implements KeyListener, ActionListener {
    private int passing_time=0;
    private int fired_bullet=0;

    private BufferedImage image;

    private ArrayList<Fire> fires=new ArrayList<Fire>();

    private int firedirY=1;

    private int ballX=0;

    private int balldirX=2;

    private int spaceShipX=0;

    private int dirSpaceX=20;


    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.red);
        g.fillOval(ballX,0,20,20);

        g.drawImage(image,spaceShipX,475,image.getWidth()/10,image.getHeight()/10,this);
    }

    @Override
    public void repaint() {
        super.repaint();
    }

    public Game(){
        try {
            image = ImageIO.read(new FileImageInputStream(new File("spaceship.png")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        setBackground(Color.BLACK);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
