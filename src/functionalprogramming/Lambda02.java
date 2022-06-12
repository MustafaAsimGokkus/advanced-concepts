package functionalprogramming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
//        Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
//                .forEach(System.out::println);
//        System.out.println("===========================");

    //read the text from LambdaFile01 in uppercases
    Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
            .map(String::toUpperCase)
            .forEach(System.out::println);
    //read just the first row in lowercases
        //1st way
        Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .limit(1)
                .map(String::toLowerCase)
                .forEach(System.out::println);
        //2nd way
        System.out.println(   Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .map(String::toLowerCase)
                .findFirst()//string dondugu icin bunu komple sout icine al
        );


    //read just the 3rd row in lowercases
        //1st way
        Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .skip(2)
                .limit(1)
                .map(String::toLowerCase)
                .forEach(System.out::println);
        //2nd way

        System.out.println(Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                 .skip(2)
                .map(String::toLowerCase)
                .findFirst());
        //find the number of lines in which the word "lambda" is used (ignore cases)
        System.out.println(Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .filter(t->t.toLowerCase().contains("lambda")).count());

        //Print all different words from the file in a list
        System.out.println( Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));
        //count the diffeent words used in the file
        System.out.println( Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());
        //find the number of the word lambda in the file
        System.out.println(Files.lines(Paths.get("C:\\Users\\Asim\\IdeaProjects\\javasommer2022\\LambdaFile01.txt"))
                .map(t->t.toLowerCase().replaceAll("_","").split(" "))
                .flatMap(Arrays::stream)
                .map(t->t.replaceAll("\\W",""))//it will keep letters-digits and _
                .filter(t->t.equalsIgnoreCase("and"))
                .count());
  }
}