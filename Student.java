public class Student {

  private String Name;
  private String Nazw;
  private int Age;

  public Student(String name,String nazw, int age) {
    Name = name;
    Nazw = nazw;
    Age = age;
  }

  public String GetName() {return Name;}
  public String GetNazw() {return Nazw;}
  public int GetAge() {return Age;}

  public String ToString() {
    return Name + " " + Nazw + " " +Integer.toString(Age);
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 3) 
      return new Student("Parse Error","Parse Error", -1);
    return new Student(data[0],data[1], Integer.parseInt(data[2]));
  }
}