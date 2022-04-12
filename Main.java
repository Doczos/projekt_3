import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    try {
      Service1 s = new Service1();
      s.addStudent(new Student("Krzysztof","Kowalski", 20));
      s.addStudent(new Student("Janusz","Nowak", 40));

      String imie;
      String nazwisko;
      int wiek;
      int i=0;
      while(i==0){
        System.out.println("Dodawanie Studenta wybierz 1");
        System.out.println("Lista Studentów wybierz 2");
        System.out.println("Zakończ Program wybierz 3");
        int wybierz;
        Scanner sc = new Scanner(System.in);
wybierz = sc.nextInt();
        switch(wybierz){
      case 1:
         System.out.println("Podaj imie");
          imie=sc.next();
        System.out.println("Podaj nazwisko");
          nazwisko=sc.next();
        System.out.println("Podaj wiek");
          wiek=sc.nextInt();
          s.addStudent(new Student(imie,nazwisko,wiek));
          break;
      case 2:{
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
            break;}
      case 3:{
        i++;
        System.out.println("Koniec programu");
          break;
      }
      }
      }
    }catch (IOException e) {
  
  }
  }
}