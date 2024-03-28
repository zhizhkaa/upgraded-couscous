package LR3;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileMover {

    public static void main(String[] args) {
        String sourceDir = "./src/LR3/Directory_for_lab3";

        Path sourcePath = Paths.get(sourceDir);
        Path lecturesPath = Paths.get(sourceDir + "/Lectures");
        Path questionsPath = Paths.get(sourceDir + "/Questions");
        Path assignmentsPath = Paths.get(sourceDir + "/Assignments");

        try {
            Files.createDirectories(lecturesPath);
            Files.createDirectories(questionsPath);
            Files.createDirectories(assignmentsPath);
        } catch (IOException e) {
            System.err.println("Ошибка при создании папок: " + e.getMessage());
        }

        FileVisitor visitor = new FileVisitor(lecturesPath, questionsPath, assignmentsPath);

        try {
            Files.walkFileTree(sourcePath, visitor);
        } catch (IOException e) {
            System.err.println("Ошибка с проходом по файлам: " + e.getMessage());
        }
    }
    
    ///

    private static class FileVisitor extends SimpleFileVisitor<Path> {
        private Path lecturesPath;
        private Path questionsPath;
        private Path assignmentsPath;

        public FileVisitor(Path lecturesPath, Path questionsPath, Path assignmentsPath) {
            this.lecturesPath = lecturesPath;
            this.questionsPath = questionsPath;
            this.assignmentsPath = assignmentsPath;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            String fileName = file.getFileName().toString();

            if (fileName.contains("Lecture"))        { Files.move(file, lecturesPath.resolve(fileName)); } 
            else if (fileName.contains("Questions")) { Files.move(file, questionsPath.resolve(fileName)); } 
            else if (fileName.contains("Lab"))       { Files.move(file, assignmentsPath.resolve(fileName)); }

            return FileVisitResult.CONTINUE;
        }
    }
}