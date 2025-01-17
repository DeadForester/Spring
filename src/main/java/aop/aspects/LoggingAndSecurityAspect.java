package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAndSecurityAspect {

    @Pointcut("execution(* get*())")
    private void allGetMethods(){}

    @Before("allGetMethods")
    public void beforeGetLoggingAdvice(){
        System.out.println("beforeGetBookAdvice : Попытка получить книгу/журнал");
    }

    @Before("allGetMethods")
    public void beforeGetSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: Провекра прав на получекние" +
                " книги/журнал");
    }

}
