import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            BigFileBuilder.build("test.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            CsvSorting.sort("test.csv", "result.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
