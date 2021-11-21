package com.javaassignments.assignmentone;

import java.io.File;
import java.util.regex.Pattern;

public class FileSearcher {
    public static void searchFileDirectory(String path, String regexPattern) {

        File root = new File(path);
        File[] filesList = root.listFiles();
        if ( filesList == null ) return;
        for ( File file : filesList ) {
            if ( file.isDirectory() ) {
                searchFileDirectory(file.getAbsolutePath(), regexPattern);
                //System.out.println( "Dir:" + f.getAbsoluteFile() );
            } else {
                boolean m = Pattern.matches(regexPattern, "" + file.getAbsoluteFile());

                if ( m )
                    System.out.println("File:" + file.getAbsoluteFile());
            }
        }
    }
}
