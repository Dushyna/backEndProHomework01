package files.model;

import java.awt.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class FilesText {


    public ArrayList<String> read(String fileName1) {

        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName1, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Не может прочитать файл " + fileName1);
        }
        return lines;
    }


    public void write(String fileName2, ArrayList<String> sortedLines) {


        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2))) {
            for (String str : sortedLines) {
                writer.write(str);
                writer.newLine();
            }
            System.out.println("ArrayList успешно записан в файл: " + fileName2);
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }


    public void sort(String fileName1, String fileName2) {

        String filePath1 = "c:/copy/" + fileName1;
        String filePath2 = "c:/copy/" + fileName2;

        ArrayList<String> lines = read(filePath1);
        ArrayList<String> sortedLines = (ArrayList<String>) lines.stream()
                .sorted()
                .collect(Collectors.toList());
        write(filePath2, sortedLines);

    }

    public void reverse(String fileName1, String fileName2) {

        String filePath1 = "c:/copy/" + fileName1;
        String filePath2 = "c:/copy/" + fileName2;

        ArrayList<String> lines = read(filePath1);
        Collections.reverse(lines);
        write(filePath2, lines);

    }

    public void shuffle(String fileName1, String fileName2) {

        String filePath1 = "c:/copy/" + fileName1;
        String filePath2 = "c:/copy/" + fileName2;

        ArrayList<String> lines = read(filePath1);
        Collections.shuffle(lines);
        write(filePath2, lines);

    }

}


