package htulowiecka.lumesse.io;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileDataReader implements DataReader {

    private Iterator<String> fileLines;

    public FileDataReader(String filepath) throws IOException {
        try (Stream<String> stream = Files.lines(Paths.get(
                getClass().getClassLoader().getResource(filepath).toURI()
        ))) {
            fileLines = stream
                    .collect(Collectors.toList())
                    .iterator();
        } catch (URISyntaxException e) {
            throw new IOException(e);
        }
    }

    @Override
    public boolean ready() {
        return fileLines.hasNext();
    }

    @Override
    public String readLine() {
        return fileLines.next();
    }
}
