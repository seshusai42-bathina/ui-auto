package utils;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {
    private static final Properties properties = new Properties();
    static {
        try (InputStream file = ConfigReader.class.getResourceAsStream("/config.properties")) {
            if (file == null) {
                throw new FileNotFoundException("config.properties not found on the classpath");
            }
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException("Unable to load config.properties", e);
        }
    }
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}