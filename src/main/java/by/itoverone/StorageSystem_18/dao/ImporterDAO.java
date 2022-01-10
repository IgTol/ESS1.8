package by.itoverone.StorageSystem_18.dao;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ImporterDAO {
    private Integer importerId;
    private String importerName;
    private Integer importerUnp;
}
