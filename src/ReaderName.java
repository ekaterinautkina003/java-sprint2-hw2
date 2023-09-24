import java.io.File;
import java.util.ArrayList;
public class ReaderName {

    ArrayList<String> getName() {
        ArrayList<String> name = new ArrayList<>();
        File[] files = new File("./resources/").listFiles();
        assert files != null;
        for (File file : files) {
            if (file.isFile()) {
                name.add(file.getName());
            }
        }
        return name;
    }
}