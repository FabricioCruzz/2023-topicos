package br.edu.univas.si7.topicos.category.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardError {

    private String msg;
    private Integer status;
    private Date date;
}
