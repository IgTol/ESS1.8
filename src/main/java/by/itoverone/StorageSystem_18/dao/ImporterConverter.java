package by.itoverone.StorageSystem_18.dao;

import by.itoverone.StorageSystem_18.entity.Importer;
import org.springframework.stereotype.Component;

@Component
public class ImporterConverter {
    public Importer fromImporterDAOToImporter(ImporterDAO importerDAO) {
        Importer importer = new Importer();
        importer.setImporterId(importerDAO.getImporterId());
        importer.setImporterName(importerDAO.getImporterName());
        importer.setImporterUnp(importerDAO.getImporterUnp());
        return importer;
    }

    public ImporterDAO fromImporterToImporterDAO(Importer importer) {
        return ImporterDAO.builder()
                .importerId(importer.getImporterId())
                .importerName(importer.getImporterName())
                .importerUnp(importer.getImporterUnp())
                .build();
    }
}
