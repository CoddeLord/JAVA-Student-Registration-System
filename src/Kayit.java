import org.w3c.dom.CharacterData;

public class Kayit {
    String Name;

    String Surname;

    String cinsiyet;

    int StudentNumber;

    int Age;

    public Kayit(String name, String surname, String cinsiyet, int studentNumber, int age) {
        this.Name = name;
        this.Surname = surname;
        this.cinsiyet = cinsiyet;
        this.StudentNumber = studentNumber;
        this.Age = age;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public int getStudentNumber() {
        return StudentNumber;
    }

    public int getAge() {
        return Age;
    }
}
