package com.scoretech.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class CustomHeader extends DefaultTableCellRenderer {
   
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        setHorizontalAlignment(JLabel.CENTER);
        
        component.setBackground(new Color(0,170,182));
        component.setForeground(Color.BLACK);
        component.setSize(30, component.getWidth());
        component.setPreferredSize(new Dimension(6, component.getWidth()));

        return component;
    }
}
