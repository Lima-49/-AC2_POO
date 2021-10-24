import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    //Atributos
    private int qtd_p;
    private String nome_p;
    private double preco_uni;
    private double valor_total;

    //Construtores
    public Produtos(){
        qtd_p = 0;
        nome_p = null;
        preco_uni = 0;
        valor_total = 0;
    }
    public Produtos(int qtd_p, String nome_p, double preco_uni, double valor_total) {
        this.qtd_p = qtd_p;
        this.nome_p = nome_p;
        this.preco_uni = preco_uni;
        this.valor_total = valor_total;
    }

    //Gets e Sets
    public int getQtd_p() {
        return qtd_p;
    }

    public void setQtd_p(int qtd_p) {
        this.qtd_p = qtd_p;
    }

    public String getNome_p() {
        return nome_p;
    }
 
    public void setNome_p(String nome_p) {
        this.nome_p = nome_p;
    }
  
    public double getPreco_uni() {
        return preco_uni;
    }
 
    public void setPreco_uni(double preco_uni) {
        this.preco_uni = preco_uni;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }
    
    public void imprimir(){
        System.out.println("\n-----Dados informados-----");
        System.out.println("NOME = " + nome_p);
        System.out.println("QUANTIDADE DE PRODUTOS = " + qtd_p);
        System.out.println("PREÇO UNITARIO = " + qtd_p);
        System.out.println("VALOR TOTAL DOS PRODUTOS = " + valor_total);
    }

    public void cadastroProdutos(ArrayList<Produtos> cadastroP){
        //Scanners
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);
        
        //Variaveis
        int i = 0;
        String op = null;
        
        //Retomada do menu
        Menu m = new Menu();
        
        while (true){
            Produtos p = new Produtos();

            System.out.println((i+1) + " Produto");

            System.out.println("Infomerme o nome do produto: ");
            p.setNome_p(entradaS.nextLine());

            System.out.println("Infome a quantidade: ");
            p.setQtd_p(entrada.nextInt());

            System.out.println("Informe o Preço Unitario deste produto");
            p.setPreco_uni(entrada.nextDouble());

            System.out.println("Informe o valor total do produto: ");
            p.setValor_total(entrada.nextDouble());

            //Adicionando o objeto usuario no array cadastro
            cadastroP.add(p);
            
            //Pergunta para o usuario se deseja cadastrar mais
            //Caso contratio o loop eh quebrado e volta para o menu
            System.out.println("Desaja cadastrar mais Produtos: (Y/N)");
            op = entradaS.nextLine();

            if(op.equals("Y") || op.equals("y")){
                i+=1;
            }
            else{
                //Para cada usuario(obj) imprimir o cadastro
                for(Produtos objProdutos: cadastroP){
                    //imprimi os dados do arraylist u
                    objProdutos.imprimir();
                }
                //Retrona para o Menu
                m.menu();
                break;
            }

        }
    }
    
}
