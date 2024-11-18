package Artists;

public class Artist {
   private String name;
   private int age;
   private String Specialty;

   public Artist(String name, int age, String Specialty) {
      this.name = name;
      this.age = age;
      this.Specialty = Specialty;
   }

    public String toString() {
        return "Artists.Artist Name: " + name + " \nAge: " + age + " \nSpecialty: " + Specialty;
    }


}
