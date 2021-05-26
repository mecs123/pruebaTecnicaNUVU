package com.pruebaTecnica.demo.RestCliente.models;

import com.pruebaTecnica.demo.RestTarjeta.models.Tarjeta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="clientes")
public class Cliente {
    @Id
    @Column(name="idClient",unique = true,nullable = false)
    private long idClient;
    private String nomClient;
    private int telCliente;
    private String dirClient;
    private String registDate;
    @ElementCollection
    @OneToMany(mappedBy = "fk_idTarjetaCliente")
    @Column(name = "tarjetas")
    private List<Tarjeta> tarjetaList;

}
