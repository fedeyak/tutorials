package org.example.stringbootapplication.controllers;

import model.News;
import org.example.stringbootapplication.model.SimpleNews;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ConcurrentHashMap;

@RestController
@RequestMapping(path = "/simplenews")
public class SimpleNewsController {
    private ConcurrentHashMap<Long, SimpleNews> simpleNewsMap;

    public SimpleNewsController() {
        this.simpleNewsMap = new ConcurrentHashMap<>();
        simpleNewsMap.put(1L, new SimpleNews("Title 1", "News1"));
        simpleNewsMap.put(2L, new SimpleNews("Title 2", "News2"));
    }

    @GetMapping
    public ConcurrentHashMap<Long, SimpleNews> get() {
        return simpleNewsMap;
    }

    @PostMapping
    public void post(@RequestParam SimpleNews news) {
        simpleNewsMap.put(3L, news);
    }
}
