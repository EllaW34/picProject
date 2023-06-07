import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.paint.Color;
import javafx.scene.image.WritableImage;
 
public class ImageLab extends Application {
    
    @Override
    public void start(Stage primaryStage) {
     
        // Create Image and ImageView objects
        //TODO: Enter the name of the image you want to modify below, including the file extension (ex. .png .jpg)
        //Image image = new Image("youImageName"); 
        ImageView imageView = new ImageView();
        //imageView.setImage(image);
       
        // Obtain PixelReader for loaded image
        /*PixelReader pixelReader = image.getPixelReader();
        System.out.println("Image Width: "+image.getWidth());
        System.out.println("Image Height: "+image.getHeight());
        System.out.println("Pixel Format: "+pixelReader.getPixelFormat());*/
        
        // Create WritableImage
         WritableImage wImage = new WritableImage(
                 900,
                 900);
         PixelWriter pixelWriter = wImage.getPixelWriter();
       
        // TODO: add nested for loops below to traverse the pixels in the image.  
        // Use the pixelWriter object to set the color of each pixel.  
        // Optional: Use the pixelReader object to read the color of pixels from 
        // the image you loaded.
        
        int n;
        
        for(int x = 0; x <= 299; x++) {
            for(int y = 0; y <= 299; y++) {
                n = (int)(Math.random()*28);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 300; y <= 599; y++) {
                n = (int)(Math.random()*28+29);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 600; y <= 899; y++) {
                n = (int)(Math.random()*28+57);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
        }
        for(int x = 300; x <= 599; x++) {
            for(int y = 0; y <= 299; y++) {
                n = (int)(Math.random()*28+86);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 300; y <= 599; y++) {
                n = (int)(Math.random()*28+114);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 600; y <= 899; y++) {
                n = (int)(Math.random()*28+143);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
        }
        for(int x = 600; x <= 899; x++) {
            for(int y = 0; y <= 299; y++) {
                n = (int)(Math.random()*28+171);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 300; y <= 599; y++) {
                n = (int)(Math.random()*28+200);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
            for(int y = 600; y <= 899; y++) {
                n = (int)(Math.random()*28+228);
                pixelWriter.setColor(x, y, Color.rgb(n, n, n));
            }
        }
        
        // Display image on screen
        imageView.setImage(wImage);
        StackPane root = new StackPane();
        root.getChildren().add(imageView);
        Scene scene = new Scene(root, (int)wImage.getWidth(),
                 (int)wImage.getHeight());
        primaryStage.setTitle("Image Lab");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}

/*
set PATH_TO_FX="C:\Users\P1\Desktop\javafx-sdk-19.0.2.1\lib"

javac --module-path %PATH_TO_FX% --add-modules javafx.controls ImageLab.java

java --module-path %PATH_TO_FX% --add-modules javafx.controls ImageLab
*/