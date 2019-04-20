package Data;

import com.onbarcode.barcode.ISBN;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Alejandro, Molano, Manuel
 * @version Pro
 * @since 20/04/2019
 */
public class BarcodeGenerator {

    private BufferedImage image;
    private Barcode barcode;

    /**
     * Dibuja el código EAN13.
     * @param code.
     * @return icon.
     */
    public Icon visualizeEAN13(String code) {
        barcode = null;
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

    /**
     * Dibuja el código ISBN13.
     * @param code.
     * @return icon.
     */
    public Icon visualizeISBN13(String code) {
        try {
            ISBN cod = new ISBN();
            cod.setData(code);
            cod.setShowText(false);
            cod.setBarcodeHeight(60);
            cod.setBarcodeWidth(2);
            cod.setX(2);
            cod.setY(60);
            image = cod.drawBarcode();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ImageIcon(image);
    }

    /**
     * Reproduce música constantemente de manera infinita.
     */
    public void playMusic() {
        try {
            Clip sound = AudioSystem.getClip();
            sound.open(AudioSystem.getAudioInputStream(getClass().getResourceAsStream("/Music/Bebob_Tank!.wav")));
            sound.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {

        }
    }

}
