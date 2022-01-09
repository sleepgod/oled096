package ink.dwx;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            GpioController gpio = GpioFactory.getInstance();
            I2CBus i2c = I2CFactory.getInstance(1);
            Display display = new Display(13, 6, gpio, i2c, 0x3c);
            display.data(10);
            display.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
