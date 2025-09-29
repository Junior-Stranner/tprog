package nio;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class DirectoryLister {

    public static void listTree(File start, String indent, List<String> out){
        if(start == null ||!start.exists()){
           return;
        }

        if(start.isDirectory()){
            out.add(indent + start.getName() + "/");

            File[] children = start.listFiles();
            if(children != null){
                Arrays.stream(children)
                        .sorted((a,b) -> a.getName().compareToIgnoreCase(b.getName()))
                        .forEach(child -> listTree(child, indent + "  ", out));
        } else {
            out.add(indent + start.getName());
            }
        }
    }
}
