package by.itoverone.StorageSystem_18.dao;

import by.itoverone.StorageSystem_18.exception.ValidationException;
import lombok.Builder;
import lombok.Data;

import static java.util.Objects.isNull;

@Builder
@Data
public class ItemDAO {

    private Integer itemId;
    private String itemName;
    private Integer itemEAN;
    private Integer itemQuality;
    private Double itemPrice;

}
