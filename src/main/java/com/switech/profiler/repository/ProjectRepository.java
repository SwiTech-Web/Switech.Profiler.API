package com.switech.profiler.repository;

import com.switech.profiler.model.ProjectModel;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository <ProjectModel, Long> {
}
