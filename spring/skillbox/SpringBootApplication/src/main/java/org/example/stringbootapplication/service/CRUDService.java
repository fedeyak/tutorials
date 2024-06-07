package org.example.stringbootapplication.service;

import model.News;

import java.util.Collection;

public interface CRUDService<T> {

    public T getById(Long id);
    public Collection<T> getAll();
    public void create(T item);
    public void update(Long id, T item);
    public void deleteByID(Long id);
}
