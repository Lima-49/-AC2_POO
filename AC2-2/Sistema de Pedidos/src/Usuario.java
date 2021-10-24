import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Usuario {
        //Atributos do cliente
        private String nome;
        private String email;
        private double cpf;
        private double cnpj;
        private int qtd_parcelamento;
        private int prz_fatura;

        //Construtores
        public Usuario() {
            nome = null;
            email = null;
            cpf = 0;
            cnpj = 0;
            qtd_parcelamento = 0;
            prz_fatura = 0;
        }
        public Usuario(String nome, String email, int cpf, int cnpj, int qtd_parcelamento, int prz_fatura) {
            this.nome = nome;
            this.email = email;
            this.cpf = cpf;
            this.cnpj = cnpj;
            this.qtd_parcelamento = qtd_parcelamento;
            this.prz_fatura = prz_fatura;
        }
    
        //Gets e Sets
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public String getEmail() {
            return email;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }
    
        public double getCpf() {
            return cpf;
        }
    
        public void setCpf(double cpf) {
            this.cpf = cpf;
        }
    
        public double getCnpj() {
            return cnpj;
        }
    
        public void setCnpj(double cnpj) {
            this.cnpj = cnpj;
        }
    
        public int getQtd_parcelamento() {
            return qtd_parcelamento;
        }
    
        public void setQtd_parcelamento(int qtd_parcelamento) {
            this.qtd_parcelamento = qtd_parcelamento;
        }
    
        public int getPrz_fatura() {
            return prz_fatura;
        }
    
        public void setPrz_fatura(int prz_fatura) {
            this.prz_fatura = prz_fatura;
        }
        
        //Limpa a tela do cmd
        public static void clearScreen() {  
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
        }  

        //Fucao para imprimir os valores do array list
        public void imprimir(String pessoa){
            
            System.out.println("\nDados informados");
            System.out.println("NOME = " + nome);
            System.out.println("EMAIL = " + email);
            if(pessoa.equals("PF") || pessoa.equals("pf")){
                System.out.println("CPF = " + cpf);
                System.out.println("QUANTIDADE DE PARCELAS = " + qtd_parcelamento);
            }
            else{
                System.out.println("CNPJ = " + cnpj);
            }   System.out.println("PRAZO MAXIMO DO FATURAMENTO: " + prz_fatura);
        }

        //Funcao para receber os valores do cadastro informado pelo usuario
        public void cadastroUsuario(ArrayList<Usuario> cadastro){
            
            //Scanners
            Scanner entrada = new Scanner(System.in);
            Scanner entradaS = new Scanner(System.in);
            
            //Variaveis
            int i = 0;
            String op = null;
            String pessoa = null;
            
            //Retomada do menu
            Menu m = new Menu();

            while (true){
                Usuario u = new Usuario();

                System.out.println((i+1) + " Usuario");
    
                System.out.println("Infomerme Seu Nome: ");
                u.setNome(entradaS.nextLine());
    
                System.out.println("Infome seu email: ");
                u.setEmail(entradaS.nextLine());
    
                System.out.println("Informe o tipo de pessoa");
                System.out.println("Pessoa Fisica = PF");
                System.out.println("Pessoa Juridica = PJ");
                pessoa = entradaS.nextLine();
    
                //Verificacao para receber o tipo de documento
                if(pessoa.equals("PF") || pessoa.equals("pf")){
                    System.out.println("Informe seu CPF: ");
                    u.setCpf(entrada.nextDouble());
                    System.out.println("Infome a quantidade máxima de parcelamanto do pedido: ");
                    u.setQtd_parcelamento(entrada.nextInt());
                }
                else{
                    System.out.println("Informe seu CNPJ: ");
                    u.setCnpj(entrada.nextDouble());
                    System.out.println("Infome o prazo máximo para o faturamento do pedido: ");
                    u.setPrz_fatura(entrada.nextInt());
                }
                
                //Adicionando o objeto usuario no array cadastro
                cadastro.add(u);
                
                //Pergunta para o usuario se deseja cadastrar mais
                //Caso contratio o loop eh quebrado e volta para o menu
                System.out.println("Desaja cadastrar mais usuarios: (Y/N)");
                op = entradaS.nextLine();

                if(op.equals("Y") || op.equals("y")){
                    i+=1;
                }
                else{
                    //Para cada usuario(obj) imprimir o cadastro
                    for(Usuario objUsuario: cadastro){
                        //imprimi os dados do arraylist u

                        clearScreen();
                        objUsuario.imprimir(pessoa);
                }
                //Retrona para o Menu
                m.menu();
                break;
            }
                        
        }
    }
}

