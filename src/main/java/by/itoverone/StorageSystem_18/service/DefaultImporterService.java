package by.itoverone.StorageSystem_18.service;

import by.itoverone.StorageSystem_18.dao.ImporterConverter;
import by.itoverone.StorageSystem_18.dao.ImporterDAO;
import by.itoverone.StorageSystem_18.entity.Importer;
import by.itoverone.StorageSystem_18.exception.ValidationException;
import by.itoverone.StorageSystem_18.repository.ImporterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
@AllArgsConstructor
public class DefaultImporterService implements ImporterService{
    private final ImporterRepository importerRepository;
    private final ImporterConverter importerConverter;

    private void validateImporterDAO(ImporterDAO importerDAO) throws ValidationException {
        if (isNull(importerDAO)) {
            throw new ValidationException("Object importer is null");
        }
        if (isNull(importerDAO.getImporterName()) || importerDAO.getImporterName().isEmpty()) {
            throw new ValidationException("Importer name is empty");
        }
    }

    @Override
    public ImporterDAO saveImporter(ImporterDAO importerDAO) throws ValidationException {
        validateImporterDAO(importerDAO);
        Importer savedImporter = importerRepository.save(importerConverter.fromImporterDAOToImporter(importerDAO));
        return importerConverter.fromImporterToImporterDAO(savedImporter);
    }

    @Override
    public void deleteImporter(Integer importerId) {
        importerRepository.deleteById(importerId);
    }

    @Override
    public ImporterDAO findByImporterName(String importerName) {
        Importer importer = importerRepository.findByImporterName(importerName);
        if (importer != null) {
            return importerConverter.fromImporterToImporterDAO(importer);
        }
        return null;
    }

    @Override
    public List<ImporterDAO> findAll() {

        return null;
    }
}
