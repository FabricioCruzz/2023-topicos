package br.edu.univas.si7.topicos.product.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CATEGORIA")
@Data
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
    
    @OneToMany(mappedBy = "category")
    private Set<ProductEntity> products;
}
