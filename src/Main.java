public class Main {
    public static void main(String[] args) {

        Clube clube1 = new Clube("Nome 1", "Cidade 1");
        Clube clube2 = new Clube("Nome 2", "Cidade 2");
        Socio socio1 = new Socio(123, "Lu", 19, 45);
        Socio socio2 = new Socio(122, "JU", 17, 45);
        Socio socio3 = new Socio(121, "Se", 19, 50);
        Socio socio4 = new Socio(124, "Wu", 15, 50);

        clube1.addSocio(socio1);
        clube1.addSocio(socio2);
        clube2.addSocio(socio3);
        clube2.addSocio(socio4);

        System.out.println("A media do clube 1: "+clube1.getIdadeMediaSocios());
        System.out.println("A media do clube 2: "+clube2.getIdadeMediaSocios());
        clube1.imprimirSocios();
        clube2.imprimirSocios();

        System.out.println("///////////////////////////////////////////////////////////////");
        clube1.removerSocio(123);

        clube1.imprimirSocios();
        clube2.imprimirSocios();
        System.out.println("///////////////////////////////////////////////////////////////");

        System.out.println("Arrecadação Clube 1: "+clube1.arrecadacaoMensalidade());
        System.out.println("Arrecadação Clube 2: "+clube2.arrecadacaoMensalidade());




    }
}