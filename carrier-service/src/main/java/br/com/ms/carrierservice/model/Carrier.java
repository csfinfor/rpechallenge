package br.com.ms.carrierservice.model;

import br.com.ms.carrierservice.model.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "carrier")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carrier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrier_id")
    private Long id;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "name")
    private String name;
    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status;
    @Column(name = "birthday_date")
    private LocalDate birthdayDate;
    @Column(name = "created")
    private LocalDate created;
    @Column(name = "updated")
    private LocalDate updated;
}