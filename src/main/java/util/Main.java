package util;

import com.aspose.slides.HtmlOptions;
import com.aspose.slides.Presentation;
import com.aspose.slides.SaveFormat;

import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception{
        File directory = new File("");
        String absolutePath = directory.getAbsolutePath();

        String sourcePath = absolutePath + "\\src\\main\\resources\\test.pptx";
        String savePath = sourcePath.replace("pptx", "html");

        Presentation presentation = new Presentation(sourcePath);
        presentation.save(savePath, SaveFormat.Html);
    }
}
