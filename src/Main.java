import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class Main extends Canvas{

    public void paint(Graphics g){
        setBackground(Color.white);
        //Прямоугольник
        g.fillRect(200, 50, 200, 500);
        //Левые треугольники
        g.fillPolygon(new int[]{190, 190, 90}, new int[]{200, 100, 100}, 3);
        g.fillPolygon(new int[]{190, 190, 90}, new int[]{350, 250, 250}, 3);
        g.fillPolygon(new int[]{190, 190, 90}, new int[]{500, 400, 400}, 3);
        //Правые треугольники
        g.fillPolygon(new int[]{410, 410, 510}, new int[]{100, 200, 100}, 3);
        g.fillPolygon(new int[]{410, 410, 510}, new int[]{250, 350, 250}, 3);
        g.fillPolygon(new int[]{410, 410, 510}, new int[]{400, 500, 400}, 3);
        //Нижний квадрат
        g.fillRect(260, 560, 80, 100);
        //Штука сверху
        g.fillArc(240, 15, 125, 60, 0, 180);
        //Круги
        g.setColor(Color.red);
        g.fillOval(240, 65, 125, 125);
        g.setColor(Color.yellow);
        g.fillOval(240, 225, 125, 125);
        g.setColor(Color.green);
        g.fillOval(240, 385, 125, 125);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Окно");

        frame.add(new Main());

        frame.setPreferredSize(new Dimension(720, 720));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();

        frame.setVisible(true);


    }
}