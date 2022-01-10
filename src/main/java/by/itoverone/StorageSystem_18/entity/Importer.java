package by.itoverone.StorageSystem_18.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "importer")
@Data
@NoArgsConstructor
public class Importer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer importerId;

    @Column
    private String importerName;

    @Column
    private Integer importerUnp;
}
