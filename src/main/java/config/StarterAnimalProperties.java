package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties
public class StarterAnimalProperties {
    private String[] animalNames;

}
