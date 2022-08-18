import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;


public class CsvSorting {

    //O(n^2)
    public static void sort(String initialFile, String resultFile) throws IOException {

        Map<Integer, Integer> positions = new HashMap<>();

        FileReader fileReader1 = new FileReader(initialFile);
        Scanner scanner1 = new Scanner(fileReader1);
        String s = "";
        String[] str = new String[2];
        for (int i = 0; scanner1.hasNext(); i++) {
            s = scanner1.nextLine();
            str = s.split(",", 2);
            positions.put(i, Integer.parseInt(str[0]));
        }
        fileReader1.close();

        List<Map.Entry<Integer, Integer>> listPositions = new ArrayList<>(positions.entrySet());

        Collections.sort(listPositions, (o1, o2) -> o1.getValue() - o2.getValue());

        FileWriter fileWriter = new FileWriter(resultFile);
        for (int i = 0; i < listPositions.size(); i++) {

            int position = listPositions.get(i).getKey();
            FileReader fileReader2 = new FileReader(initialFile);

            Scanner scanner2 = new Scanner(fileReader2);

            for (int j = 0; j <= position; j++) {
                s = scanner2.nextLine();
                if (j == position) {

                    fileWriter.write(s + System.lineSeparator());

                }
            }

            fileReader2.close();
        }
        fileWriter.close();

    }
}

