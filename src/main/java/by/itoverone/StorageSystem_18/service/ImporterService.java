package by.itoverone.StorageSystem_18.service;

import by.itoverone.StorageSystem_18.dao.ImporterDAO;
import by.itoverone.StorageSystem_18.exception.ValidationException;

import java.util.List;

public interface ImporterService {
    ImporterDAO saveImporter(ImporterDAO importerDAO) throws ValidationException;

    void deleteImporter(Integer importerId);

    ImporterDAO findByImporterName(String itemName);

    List<ImporterDAO> findAll();
}
