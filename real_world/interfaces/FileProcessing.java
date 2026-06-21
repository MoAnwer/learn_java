package real_world.interfaces;

interface FileProcessor {
    void parsing(String filename);
}

class PDFProcessor implements FileProcessor {
    @Override
    public void parsing(String filename) {
        IO.print("Start parsing PDF file : " + filename);
    }
}

class CSVProcessor implements FileProcessor {
    @Override
    public void parsing(String filename) {
        IO.print("Start parsing csv file : " + filename);
    }
}

class JsonProcessor implements FileProcessor {
    @Override
    public void parsing(String filename) {
        IO.print("Start parsing json file : " + filename);
    }
}

public class FileProcessing {
    public static void main(String[] args) {
        FileProcessor file = new CSVProcessor();
        file.parsing("file.csv");
    }
}
