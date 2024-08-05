package com.challengerocket.app.model;


import com.challengerocket.app.util.CustomDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TaskUser {

    private Long id;
    private String nombre;
    private String descripcion;
    @JsonDeserialize(using = CustomDateDeserializer.class)
    private Date fechaInicio;


}
