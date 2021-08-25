package com.codegym;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        copyFileText("taptinnguon.txt", "taptindich.txt");
    }

    public static void copyFileText(String fileSource, String fileTarget) {
        try {
            File fileR = new File(fileSource);

            if (!fileR.exists()) {
                throw new FileNotFoundException();
            }

            FileReader fileReader = new FileReader(fileR);
            BufferedReader br = new BufferedReader(fileReader);
            File fileW = new File(fileTarget);
            FileWriter fileWriter = new FileWriter(fileW);
            BufferedWriter bw = new BufferedWriter(fileWriter);

            String line = "";
            int count = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                bw.write(line + "\n");
                count++;
            }
            bw.write("count: " + count + "\n");
            bw.close();
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }

    }
}
