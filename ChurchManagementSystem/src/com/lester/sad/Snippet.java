/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lester.sad;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author user
 */
public class Snippet {
    
    public static void main(String[] args) throws IOException {
        JFrame test = new JFrame("Google Maps");

        try {
            String imageUrl = "https://www.google.com.ph/maps/place/St.+James+Parish+Church/@14.8857901,120.8605672,17z/data=!4m2!3m1!1s0x0:0x689cc5a1353e962f";
            String destinationFile = "image.jpg";
            String str = destinationFile;
            URL url = new URL(imageUrl);
            InputStream is = url.openStream();
            OutputStream os = new FileOutputStream(destinationFile);

            byte[] b = new byte[2048];
            int length;

            while ((length = is.read(b)) != -1) {
                os.write(b, 0, length);
            }

            is.close();
            os.close();
        } catch (IOException e) {
            System.out.print(e);
            e.printStackTrace();
          
        }

        test.add(new JLabel(new ImageIcon((new ImageIcon("image.jpg")).getImage().getScaledInstance(630, 600,
                java.awt.Image.SCALE_SMOOTH))));

        test.setVisible(true);
        test.pack();

    }
}

    
    
    

