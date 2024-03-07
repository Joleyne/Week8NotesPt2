import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Java lang1 = new Java();
       Java lang2 = new Java();
        ArrayList<Java>lisOfCodingLng = new ArrayList<>();
        lisOfCodingLng.add(lang1);
        lisOfCodingLng.add(lang2);
       for(Java a: lisOfCodingLng){
           a.isTough();
           //This is polymorshpsism
       }
    }
}

class CodingLanguage{
    public void display(){
        System.out.println("This is psuedocode");
    }
}

class Java extends CodingLanguage{
    @Override
    public void display() {
        System.out.println("This is Java Programing");
    }

    public void isTough(){
        System.out.println("Java be tough sometimes");
    }

}
