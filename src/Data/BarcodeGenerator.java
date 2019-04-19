package Data;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Alejandro
 */
public class BarcodeGenerator {

    BufferedImage image;

    public Icon visualize(String code) {
        Barcode barcode = null;

        try {
            barcode = BarcodeFactory.createEAN13(code);
            barcode.setDrawingText(false);
            barcode.setBarWidth(2);
            barcode.setBarHeight(60);
            image = new BufferedImage(300, 100, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g = (Graphics2D) image.getGraphics();
            barcode.draw(g, 5, 20);
        } catch (BarcodeException | OutputException ex) {
            System.out.println(ex.getMessage());
        }

        return new ImageIcon(image);
    }

    public boolean checkCode(String code) {
        if (code.isEmpty() || code.length() != 12) {
            JOptionPane.showMessageDialog(null, "El còdigo debe contener 12 dìgitos", "Error", JOptionPane.INFORMATION_MESSAGE);
            return false;
        }
        return true;
    }

}
