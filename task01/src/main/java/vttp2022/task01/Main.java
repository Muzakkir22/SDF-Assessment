package vttp2022.task01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Main {

    public static void main(String[] args) throws IOException {

        String dataFile = args[0];

        Particulars person = new Particulars();

        Reader r = new FileReader(dataFile);
        BufferedReader br = new BufferedReader(r);

        String data = br.readLine();

        while (null != data) {
            data = br.readLine();
            person.read(data);
        }

        person.generateReport();
    }
}