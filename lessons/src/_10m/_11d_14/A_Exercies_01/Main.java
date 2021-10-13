package _10m._11d_14.A_Exercies_01;

public class Main {
    /*
    Modifikujte třídu Triangle tak, aby konstruktor ošetřil případy,
    kdy zadávané strany netvoří trojúhelník (tj. součet dvou stran je menší,
    než třetí strana). V tomto případě konstruktor nastaví všechny strany na nulu
     */
    //Přetěžte konstruktor Triangele (int jednaStrana),
    //který bude vytářet rovnostranné trojúhelníky
    public static void main(String[] args) {
        Triangle abc = new Triangle(3, 5);
        System.out.println("TROJÚHELNÍK");
        System.out.println( "Obvod: "+ abc.circumference());
        System.out.println("Je praoúhlý: "+ abc.isRightAngle());
        System.out.println("Je trojúhelník: " + abc.isTriangle());
    }
}
