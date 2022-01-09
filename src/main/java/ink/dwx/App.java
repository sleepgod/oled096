package ink.dwx;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.i2c.I2CBus;
import com.pi4j.io.i2c.I2CFactory;
import com.pi4j.wiringpi.I2C;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        try {
            GpioController gpio = GpioFactory.getInstance();
            I2CBus i2c = I2CFactory.getInstance(I2C.CHANNEL_1);
            Display display = new Display(128, 64, gpio, i2c, Constants.SSD1306_I2C_ADDRESS);
            display.begin();
            display.clearImage();
            display.displayString("学识野路子");
            display.displayImage();
            display.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
