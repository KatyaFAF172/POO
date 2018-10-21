package fuckUbuntu;

class A {
    protected String a;
    protected A() {
    }

    protected X x = new X (" xxx");

    public A (String a){
        this.a = a;
    }
    public  String toString(){
        return "A{" +
                "a = '" + a + '\'' +
                ", x = " + x +
                '}';
    }

    public A (String a, X x){
        this.a = a;
        this.x = x;
    }

    void display() {
        System.out.println("A is " + a);
    }
}

class B extends A {
    protected String b;
    protected B() {
    }

    void display() {
        System.out.println("B) There are four different writing systems in Japan: " + b);
    }

    protected B(String b) {
        this.b = b;
    }

    public B(String a, X x, String b) {
        super(a, x);
        this.b = b;
    }

    @Override
    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }
}

class C extends B {
    protected String c;
    protected C() {
    }

    public C(String c) {
        this.c = c;
    }

    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("C) Sumo is Japan's national sport " + c);
    }
}



class D extends C {
    protected String d;
    protected D(){
    }
    protected D(String d) {
        this.d = d;
    }

    public String toString() {
        return "D{" +
                "d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("D) When moving into an apartment  " + d);
    }
}

class E extends D {
    protected String e;
    protected E() {
    }
    protected E(String e) {
        this.e = e;
    }
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }


    void display() {
        System.out.println("E) Men might shave their heads to apologize. " + e);
    }
}

class F extends E {
    protected String f;
    protected F() {
    }
    protected F(String f) {
        this.f = f;
    }
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("F) Coffee is very popular " + f);
    }
}

class G extends F {
    protected String g;
    protected G() {
    }

    protected G(String g) {
        this.g = g;
    }
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("G) Japan's literacy rate is almost  " + g);
    }
}

class H extends G {
    protected String h;
    protected H() {
    }

    protected H(String h) {
        this.h = h;
    }
    public String toString() {
        return "H{" +
                "h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                ", x=" + x +
                '}';
    }

    void display() {
        System.out.println("H) Japan is the largest automobile producer  " + h);
    }
}

class I extends H {
    protected String i;
    protected I() {
    }
    protected I(String i) {
        this.i = i;
    }
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                //", x=" + x +
                '}';
    }

    void display() {
        System.out.println("I) Many couples in Japan celebrate Christmas like Valentine's Day. " + i);
    }
}

class J extends I {
    protected String j;
    protected J() {
    }
    protected J(String j) {
        this.j = j;
    }

    public String toString() {
        return "J{" +
                "j='" + j + '\'' +
                ", i='" + i + '\'' +
                ", h='" + h + '\'' +
                ", g='" + g + '\'' +
                ", f='" + f + '\'' +
                ", e='" + e + '\'' +
                ", d='" + d + '\'' +
                ", c='" + c + '\'' +
                ", b='" + b + '\'' +
                ", a='" + a + '\'' +
                '}';
    }

    void display() {
        System.out.println("J)More than 70% of Japan consists of mountains, " + j);
    }
}

//    class X extends A {
//        protected String x;
//
//        @Override
//        void display() {
//            System.out.println("X) some name " + x);
//        }
//    }

class X {
    private String x;

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }

    public X(String x) {
        this.x = x;
    }

    public X(){
    }
}

public class fuckUbuntu {
    protected static void main(String args[]) {
        A aa = new A();
        B bb = new B();
        C cc = new C();
        D dd = new D();
        E ee = new E();
        F ff = new F();
        G gg = new G();
        H hh = new H();
        I ii = new I();
        J jj = new J();
        X xx = new X();

        System.out.println(aa.toString());
        System.out.println(bb.toString());
        System.out.println(cc.toString());
        System.out.println(dd.toString());
        System.out.println(ee.toString());
        System.out.println(ff.toString());
        System.out.println(gg.toString());
        System.out.println(hh.toString());
        System.out.println(ii.toString());
        System.out.println(gg.toString());
        System.out.println(jj.toString());
        A aaa = new A ("aaa",new X("xxx"));
        System.out.println(aaa.toString());

        aa.a = "Japan";
        bb.b = "Romaji, Katakana, Hiragana, and Kanji.";
        cc.c = ", although baseball is also very popular.";
        dd.d = "it is often required to give the landlord \"gift\" money, usually equal to two months' rent.";
        ee.e = "Not common these days.";
        ff.f = "and Japan imports approximately 85% of Jamaica's annual coffee production.";
        gg.g = " 100%.";
        hh.h = "in the world.";
        ii.i = "It is definitely more of a \"lovers\" holiday in Japan.";
        jj.j = " including more than 200 volcanoes.";

        aa.display();
        bb.display();
        cc.display();
        dd.display();
        ee.display();
        ff.display();
        gg.display();
        hh.display();
        ii.display();
        jj.display();


    }
}
