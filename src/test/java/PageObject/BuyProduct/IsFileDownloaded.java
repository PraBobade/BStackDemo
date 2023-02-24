package PageObject.BuyProduct;

import java.io.File;

public class IsFileDownloaded {
    public static boolean isFileDownloaded(String downloadPath, String fileName) {
        boolean flag = false;
        File Path = new File(downloadPath);
        File[] FilesList = Path.listFiles();

        assert FilesList != null;
        for (File SingleFile : FilesList) {
            System.out.println(SingleFile.getName());
            if (SingleFile.getName().equals(fileName)){
                return flag = true;
            }
        }
        return flag;
    }
}
