package htulowiecka.lumesse;

import htulowiecka.lumesse.command.Command;
import htulowiecka.lumesse.command.CommandFactory;
import htulowiecka.lumesse.io.ConsoleDataWriter;
import htulowiecka.lumesse.io.DataReader;
import htulowiecka.lumesse.io.DataWriter;
import htulowiecka.lumesse.io.FileDataReader;

import java.io.IOException;

public class AppRunner {

    public static void main(String[] args) throws IOException {
        if (args.length != 1){
            throw new IllegalArgumentException("Incorrect number of program parameters. Expected 1 - file name");
        }
        String filename = args[0];
        DataReader reader = new FileDataReader(filename);
        DataWriter writer = new ConsoleDataWriter();
        CommandFactory commandFactory = new CommandFactory();
        while(reader.ready()){
            try {
                String line = reader.readLine();
                Command command = commandFactory.fromName(line);
                writer.write(command.execute(reader.readLine().split(" ")));
            } catch (Exception e){
                // this would be changed to company preferred logger, ex log4j
                System.out.println("Problem occured: " + e.getMessage());
            }
        }
    }
}
