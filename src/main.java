public class main {
    public static void main(String[] args) {

//        Dog bil=new Dog();
//        bil.name="Bill";
//        bil.breed="rottweiler";
//        bil.weight=25.6;
//        System.out.println(bil.getInfo());

//        Box box1 = new Box();
//        box1.height = 10;
//        box1.length = 10;
//        box1.width = 10;
//
//        Box box2 = new Box();
//        box2.height = 20;
//        box2.length = 20;
//        box2.width = 20;
//
//        Box box3= new Box();
//        box3.width=25;
//        box3.length=15;
//        box3.height=69;
//
//
//
//        box1.showVolume();
//        box2.showVolume();
//        box3.showVolume();



//        Person alex1 = new Person();
//        Person vyky = new Person();
//        Person andy = new Person();
//        Person alex = new Person();
//
//        alex1.age = 44;
//        alex1.name = "Alexandru";
//        alex1.weight = 74.3;
//
//        vyky.age = 39;
//        vyky.name = "Veronica";
//        vyky.weight = 71.3;
//
//        andy.age = 15;
//        andy.name = "Andreea";
//        andy.weight = 70.1;
//
//        alex.age = 4;
//        alex.name = "Sanycika";
//        alex.weight = 20.4;
//
//        double sum = (alex1.age + andy.age + vyky.age + alex.age) / 4d;
//
//        System.out.println("Средний возраст --> " + sum);
//
//        Cat tisa = new Cat();
//        tisa.name = "tiska";
//        tisa.age = 1;
//        tisa.weight = 9.2;
//
//        Cat tihon = new Cat();
//        tihon.name = "Tihon";
//        tihon.age = 3;
//        tihon.weight = 15.25;
//
//        System.out.println(" У меня две кошки " + tihon.name + " " + "и" + " " + tisa.name);

//        Box1 box1=new Box1();
//        box1.height=6;
//        box1.length=15;
//        box1.width=69;
//        System.out.println(box1.getBox1());

        Dog1 dog1 =new Dog1();
        dog1.name=" Шарик ";
        dog1.breed=" Такса ";
        dog1.weight=12;

        Dog1 dog2= new Dog1();
        dog2.name="Dik";
        dog2.breed="doberman";
        dog2.weight=15;

        Dog1 dog3=new Dog1();
        dog3.name="Bill";
        dog3.breed="Affcharka";
        dog3.weight=35;

        Dog1 dog4=new Dog1();
        dog4.speed=10;

        System.out.println(dog1.getDog1());
        System.out.println();
        System.out.println(dog2.getDog1());
        System.out.println();
        System.out.println(dog3.getDog1());
        System.out.println();
        System.out.println(dog4.ranDog1());
        dog4.ran1Dog1();
    }

}
