package inharitancehomeworkpackage;

public class Runtestjavaclass {
    public static void main(String[] args){
        System.out.println("Parent Class Mobile");
        mobile i = new mobile();
        i.unlock();
        i.password();
        i.use();
        i.lock();

        System.out.println("Child class Iphone13");
        Iphone13 m = new Iphone13();
        m.unlock();
        m.password();
        m.use();
        m.lock();

        System.out.println("Child class Iphone14");
        Iphone14 n = new Iphone14();
        n.unlock();
        n.password();
        n.use();
        n.lock();


        System.out.println("Child class Iphone15");
        Iphone15 y = new Iphone15();
        y.unlock();
        y.password();
        y.use();
        y.lock();

        System.out.println("Child class Applecamera");
        Applecamera c = new Applecamera();
        c.highquality();
        c.sensor();
        c.photographics();


    }
}
