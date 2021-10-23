import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        //Objetos
        Usuario usuario = new Usuario();
        //Lista de Objetos
        ArrayList <Usuario> cadastro = new ArrayList <Usuario>();

        //Variaveis
        int op = 0;
        
        //Scanner
        Scanner entrada = new Scanner(System.in);

        System.out.println("---------- MENU ---------- ");
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
            System.out.println("------ Cadastro de Fornecedores ------\n"));
        }
    }
}
