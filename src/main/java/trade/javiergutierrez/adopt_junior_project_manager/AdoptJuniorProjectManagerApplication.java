package trade.javiergutierrez.adopt_junior_project_manager;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import trade.javiergutierrez.adopt_junior_project_manager.model.Project;
import trade.javiergutierrez.adopt_junior_project_manager.repository.ProjectRepository;

import java.time.LocalDate;

@SpringBootApplication
public class AdoptJuniorProjectManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdoptJuniorProjectManagerApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(ProjectRepository projectRepository) {
		return (args) -> {
			// Create demo projects
			Project meta = new Project();
			meta.setName("META");
			meta.setDescription("META Project");
			meta.setDeadline(LocalDate.now().plusMonths(1));

			Project google = new Project();
			google.setName("GOOGLE");
			google.setDescription("GOOGLE Project");
			google.setDeadline(LocalDate.now().plusMonths(2));

			Project microsoft = new Project();
			microsoft.setName("MICROSOFT");
			microsoft.setDescription("MICROSOFT Project");
			microsoft.setDeadline(LocalDate.now().plusMonths(3));

			Project amazon = new Project();
			amazon.setName("AMAZON");
			amazon.setDescription("AMAZON Project");
			amazon.setDeadline(LocalDate.now().plusMonths(4));

			Project openai = new Project();
			openai.setName("OPEN AI");
			openai.setDescription("OPEN AI Project");
			openai.setDeadline(LocalDate.now().plusMonths(5));

			// Save projects to the repository
			projectRepository.save(meta);
			projectRepository.save(google);
			projectRepository.save(microsoft);
			projectRepository.save(amazon);
			projectRepository.save(openai);
		};
	}
}
