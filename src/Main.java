 public class Main {
        public static void main(String[] args) {

            Punkt p = new Punkt(29, 333);

            System.out.println(p.x);
            System.out.println(p.y);

            Punkt p2 = new Punkt();
        }
    }
    class Punkt {

        Punkt() {
            System.out.println("Konstruktor domyslny");
        }

        Punkt(int x, int y){
            System.out.println("Konstruktor z dwoma parametrami");
            this.x = x;
            this.y = y;
        }
        int x;
        int y;

    }

