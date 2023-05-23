package br.edu.univas.si7.topicos.category.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CATEGORIA")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    @Id
    @Column(name = "ID_CATEGORIA")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "NOME")
    private String name;

    @Column(name = "FAMILIA")
    private String family;

    @Column(name = "GRUPO")
    private String group;

    @Column(name = "TIPO_UNIDADE")
    @Enumerated(EnumType.STRING)
    private UnitType unitType;

    public Category(int i, String s) {
    }
}
