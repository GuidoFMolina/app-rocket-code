package com.challengerocket.app.controller;


import com.challengerocket.app.model.TaskUser;
import com.challengerocket.app.service.TaskUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskUserController {
    @Autowired
    private TaskUserService service;

    @CrossOrigin("http://localhost:4200/")
    @PostMapping("/crear-tarea")
    public ResponseEntity<TaskUser> guardarTarea(@RequestBody TaskUser taskUser) {
        return new ResponseEntity<TaskUser>(service.createTaskUser(taskUser), HttpStatus.CREATED);
    }

    @CrossOrigin("http://localhost:4200/")
    @GetMapping("/listar-tareas")
    public ResponseEntity<List<TaskUser>>listarTareas() {
        List<TaskUser> taskUsers = service.findAllTask();
        return new ResponseEntity<>(taskUsers, HttpStatus.OK);

    }
}