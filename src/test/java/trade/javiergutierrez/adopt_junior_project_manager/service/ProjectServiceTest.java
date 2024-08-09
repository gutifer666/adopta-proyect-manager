package trade.javiergutierrez.adopt_junior_project_manager.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import trade.javiergutierrez.adopt_junior_project_manager.model.Project;
import trade.javiergutierrez.adopt_junior_project_manager.repository.ProjectRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class ProjectServiceTest {

    @InjectMocks
    private ProjectService projectService;

    @Mock
    private ProjectRepository projectRepository;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @Test
    void getAllProjects() {
        List<Project> projectList = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Project project = new Project();
            project.setName("Project " + i);
            project.setDescription("Description " + i);
            project.setDeadline(LocalDate.now().plusDays(i));
            projectList.add(project);
        }

        when(projectRepository.findAll()).thenReturn(projectList);

        List<Project> result = projectService.getAllProjects();
        assertEquals(5, result.size());
    }
}