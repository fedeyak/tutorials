package service;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {
//    @Autowired
    private final CommentRepository commentRepository;
//    @Autowired
    private final CommentNotificationProxy commentNotificationProxy;

        public CommentService(
            CommentRepository commentRepository,
            @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

//    public CommentService(
//            CommentRepository commentRepository,
//            CommentNotificationProxy commentNotificationProxy) {
//        this.commentRepository = commentRepository;
//        this.commentNotificationProxy = commentNotificationProxy;
//    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
