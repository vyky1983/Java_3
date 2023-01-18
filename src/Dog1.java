public class Dog1 {
    String name;
    String breed;
    int weight;
    int speed;


    String getDog1(){
        return " Имя собаки --> "+name+"\n Парода собаки --> "+breed+"\n Вес собаки --> "+weight+".";
    }

   String ranDog1(){
        return " Бегу co скоростью --> "+speed+" Km/час ";
    }
   void ran1Dog1(){
        for (int i =0; i<speed; i++){
            System.out.println(" Бегу ");
        }
    }


}
