package trade.javiergutierrez.adopt_junior_project_manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import trade.javiergutierrez.adopt_junior_project_manager.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
