package vasundhara.assignment7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ReadingAndWritingToFiles {
    public static void main(String args[])
    {
        Map<Character,Integer> countMap=new HashMap<>();
     String file="./"+args[0];
     System.out.println(file);
        try
        {
            FileReader fr=new FileReader(file);
            int ch=fr.read();
            while(ch!=-1)
            {
                System.out.print((char)ch);
                if(countMap.containsKey((char)ch))
                {
                 countMap.put((char)ch,countMap.get((char)ch)+1);
                }
                else
                countMap.put((char)ch,1);
                ch=fr.read();
            }
        }
        catch(FileNotFoundException e)
        {
        }
        catch(IOException e1)
        {

        }
        String fileName="./write.txt";
        try
        {
            FileWriter fw=new FileWriter(fileName);
            String fileContent="";
            for(Character c:countMap.keySet())
            {
                if(c!=' ')
                fileContent+=c+":"+countMap.get(c)+"\n";
            }
            fw.write(fileContent);
            fw.flush();
            fw.close();
        }

        catch(IOException e1)
        {

        }
    }
}
