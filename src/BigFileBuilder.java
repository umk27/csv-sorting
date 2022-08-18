import java.io.FileWriter;
import java.io.IOException;

public class BigFileBuilder {

    public static void build(String file) throws IOException {

        FileWriter fileWriter = new FileWriter(file);

        for (int i = 0; i < 1000; i++) {
            fileWriter.write("7,Василий,программист,Москва" + System.lineSeparator());
            fileWriter.write("9,Иван,инженер,Санкт-Петербург" + System.lineSeparator());
            fileWriter.write("7,Илья,инженер,Саратов" + System.lineSeparator());
            fileWriter.write("3,Сергей,менеджер,Новгород" + System.lineSeparator());
            fileWriter.write("12,Александр,программист,Санкт-Петербург" + System.lineSeparator());
            fileWriter.write("7,Игорь,программист,Москва" + System.lineSeparator());
            fileWriter.write("9,Владимир,менеджер,Санкт-Петербург" + System.lineSeparator());
            fileWriter.write("12,Сергей,инженер,Киров" + System.lineSeparator());
            fileWriter.write("5,Алексей,программист,Москва" + System.lineSeparator());
            fileWriter.write("10,Ольга,менеджер,Новгород" + System.lineSeparator());
        }

        fileWriter.close();
    }
}
