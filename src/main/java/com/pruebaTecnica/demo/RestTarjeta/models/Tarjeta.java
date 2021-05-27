package com.pruebaTecnica.demo.RestTarjeta.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tarjetas")
public class Tarjeta {
    @Id
    @Column(name="Id_tarjeta",unique = true,nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTarjeta;
    private String nomFranqui;
    private String nameBanco;
    private String numCuenta;
    private long fechaExp;
    private int cvTc;
    private long idClient;
}