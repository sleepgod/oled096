package ink.dwx;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;
import de.pi3g.pi.oled.Font;
import de.pi3g.pi.oled.OLEDDisplay;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        OLEDDisplay display = null;
        try {
            display = new OLEDDisplay();
            display.drawStringCentered("Hello World!", Font.FONT_5X8, 25, true);
            display.update();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Context pi4j = Pi4J.newAutoContext();
//        pi4j.i2c();

    }
}
