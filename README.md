# itmoPhotoSearch7
----------------------
setup<br/>
for windows<br/>
  1.git clone https://github.com/vatankh/itmoPhotoSearch7.git
  2.run HelloApplication
for mac:
  1.git clone https://github.com/vatankh/itmoPhotoSearch7.git
  1.open pom.xml file
  2.go to      
  <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics </artifactId>
            <version>18</version>
            <classifier>win</classifier>
  </dependency>
  3.change win to mac so it becomes :
    <dependency>
            <groupId>org.openjfx</groupId>
            <artifactId>javafx-graphics </artifactId>
            <version>18</version>
            <classifier>mac</classifier>
  </dependency>
  4.run HelloApplication

  
-------------------------
how it wokrs 
1.write the text that you want to search (search for specific words)
2.press search 
3.finish 
example |
![alt text](https://github.com/vatankh/itmoPhotoSearch7/blob/main/example.png?raw=true)
