package com.challengerocket.app.service;

import com.challengerocket.app.model.TaskUser;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TaskUserService {

    public TaskUser createTaskUser(TaskUser taskUser);
    List<TaskUser> findAllTask();
}
