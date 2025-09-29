package nio;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static nio.DirectoryLister.listTree;

public class Main {
    public static void main(String[] args) {
        File startDir = new File("C:\\Users\\Ju-st\\Projetos Programação GitHub\\Projetos ADA\\tprog\\src");
        List<String> output = new ArrayList<>();

        listTree(startDir,"",output);

        output.forEach(System.out::println);
    }
}
