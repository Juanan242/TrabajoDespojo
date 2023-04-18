/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imagenes;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Alejandro
 */
public class Icon extends javax.swing.JLabel{

    private int x, y;
    
    public Icon(JPanel panel) {
        this.x = this.getWidth();
        this.y = this.getHeight();
        this.setSize(x, y);
    }
    
    public void paint(Graphics g){
        ImageIcon img = new ImageIcon(getClass().getResource("/icons/nubeNormal.png"));
        g.drawImage(img.getImage(), 0, 0, x, y,null);
    }
}
