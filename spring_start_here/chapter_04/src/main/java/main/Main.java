package main;

import configuration.ProjectConfiguration;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import service.CommentService;

public class Main {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        Comment comment = new Comment();
        comment.setAuthor("Bill");
        comment.setText("A comment");
        CommentService commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);

//        CommentRepository commentRepository = new DBCommentRepository();
//        CommentNotificationProxy commentNotificationProxy = new EmailCommentNotificationProxy();
//        CommentService commentService = new CommentService(commentRepository, commentNotificationProxy);
//
//        Comment comment = new Comment();
//        comment.setAuthor("Fedor");
//        comment.setText("Demo comment");
//
//        commentService.publishComment(comment);
    }
}
