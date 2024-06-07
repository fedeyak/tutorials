package org.example.stringbootapplication.controllers;

import lombok.AllArgsConstructor;
import org.example.stringbootapplication.dto.CommentDTO;
import org.example.stringbootapplication.service.CommentCrudService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/comment")
@AllArgsConstructor
public class CommentController {

    private final CommentCrudService commentService;

    @GetMapping("/{id}")
    public CommentDTO getCommentByID(@PathVariable Long id) {
        return commentService.getById(id);
    }

    @GetMapping
    public Collection<CommentDTO> getAll() {
        return commentService.getAll();
    }

    @PostMapping
    public void createComment(@RequestBody CommentDTO comment) {
        commentService.create(comment);
    }

    @PutMapping("/{id}")
    public void updateComment(@PathVariable Long id, @RequestBody  CommentDTO item) {
        commentService.update(id, item);
    }

    @DeleteMapping("/{id}")
    public void deleteComment(@PathVariable Long id) {
        commentService.deleteByID(id);
    }


}
