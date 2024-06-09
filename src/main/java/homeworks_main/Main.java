package homeworks_main;

import entity.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.AnimalService;

import java.util.List;


@SpringBootApplication(scanBasePackages = {"service"})
@EnableJpaRepositories(basePackages = {"repository"})
@EntityScan("entity")
public class Main {
    @Autowired
    private AnimalService animalService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> dbOperations(ctx);
    }

    private void dbOperations(ApplicationContext ctx) {
        List<Animal> animallist = animalService.getAllAnimals();
        animalService.deleteAnimal(animallist.get(0));
        animalService.deleteAnimal(animallist.get(1));
        animalService.deleteAnimal(animallist.get(2));
        animalService.addAnimal(animallist.get(0));
    }
}
