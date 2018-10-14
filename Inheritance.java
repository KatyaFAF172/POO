package lab5;

public class Inheritance {
    A a = new A();
    B b = new B();



}

class A{
    String a;
    void display(){
        System.out.println("A is " +a);
    }
}

class B extends A{
    String b;
    void display(){
        System.out.println("B) There are four different writing systems in Japan: " +b);
    }
}

class C extends B{
    String c;
    void display(){
        System.out.println("C) Sumo is Japan's national sport " +c);
    }
}

class D extends C{
    String d;
    void display(){
        System.out.println("D) When moving into an apartment  " +d);
    }
}

class E extends D{
    String e;
    void display(){
        System.out.println("E) Men might shave their heads to apologize. " +e);
    }
}

class F extends E{
    String f;
    void display(){
        System.out.println("F) Coffee is very popular " +f);
    }
}

class G extends F{
    String g;
    void display(){
        System.out.println("G) Japan's literacy rate is almost  " +g);
    }
}

class H extends G{
    String h;
    void display(){
        System.out.println("H) Japan is the largest automobile producer  " +h);
    }
}

class I extends H{
    String i;
    void display(){
        System.out.println("I) Many couples in Japan celebrate Christmas like Valentine's Day. " +i);
    }
}

class J extends I{
    String j;
    void display(){
        System.out.println("J)More than 70% of Japan consists of mountains, " +j);
    }
        }

        class TestInheritance{
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();
        F f = new F();
        G g = new G();
        H h = new H();
        I i = new I();
        J j = new J();

        a.a = "Japan";
        b.b = "Romaji, Katakana, Hiragana, and Kanji.";
        c.c = ", although baseball is also very popular.";
        d.d = "it is often required to give the landlord \"gift\" money, usually equal to two months' rent.";
        e.e ="Not common these days.";
        f.f ="and Japan imports approximately 85% of Jamaica's annual coffee production.";
        g.g = " 100%.";
        h.h ="in the world.";
        i.i = "It is definitely more of a \"lovers\" holiday in Japan.";
        j.j = " including more than 200 volcanoes.";

        a.display();
        b.display();
        c.display();
        d.display();
        e.display();
        f.display();
        g.display();
        h.display();
        i.display();
        j.display();

    }
        }
