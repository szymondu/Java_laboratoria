package pl.lublin.wsei.java.cwiczenia.test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFileRead {
        public static void main(String[] args) throws IOException {
            //try{
            String contents = new String(Files.readAllBytes(Paths.get("gusInfoGraphic.xml")));
            System.out.println("ZAWARTOŚĆ PLIKU gusInfoGraphic.xml");
            Pattern patter = Pattern.compile("<item>[\\s\\S]*?<\\/item>");
            Matcher matchh = patter.matcher(contents);
            while(matchh.find()){
                System.out.println(matchh.group(0));
            }
            //}
            //catch (IOException e){
            //   System.out.println("Błąd wczytywania pliku gusInfoGraphic.xml => "+ e.getLocalizedMessage());
            //   e.printStackTrace();
            //}
        }
    }
