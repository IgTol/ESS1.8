package by.itoverone.StorageSystem_18.repository;

import by.itoverone.StorageSystem_18.entity.Importer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImporterRepository extends JpaRepository<Importer, Integer> {
    Importer findByImporterName(String importerName);
}
