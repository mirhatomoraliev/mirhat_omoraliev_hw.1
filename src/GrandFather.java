public class GrandFather {
    private String name;
    private int age;
    private Home home;
    private SpecialityEnum speciality;

    public GrandFather(String name, int age, Home home, SpecialityEnum speciality) {
        this.name = name;
        this.age = age;
        this.home = home;
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Home getHome() {
        return home;
    }

    public SpecialityEnum getSpeciality() {
        return speciality;
    }

    public String getInfo(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nHome address: " + home.getAddress() +
                "\nSpeciality: " + speciality;
    }
}
