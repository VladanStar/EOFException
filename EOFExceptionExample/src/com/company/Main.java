package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("tekst.txt"));
            output.writeDouble(4.5);
            output.writeDouble(43.25);
            output.writeDouble(3.2);
            output.close();

            DataInputStream input = new DataInputStream(new FileInputStream("tekst.txt"));
            while (true) {
                System.out.println();
            }
        } catch (EOFException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
