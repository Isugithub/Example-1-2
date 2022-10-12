public class Program {
    static void java(String p){
        System.out.println(p);
    }
    static void python(String q){
        System.out.println(q);
    }
    static void c(String r){
        System.out.println(r);
    }
    static void kotlin(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Program program = new Program();
        java("Java");
        python("Python");
        c("C");
        kotlin("Kotlin");
    }
}
