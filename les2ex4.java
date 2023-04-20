import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.*;
import java.util.logging.SimpleFormatter;

public class les2ex4 {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(les2ex4.class.getName());
        FileHandler fh = new FileHandler("my_log.txt");

        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);

        Scanner my_sc = new Scanner(System.in);
        System.out.print("Введите битовое число: ");
        byte my_byte = my_sc.nextByte();
        logger.setLevel(Level.INFO);
        logger.log(Level.INFO, String.format("Byte from console: " + my_byte));
        try (FileOutputStream fos = new FileOutputStream("result.txt")) {
            fos.write(my_byte);
            System.out.println("Файл записан!");
            logger.setLevel(Level.INFO);
            logger.log(Level.INFO, String.format("Written to result.txt: " + my_byte));
        } catch (IOException e) {
            System.out.println("IOException");
            logger.setLevel(Level.INFO);
            logger.log(Level.INFO, String.format("IOException = " + e));
        }
    }
}
