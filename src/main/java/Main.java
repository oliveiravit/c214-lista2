import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String plataforma;
        String publisher;
        String path = "src/main/resources/vendas-games.csv";
        List<Game> listaTodosGames = null;

        System.out.println("Entre com a plataforma escolhida:");
        plataforma = teclado.next();
        ServiceGame.getListByPlatform(listaTodosGames, Platform plataforma);

        System.out.println("Entre com o publisher escolhido:");
        publisher = teclado.next();
        ServiceGame.getByPuBlisher(listaTodosGames, Publisher publisher);

        writeCsv(Platform plataforma);
    }

    private static void writeCsv(List<Game> gameFiltrado) {
    }

    private static void readCsv(String path) {
    }
}
