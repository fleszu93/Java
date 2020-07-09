package zadanie3;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Stream;

public class Zadanie3 {
    
    public static void main(String[] args) throws FileNotFoundException, java.io.IOException {
        File f = new File("test.txt");
        if(!f.canRead())
            return;
        
        FileReader input = new FileReader(f);
        
        int[] wyniki = new int[3];
        int wordLength = 0, inInt;
        String white = " \t\r\n";
        
        while((inInt = input.read()) != -1)
        {
            ++wyniki[0];
            
            if(white.contains(""+(char)inInt))
            {
                ++wyniki[1];
                
                if(wordLength > 0)
                    ++wyniki[2];
                wordLength = 0;
            }
            else
                ++wordLength;
        }
        
        System.out.println(Arrays.toString(wyniki));
        
        input.close();
        
        
        szukaj("test.txt", "ma.txt", "ma");
    }
    
    public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String słowo) throws java.io.IOException
    {
        File fIn = new File(nazwaPlikWe);
        File fOut = new File(nazwaPlikWy);
        if(!fIn.canRead())
            return;
        
        PrintWriter writer = new PrintWriter(fOut);
        if(!fOut.canWrite())
            return;
            
        Scanner s = new Scanner(fIn);
        while(s.hasNext())
        {
            String line = s.nextLine();
            if(line.contains(słowo))
                writer.println(line);
        }
        writer.close();
    }
}
