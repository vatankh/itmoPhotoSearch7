package com.example.demo5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

import java.io.*;
import java.util.List;

public class HelloController {
    public VBox photos;
    public TextField word;
    public VBox vboxx;
    public Button send;
    @FXML
    private Label welcomeText;

    @FXML



    public void getPhotos(ActionEvent actionEvent) throws FileNotFoundException {

            vboxx.getChildren().clear();
            vboxx.getChildren().add(word);
            vboxx.getChildren().add(send);
            List<String> photoPaths =HelloApplication.getPhotos(word.getText());
            for (String path :photoPaths
            ) {
                vboxx.getChildren().add(createImage(path));
            }

    }
    public ImageView createImage(String path) throws FileNotFoundException {
        InputStream stream = getClass().getResourceAsStream(path);
        assert stream != null;
        Image image = new Image(stream);
//creating ImageView for adding image
        ImageView imageView=new ImageView();
        imageView.setImage(image);
        imageView.setFitWidth(1000);
        imageView.setPreserveRatio(true);
        imageView.setSmooth(true);
        imageView.setCache(true);
        return imageView;
    }
}