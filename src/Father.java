public class Father extends GrandFather{


    public Father(String name, int age, Home home, SpecialityEnum speciality) {
        super(name, age, home, speciality);
    }

    public final void goToWork(){
        System.out.println("Father goes to work on foot!!!"+"\n----------------");
    }
    public void goToWork(String car){
        System.out.println("Father goes to work with his: "+car+"\n----------------");
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
}
