package aop;


import org.springframework.stereotype.Component;

@Component("UniLibraryBean")
public class UniLibrary extends AbstractLibrary{

//    @Override
    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary!");
    }

    public String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "OK";
    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary!");
    }
}