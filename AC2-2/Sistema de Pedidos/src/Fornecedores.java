import java.util.ArrayList;
import java.util.Scanner;

public class Fornecedores {
    //Atributos fornecedores
    private String nome;
    private double cnpj;

    //Construtores
    public Fornecedores(){
        nome = null;
        cnpj = 0;
    }
    public Fornecedores(String nome, Double cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    //Gets e Sets
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCnpj() {
        return cnpj;
    }

    public void setCnpj(double cnpj) {
        this.cnpj = cnpj;
    }

    public void imprimir(){
        System.out.println("\nDados informados");
        System.out.println("NOME = " + nome);
        System.out.println("CNPJ= " + cnpj);
    }

    public void cadastroFornecedor(ArrayList<Fornecedores> cadastroF){
        //Scanners
        Scanner entrada = new Scanner(System.in);
        Scanner entradaS = new Scanner(System.in);

        //Variaveis
        int i = 0;
        String op = null;

        //Retomada do menu
        Menu m = new Menu();

        while(true){
            Fornecedores f = new Fornecedores();

            System.out.println((i+1) + " Fornecedor");

            System.out.println("Infomerme o Nome da sua empresa: ");
            f.setNome(entradaS.nextLine());

            System.out.println("Infome o CNPJ da empresa: ");
            f.setCnpj(entrada.nextDouble());

            //Adicionando o objeto fornecedor no array cadastroF
            cadastroF.add(f);

            //Pergunta para o usuario se deseja cadastrar mais
            //Caso contratio o loop eh quebrado e volta para o menu
            System.out.println("Desaja cadastrar mais fornecedores: (Y/N)");
            op = entradaS.nextLine();

            if(op.equals("Y") || op.equals("y")){
                i+=1;
            }
            else{
                //Para cada fornecedor(obj) imprimir o cadastro
                for(Fornecedores objFornecedores: cadastroF){
                    //imprimi os dados do arraylist f
                    objFornecedores.imprimir();
                }
                //Retrona para o Menu
                m.menu();
                break;
            }

        }
                    
    }
}
