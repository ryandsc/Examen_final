package com.example.examen.Domain.Entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres",nullable = false,length = 12)
    private String nombre;

    @Column(name = "apellidos", nullable = false, length = 50)
    private String apellidos;


    @OneToMany(mappedBy = "clientes",cascade = {CascadeType.ALL})
    private List<Reportes> reportes;
}
