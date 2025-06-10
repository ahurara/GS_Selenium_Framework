package org.example12.ConfigLoaders;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class EnvConfig {
    private static Properties properties;
    private static final String ENV_FILE_PATH = System.getProperty("user.dir") + "/src/.env";

    static {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream(ENV_FILE_PATH);
            properties.load(file);
            file.close();
        } catch (IOException e) {
            throw new RuntimeException("Error loading .env file: " + e.getMessage());
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key);
    }
} 