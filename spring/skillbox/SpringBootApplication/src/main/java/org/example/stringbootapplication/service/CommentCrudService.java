package org.example.stringbootapplication.service;

import org.example.stringbootapplication.dto.CommentDTO;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.TreeMap;

@Service
public class CommentCrudService implements CRUDService<CommentDTO>{

    private final TreeMap<Long, CommentDTO> storage = new TreeMap<>();

    @Override
    public CommentDTO getById(Long id) {
        System.out.println("Get by id " + id);
        return storage.get(id);
    }

    @Override
    public Collection<CommentDTO> getAll() {
        System.out.println("Get all");
        return storage.values();
    }

    @Override
    public void create(CommentDTO item) {
        System.out.println("Create");
        Long nextID = storage.isEmpty() ? 1 : storage.lastKey() + 1;
        item.setId(nextID);
        storage.put(nextID, item);
    }

    @Override
    public void update(Long id, CommentDTO item) {
        System.out.println("Update " + id);
        if (!storage.containsKey(id)) return;
        item.setId(id);
        storage.put(id, item);
    }

    @Override
    public void deleteByID(Long id) {
        System.out.println("Delete " + id);
        storage.remove(id);
    }
}
