import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TestCSVUtils {

    private static List<Game> gameList;


    @BeforeClass
    public static void initClass() throws URISyntaxException {
        Path caminho = Paths.get(ClassLoader.getSystemResource("vendas-games.csv").toURI());
        gameList = CsvUtils.readGameCsv(caminho);
    }

    @Test
    public void testNumberOfLines(){
        int numLines = gameList.size();
        Assert.assertEquals(100,numLines);
    }

    @Test(expected = FileNotFoundException.class)
    public void testCSVDoesntExist() throws FileNotFoundException {
        String path = "vendas-games.csv";
        List<Game> listGame = readCsv(path);
    }

    private List<Game> readCsv(String path) {
    }

}