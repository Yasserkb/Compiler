import net.mips.compiler.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner("C:\\Users\\user\\Documents\\EMSI\\4IIR\\S3\\compilation 2\\TP3\\Compilation\\src\\net\\mips\\compiler\\sc.txt");

        while (sc.getCarCour()!=Scanner.EOF) {
            sc.symSuivant();
            System.out.println(sc.getSymbCour().toString());
        }

    }
}