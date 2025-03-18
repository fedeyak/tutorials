package aspects;

import model.Comment;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.logging.Logger;

@Aspect
@Component
@Order(2)
public class LoggingAspect {

    private Logger logger = Logger.getLogger(LoggingAspect.class.getName());

    @Around("@annotation(ToLog)")
    //    @Around("execution(* services.*.*(..))")
    public Object log(ProceedingJoinPoint joinPoint) throws Throwable {
        logger.info("Logging Aspect: Calling the intercepted method");
        Object returnedValue = joinPoint.proceed();
        logger.info(" Logging Aspect: Method executed and returned: " + returnedValue);
        return returnedValue;

//        String methodName = joinPoint.getSignature().getName();
//        Object[] arguments = joinPoint.getArgs();
//        logger.info("Method " + methodName + " with parameters "
//                + Arrays.asList(arguments) + " will execute");
//
//        Comment comment = new Comment();
//        comment.setText("Some other text");
//        Object[] newArguments = {comment};
//
//        Object returnedByMethod = joinPoint.proceed();
//        logger.info("Method executed and returned " + returnedByMethod);
//        return "FAILED";


//        logger.info("Method will execute");
//        joinPoint.proceed();
//        logger.info("Method executed");
    }
}
