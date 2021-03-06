package by.itoverone.StorageSystem_18.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "item")
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer itemId;

    @Column
    private String itemName;

    @Column
    private Integer itemEAN;

    @Column
    private Integer itemQuality;

    @Column
    private Double itemPrice;
}
