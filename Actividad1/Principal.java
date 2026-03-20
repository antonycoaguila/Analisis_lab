public class Principal {

    public static void main(String[] args) {

        Bolsa<Chocolatina> bolsa = new Bolsa<>();

        Chocolatina c1 = new Chocolatina("Milka");
        Chocolatina c2 = new Chocolatina("Ferrero");
        Chocolatina c3 = new Chocolatina("Sublime");

        bolsa.add(c1);
        bolsa.add(c2);
        bolsa.add(c3);

        for (Chocolatina c : bolsa) {
            System.out.println(c.getMarca());
        }
    }
}