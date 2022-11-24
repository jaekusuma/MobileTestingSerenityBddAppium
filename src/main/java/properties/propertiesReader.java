package properties;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

public class propertiesReader {
    public propertiesData readProperties() {
        Yaml yamlFile = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("configuration.yaml");
        return yamlFile.load(inputStream);
    }
}
