package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary uniLibrary = context.getBean("UniLibraryBean", UniLibrary.class);
//        Book book = context.getBean("book", Book.class);
        uniLibrary.getBook();
//        uniLibrary.returnBook();
        uniLibrary.getMagazine();

//        SchoolLibrary schoolLibrary = context.getBean("SchoolLibraryBean",
//                SchoolLibrary.class);
//        schoolLibrary.getBook();
        context.close();
    }
}
