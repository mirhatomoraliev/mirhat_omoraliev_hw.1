public class Main {
    public static void main(String[] args) {
        Home home1 = new Home("Chui 32/2.");
        Father father = new Father("Adil", 43, home1, SpecialityEnum.MANAGER);
        Son son = new Son("Azamat", 17, home1, SpecialityEnum.PROGRAMMER);
        Son daughter = new Son("Aisuluu", 15, home1, SpecialityEnum.STUDENT);
        System.out.println(father.getInfo()+"\n----------------------");
        System.out.println(son.getInfo()+"\n----------------------");
        System.out.println(daughter.getInfo()+"\n----------------------");
        father.goToWork();
        father.goToWork("AUDI");
        son.goToWork("BIKE");
    }
}