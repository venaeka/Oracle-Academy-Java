
import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {

    Font font;
    Color blackColor;
    Color grayColor;
    Color backgroundColor;

    public void init() {

        font = new Font("Arial", Font.ITALIC, 18);

        blackColor = Color.BLACK;
        grayColor = Color.GRAY;
        backgroundColor = Color.WHITE;

        setBackground(backgroundColor);
    }

    public void paint(Graphics graph) {

        graph.setFont(font);
        graph.drawString("Draw Shapes", 90, 20);

        // Persegi hitam
        graph.setColor(blackColor);
        graph.drawRect(120, 120, 120, 120);

        // Persegi putih
        graph.setColor(Color.WHITE);
        graph.fillRect(115, 115, 90, 90);

        // Lingkaran abu-abu
        graph.setColor(grayColor);
        graph.fillArc(110, 110, 50, 50, 0, 360);

        // Persegi hitam
        graph.setColor(blackColor);
        graph.drawRect(50, 50, 50, 50);

        // Persegi abu-abu
        graph.setColor(grayColor);
        graph.fillRect(50, 50, 60, 60);
    }
}
