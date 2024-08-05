package com.challengerocket.app.service;

import com.challengerocket.app.exception.NoDataException;
import com.challengerocket.app.mapper.TaskUserMapper;
import com.challengerocket.app.model.TaskUser;
import com.challengerocket.app.util.ResourceType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class TaskUserImpl implements TaskUserService {

    private final TaskUserMapper taskUserMapper;

    @Override
    public TaskUser createTaskUser(TaskUser taskUser) {
        taskUserMapper.insert(taskUser);
        return taskUser;
    }

    @Override
    public List<TaskUser> findAllTask() {
        List<TaskUser> tasks = taskUserMapper.findAll();
        if(tasks.isEmpty()){
            throw new NoDataException(ResourceType.TASK.getField());
        }
        return tasks;
    }
}
