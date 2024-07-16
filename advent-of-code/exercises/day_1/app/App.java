/*
 * This source file was generated by the Gradle 'init' task
 */
package app;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class App {
    public static final Path ansDir = Paths.get("")
            .toAbsolutePath()
            .resolve("exercises")
            .resolve("day_1")
            .resolve("ans");

    public static void main(String[] args) {
        // init answers directory
        try {
            Files.createDirectories(App.ansDir);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        App.Part1();
    }

    static void Part1() {
        int sum = 0;

        try (InputStream inStream = App.class.getResourceAsStream("/input")) {
            int current;
            int firstChar = -1;
            int lastChar = -1;

            if (inStream == null) {
                throw new Exception("File not found");
            }

            while ((current = inStream.read()) != -1) {
                char currentChar = (char) current;

                if (currentChar == '\n') {
                    if (firstChar != -1 && lastChar != -1) {
                        sum += Integer.parseInt(String.valueOf((char) firstChar) + (char) lastChar);

                        firstChar = -1;
                        lastChar = -1;
                        continue;
                    } else if (firstChar != -1) {
                        sum += Integer.parseInt(String.valueOf((char) firstChar) + (char) firstChar);

                        firstChar = -1;
                        continue;
                    }
                }

                if (currentChar < 49 || currentChar > 57) continue;

                if (firstChar == -1) {
                    firstChar = currentChar;
                } else {
                    lastChar = currentChar;
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(Arrays.toString(e.getStackTrace()));
        }

        try {
            Path filePath = App.ansDir.resolve("part_1");
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath.toFile()));

            writer.write("Sum of all number is:\t" + sum);
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    static void Part2() {}
}
