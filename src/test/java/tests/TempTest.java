package tests;

import utils.ConfigReader;

public class TempTest {
    public static void main(String[] args) {
        String s = ConfigReader.readProperty("src/main/resources/configuration.properties", "browser");
        System.out.println(s);
    }
}
