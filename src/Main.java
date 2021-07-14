import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<String> strings = Files.readAllLines(Paths.get("Text.txt"));
//        List<String> strings = Files.readAllLines(Paths.get("Text2.txt"));
            List<String> blackList = Files.readAllLines(Paths.get("BlackList.txt"));
            Censor censor = new Censor(strings, blackList);

            censor.viewText();
            censor.viewBlacklist();
            censor.checkCens(strings, blackList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
