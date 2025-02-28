import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        ArrayList<String> listaDeNomes = new ArrayList<>();

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Adicionar um nome");
            System.out.println("2. Atualizar um nome");
            System.out.println("3. Ler os nomes");
            System.out.println("4. Remover um nome");
            System.out.println("0. Sair do sistema");
            System.out.println("Digite a sua opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine();

            switch (escolha){
                case 0:
                    System.out.println("Saindo do sistema...");
                    return;
                case 1:
                    System.out.println("Adicione um nome:");
                    String nome = scanner.nextLine();
                    adicionarNomeNaLista(listaDeNomes, nome);
                    System.out.println(nome + " foi adicionado na lista!");
                    break;
                case 2:
                    if (listaDeNomes.isEmpty()){
                        System.out.println("Não é possível realizar a atualização, pois a lista está vazia.");
                    }else{
                        lerDadosDaLista(listaDeNomes);
                        System.out.println("Digite a posição do nome a ser atualizado: ");
                        int indiceNome = scanner.nextInt();
                        scanner.nextLine();
                            if (indiceNome < 0 || indiceNome >= listaDeNomes.size()){
                                System.out.println("Posição digitada inválida!");
                            }
                            else {
                                System.out.println("Digite o novo nome: ");
                                String elementoNome = scanner.nextLine();
                                atualizarDadosDaLista(listaDeNomes, indiceNome, elementoNome);
                                System.out.println("O nome foi atualizado com sucessso!");
                            }
                    }
                    break;
                case 3:
                    if (listaDeNomes.isEmpty()){
                        System.out.println("Não é possível realizar a leitura, pois a lista está vazia.");
                    }else{
                        lerDadosDaLista(listaDeNomes);
                    }
                    break;
                case 4:
                    if (listaDeNomes.isEmpty()){
                        System.out.println("Não é possível realizar a remoção, pois a lista está vazia.");
                    }else {
                        lerDadosDaLista(listaDeNomes);
                        System.out.println("Digite a posição do nome a ser removido:");
                        int indiceNome = scanner.nextInt();
                        scanner.nextLine();
                        if (indiceNome < 0 || indiceNome >= listaDeNomes.size()){
                            System.out.println("Posição digitada inválida!");
                        }
                        else {
                            deletarNomeDaLista(listaDeNomes, indiceNome);
                            System.out.println("O nome foi deletado com sucesso!");
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
                    break;
            }
        }
    }

    public static void adicionarNomeNaLista(ArrayList<String> listaDeNomes, String item){
        listaDeNomes.add(item);
    }

    public static void deletarNomeDaLista(ArrayList<String> listaDeNomes, int posicao) {
        listaDeNomes.remove(posicao);
    }

    public static void lerDadosDaLista(ArrayList<String> listaDeNomes){
        for (int i = 0; i < listaDeNomes.size(); i++) {
            System.out.println("Posição: " + i + " | Nome: " + listaDeNomes.get(i));
        }
    }

    public static void atualizarDadosDaLista(ArrayList<String> listaDeNomes, int posicao, String item){
        listaDeNomes.set(posicao, item);
    }
}