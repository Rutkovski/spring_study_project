package aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice:" +
//                "логируем получение " +
//                "списка студентов  перед методом getStudents");
//    }


//    @AfterReturning( pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String name = firstStudent.getNameSurname();
//        name = "MR. " + name;
//        firstStudent.setNameSurname(name);
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade+1;
//        firstStudent.setAvgGrade(avgGrade);
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice:" +
//                "логируем получение " +
//                "списка студентов после работы метода getStudents");
//    }

//
//    @AfterThrowing(pointcut =  "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: логируем" +
//                " выброс исключения"+exception);
//    }

    @After("execution (* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: логируем окончание работы или выброс" +
                "исключения");
    }


}
