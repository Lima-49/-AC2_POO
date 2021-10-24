import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    //Objetos
    Usuario usuario = new Usuario();
    Fornecedores fornecedores = new Fornecedores();
    Produtos produto = new Produtos();

    //Lista de Objetos
    ArrayList <Usuario> cadastro = new ArrayList <Usuario>();
    ArrayList <Fornecedores> cadastroF = new ArrayList<Fornecedores>();
    ArrayList <Produtos> cadastroP = new ArrayList<Produtos>();

    //Variaveis
    int op = 0;
    
    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public void menu(){

        //clearScreen();

        //Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("\n---------- MENU ---------- ");
        System.out.println("Digite a opção desejada");
        System.out.println("<1> Cadastros de Clientes");
        System.out.println("<2> Cadastro de Fornecedores");
        System.out.println("<3> Cadastro de Produtos");
        System.out.println("<4> Efetuação de um pedido");
        System.out.println("<5> Baixa de pagamento de um pedido");
        System.out.println("<6> Relatórios");
        
        op = entrada.nextInt();

        switch(op){
            case 1:         
            System.out.println("------ Cadastro de Clientes ------\n");
            usuario.cadastroUsuario(cadastro);

            case 2:
            System.out.println("------ Cadastro de Fornecedores ------\n");
            fornecedores.cadastroFornecedor(cadastroF);

            case 3:
            System.out.println("------ Cadastro de Produtos ------\n");
            produto.cadastroProdutos(cadastroP);

        }
    }
}
