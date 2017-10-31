import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class hq9p {
    public static void main(String[] args){
        Processor processor = new Processor();
        String sourceCode = new String();
        String sourceCodeLine = new String();
        if(args.length == 0){
            System.out.println("Please pass to interpreter source code location as argument");
            return;
        }
        //Get full listing
        try{
            FileInputStream fileStream = new FileInputStream(args[0]);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileStream));
            sourceCodeLine = reader.readLine();
            System.out.println("start");
            while(sourceCodeLine != null){
                sourceCode = sourceCode + sourceCodeLine + "\n";
                sourceCodeLine = reader.readLine();
            }
            System.out.println("finish");
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        //Then parse code
        int codeLength = sourceCode.length();
        for (int commandPositon=0; commandPositon<codeLength; commandPositon++){
            switch (sourceCode.charAt(commandPositon)){
                case 'H':
                    processor.DoH();
                    break;
                case 'Q':
                    processor.DoQ(sourceCode);
                    break;
                case '9':
                    processor.Do9();
                    break;
                case '+':
                    processor.DoPlus();
                    break;
                case '\n':
                    break;
                case ' ':
                    break;
                default:
                    System.out.println("Found wrong symbol. Ignoring it. Don't do that anymore!");
            }
        }
        System.out.println("=====Parsing finished! Useless counter is:");
        System.out.println(processor.DebugUselessCounter());
    }
}
