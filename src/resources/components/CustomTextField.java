package resources.components;

import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.FontMetrics;

public class CustomTextField extends JTextField {
    private int arcWidth;
    private int arcHeight;
    private Color borderColor;
    private String hint;
    private int hintMarginLeft;

    public CustomTextField(int columns, int arcWidth, int arcHeight, Color borderColor, String hint, int hintMarginLeft) {
        super(columns);
        this.arcWidth = arcWidth;
        this.arcHeight = arcHeight;
        this.borderColor = borderColor;
        this.hint = hint;
        this.hintMarginLeft = hintMarginLeft;
        setOpaque(false); // Make the text field transparent

        // Add a focus listener to repaint on focus gain/loss
        this.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                repaint();
            }

            @Override
            public void focusLost(FocusEvent e) {
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(getBackground());
        g2.fill(new RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), arcWidth, arcHeight));
        super.paintComponent(g2); // Make sure to call this to enable text input

        // Draw the hint if needed
        if (getText().isEmpty() && !hasFocus()) {
            FontMetrics fontMetrics = g2.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(hint);
            int textHeight = fontMetrics.getAscent();
            int textX = hintMarginLeft;
            int textY = (getHeight() + textHeight) / 2 - 2; // Center text vertically

            // Set hint text color and draw it
            g2.setColor(getDisabledTextColor());
            g2.drawString(hint, textX, textY);
        }

        g2.dispose();
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(borderColor);
        g2.draw(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight));
        g2.dispose();
    }
}
