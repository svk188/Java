package pr8;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class pr8_3 {
        private static final int width = 1600;
        private static final int height = 900;

        public static void main(String[] arguments) throws IOException {
            String path = "C:/Users/pypki/IdeaProjects/pr9/src/pr8/";
            BufferedImage[] images = new BufferedImage[2];
            images[0] = ImageIO.read(new File(path + "kit.jpg"));
            images[1] = ImageIO.read(new File(path + "s1200-4.jpg.jpg"));
            JLabel label = new JLabel(new ImageIcon(images[0]));
            JFrame frame = new JFrame();
            frame.setSize(width, height);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            frame.add(label);
            for(int i = 0; i < 10; i++) {
                label.setIcon(new ImageIcon(images[i%2]));
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    break;
                }

            }
        }
    }
