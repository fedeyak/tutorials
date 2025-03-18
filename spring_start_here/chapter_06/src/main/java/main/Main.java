package main;

import config.ProjectConfig;
import model.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

import java.util.logging.Logger;

public class Main {
//    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Demo comment");
        comment.setAuthor("Natasha");

        service.publishComment(comment);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        CommentService service = context.getBean(CommentService.class);
//        Comment comment = new Comment();
//        comment.setText("Demo text");
//        comment.setAuthor("Natasha");
//
//        service.publishComment(comment);
//        logger.info("Hop");

//        String value = service.publishComment(comment);
//        logger.info(value);


//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        CommentService commentService = context.getBean(CommentService.class);
//
//        Comment comment = new Comment();
//        comment.setText("Demo text");
//        comment.setAuthor("Natasha");
//        commentService.publishComment(comment);
    }
}
