package htulowiecka.lumesse.io;

public class ConsoleDataWriter implements DataWriter {

    @Override
    public void write(String line) {
        System.out.println(line);
    }
}
