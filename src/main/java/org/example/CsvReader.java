package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader{
    public String fileName;

    public CsvReader(String fileName) {

        this.fileName = fileName;
    }

    public List<String> readLine() throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while ((line = br.readLine()) != null) {
                lines.add(line);
                String [] separatedLine = line.split(",");

            }
            return lines;
        }
    }

}