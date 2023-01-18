package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("uniLibraryBean", UniLibrary.class);

        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
        uniLibrary.addBook("Zaur",book);
        uniLibrary.addMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean",
//                SchoolLibrary.class);
//        schoolLibrary.getBook();
 //       uniLibrary.returnBook();

//        context.close();
    }

}
