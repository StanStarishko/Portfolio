import java.io.IOException;
import java.util.ArrayList;

public interface IOTools {
    String getFileName();
    void fileIO(Boolean displayMode, ArrayList<Runner> listRunners) throws IOException;
    void setFileName(String newName, Boolean displayCurrentPath);
    ArrayList<Runner> getRuunersList();
}
