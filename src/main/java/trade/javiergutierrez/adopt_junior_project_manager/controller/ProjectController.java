package trade.javiergutierrez.adopt_junior_project_manager.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import trade.javiergutierrez.adopt_junior_project_manager.model.Project;
import trade.javiergutierrez.adopt_junior_project_manager.service.ProjectService;

import java.util.List;

@RestController
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public ResponseEntity <List<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAllProjects());
    }
    @GetMapping("/projects/{id}")
    public ResponseEntity <Project> getProjectById(@PathVariable Long id) {
        return ResponseEntity.ok(projectService.getProjectById(id));
    }
    @PostMapping("/projects")
    public ResponseEntity <Project> createProject(@RequestBody Project project) {
        return ResponseEntity.ok(projectService.createProject(project));
    }
    @PutMapping("/projects/{id}")
    public ResponseEntity <Project> updateProject(@PathVariable Long id, @RequestBody Project project) {
        return ResponseEntity.ok(projectService.updateProject(id, project));
    }
    @DeleteMapping("/projects/{id}")
    public ResponseEntity <Void> deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return ResponseEntity.ok().build();
    }
}
