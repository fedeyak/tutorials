package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import service.CommentService;

@Configuration
@ComponentScan(basePackages = {"proxies", "service", "repositories"})
public class ProjectConfiguration {

//    @Bean
//    public CommentRepository commentRepository() {
//        return new DBCommentRepository();
//    }
//
//    @Bean
//    public CommentNotificationProxy commentNotificationProxy() {
//        return new EmailCommentNotificationProxy();
//    }
//
//    @Bean
//    public CommentService commentService(
//            CommentRepository commentRepository,
//            CommentNotificationProxy notificationProxy) {
//        return new CommentService(commentRepository, notificationProxy);
//    }
}
