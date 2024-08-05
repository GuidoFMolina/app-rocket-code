package com.challengerocket.app.mapper;

import com.challengerocket.app.model.TaskUser;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface TaskUserMapper {

    @Select("SELECT * FROM tareas")
    @Results(id = "tareaMap", value = {
            @Result(property = "id", column = "id"),
            @Result(property = "nombre", column = "nombre"),
            @Result(property = "descripcion", column = "descripcion"),
            @Result(property = "fechaInicio", column = "fecha_inicio")
    })
    List<TaskUser> findAll();

    @Insert("INSERT INTO tareas(nombre, descripcion, fecha_inicio) VALUES (#{nombre}, #{descripcion}, #{fechaInicio})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(TaskUser taskUser);
}