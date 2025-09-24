package lazy.coder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Run {

    public static void Python()
    {
        try
        {
            //ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//          String[] command = {"python", "-c", "print('hello form python')"};
            String[] command = {"python", "clear.py"};
            ProcessBuilder builder = new ProcessBuilder(command);
            builder.redirectErrorStream(true);

            Process process = builder.start();

            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            process.waitFor();

        } catch (IOException | InterruptedException e) {
            // throw new RuntimeException(e);
            e.printStackTrace();
        }
    }

}



