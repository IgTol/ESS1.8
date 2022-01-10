package by.itoverone.StorageSystem_18.controller;


import by.itoverone.StorageSystem_18.dao.ImporterDAO;
import by.itoverone.StorageSystem_18.service.ImporterService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/importer")
@AllArgsConstructor
public class ImporterController {
    private final ImporterService importerService;

    @PostMapping("/save")
    public ImporterDAO saveImporter(@RequestBody ImporterDAO importerDAO) throws by.itoverone.StorageSystem_18.exception.ValidationException {
        return importerService.saveImporter(importerDAO);
    }

    @GetMapping("/findAll")
    public List<ImporterDAO> findAllImporter() {
        return importerService.findAll();
    }

    @GetMapping("/findByImporterName")
    public ImporterDAO findByImporterName(@RequestParam String importerName) {
        return importerService.findByImporterName(importerName);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteImporter(@PathVariable Integer id) {
        importerService.deleteImporter(id);
        return ResponseEntity.ok().build();
    }
}
