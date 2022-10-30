package com.example.demo5;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.*;

public class HelloApplication extends Application {
    static HashMap<String, String> map = new HashMap<>();

    @Override
    public void start(Stage stage) throws IOException {


        InputStream inputStream = getClass().getResourceAsStream("/data/result.txt");

        assert inputStream != null;
        String content = IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        String[] couples = content.split("#2@2!");
        String abs = "/";
        for (String couple :
                couples) {
            String[] ones = couple.split("!3@3#");
            String key = abs + ones[0];
            map.put(key, ones[1]);
        }

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 1000);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws IOException {
        launch();
    }

    public static List<String> getPhotos(String word) {
        List<String> res = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.contains(word)) {
                res.add(key);
            }
        }
        return res;
    }
}