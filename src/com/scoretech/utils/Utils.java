package com.scoretech.utils;

import static com.scoretech.diseños.UsuariosFrame.pnl_contenido;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import static javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN;
import javax.swing.UIManager;

public class Utils {
    public static void aplicarDiseño() {
        Color color4 =  new Color(191,220,221);
        
        UIManager.put("OptionPane.background",color4);
        UIManager.put("OptionPane.buttonFont", new Font("Monospaced", 0, 12));
        UIManager.put("OptionPane.messageFont", new Font("Monospaced", 0,12));
        UIManager.put("OptionPane.messageForeground", Color.BLACK);
        
        UIManager.put( "Component.focusWidth", 1 );
        UIManager.put( "Component.arrowType", "chevron" );
        UIManager.put( "TextComponent.arc", 15 );
        UIManager.put( "Button.arc", 15);
        
        UIManager.put("TabbedPane.selectedBackground", color4);
        UIManager.put("TabbedPane.selectedForeground", Color.BLACK);
    }
    
    public static void aplicarIcono(JFrame frame) {
       frame.setIconImage(
       new ImageIcon(frame.getClass().
            getResource("/resource/icon_scoretech.png"))
            .getImage());
    }
    
    public static Icon getIcon(String image) {
        return new ImageIcon(
                new ImageIcon(
                        Utils.class.getResource("/resource/" + image + ".png"))
                        .getImage());
    }
    
    public static Icon getIcon(String image, int w, int h) {
        return new ImageIcon(
                new ImageIcon(
                        Utils.class.getResource("/resource/" + image + ".png"))
                        .getImage().getScaledInstance(w, h, Image.SCALE_SMOOTH));
    }
    
    public static void mostrarAvisoError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(
                null, 
                mensaje, 
                titulo, 
                0,
                getIcon("img_icon_error"));
    }
    
    public static void mostrarAviso(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(
                null, 
                mensaje, 
                titulo, 
                JOptionPane.DEFAULT_OPTION);
    }
    
    public static void mostrarContenidoEnPanel(JPanel panel) {
        pnl_contenido.setLayout(new BorderLayout(HEIGHT, WIDTH));
        pnl_contenido.setSize(WIDTH, HEIGHT);
        
        pnl_contenido.removeAll();
        pnl_contenido.add(panel);
        pnl_contenido.revalidate();
        pnl_contenido.repaint();
    }
    
    public static void ajustarPantallas(JFrame frame, JFrame frame2) {
        frame.setSize(frame2.getWidth(), frame2.getHeight());
        frame.setLocation(frame2.getLocation());
        if (frame2.getExtendedState() > 1) {
            frame.setExtendedState(MAXIMIZED_BOTH);
        }
    }
    
    public static void aplicarDiseñoTabla(JTable tabla) {
        tabla.setBackground(new Color(252,248,248));
        tabla.setFont(new Font("Monospaced", 0, 12));
        tabla.setForeground(Color.BLACK);
        tabla.setAutoResizeMode(AUTO_RESIZE_LAST_COLUMN);
        tabla.setGridColor(new Color(113, 114, 114));
        tabla.setRequestFocusEnabled(false);
        tabla.setSelectionBackground(new Color(145,234,228));
        tabla.setSelectionForeground(new Color(0,0,0));
        tabla.setShowHorizontalLines(false);
        for (int i = 0;i<tabla.getColumnModel().getColumnCount(); i++) {
            tabla.getColumnModel().getColumn(i).setHeaderRenderer(new CustomHeader());
        }
    }
}
