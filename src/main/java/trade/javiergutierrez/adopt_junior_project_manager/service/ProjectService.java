package trade.javiergutierrez.adopt_junior_project_manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import trade.javiergutierrez.adopt_junior_project_manager.model.Project;
import trade.javiergutierrez.adopt_junior_project_manager.repository.ProjectRepository;

import java.util.List;

@Service
@Transactional
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    // MÉTODO NO IMPLEMENTADO
    public List<Project> getAllProjects() {
        return null;
    }
    public Project createProject(Project project) {
        return projectRepository.save(project);
    }
    public Project getProjectById(long id) {
        return projectRepository.findById(id).orElse(null);
    }
    public Project updateProject(long id, Project project) {
        Project existingProject = projectRepository.findById(id).orElse(null);
        if (existingProject != null) {
            existingProject.setName(project.getName());
            existingProject.setDescription(project.getDescription());
            existingProject.setDeadline(project.getDeadline());
            return projectRepository.save(existingProject);
        }
        return null;
    }
    public void deleteProject(long id) {
        projectRepository.deleteById(id);
    }
}
