import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Sistema {
    private Operador operador;

    private Scanner in;

    public Sistema() {
        operador = new Operador();
        in=new Scanner(System.in);
    }

    public String[] leArquivo(String nome){
        String[] linhas = new String[1000];
        int contador = 1;
        try{
            FileReader fr;
            fr = new FileReader(nome);
            BufferedReader bf;
            bf = new BufferedReader(fr);
            String linha = bf.readLine();
            linhas[0] = linha;
            while(linha != null){
                linha = bf.readLine();
                linhas[contador] = linha;
                contador++;
            }
        }catch (Exception e){
            System.out.println("arquivo não encontrado");
        }
        return linhas;
    }

    public void cadastra(){
        System.out.println("=============================");
        System.out.println("Caminho do Arquivo:");
        System.out.println("=============================");
        String[] linhas=leArquivo(in.nextLine());
        String id; String nome; String tipo;
        for (int i=0;i< linhas.length;i++){
            id=linhas[i].split(",")[0];
            nome=linhas[i].split(",")[1];
            tipo=linhas[i].split(",")[2];
            if (tipo.equals("Medico")){
                Medico medico=new Medico(id,nome,tipo);
                operador.cadastraUsuario(medico);
            }

            if (tipo.equals("Paciente")){
                Paciente paciente =new Paciente(id,nome,tipo);
                operador.cadastraUsuario(paciente);
            }
            if (tipo.equals("Administrador")){
                Administrador administrador =new Administrador(id,nome,tipo);
                operador.cadastraUsuario(administrador);
            }
        }
    }

    /*public void menuUser(){
        int opcao =0;
        do {
            System.out.println("===============================");
            System.out.println("Escolha seu Usuarios");
            System.out.println("[1] Escolher Usuario");
            System.out.println("[2] Ver lista de Usuarios");
            System.out.println("===============================");
            System.out.print("Digite a opcao desejada: ");
            opcao = in.nextInt();
            in.nextLine();
            switch(opcao) {
                case 1:
                    escolheUser();
                    break;
                case 2:


            }
        }*/
    }