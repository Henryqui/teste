import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite:" +
                "1 - Para Professor" +
                "2 - Para Aluno");
        int resposta = sc.nextInt();

        switch (resposta){
            case 1:
                professor();
                break;
            case 2:
                aluno();
                break;
        }


    }

    public static void professor(){






    }
    public static void aluno(){
        Scanner sc = new Scanner(System.in);

        String[][] agenda = new String[5][8];
        boolean fds = true;

        int qntau = 36;

        for (int i = 0; i < 5; i++) {
            System.out.println("Qual o dia que irá ser organizado?");
            String dia = sc.next();
            System.out.println("Quantas aulas terão no dia?");
           int audi = sc.nextInt();
        for (int j = 0; j < audi ; j++) {
            System.out.println("Qual é aula de número " + (j + 1) + " do dia de " + dia + "?");
            agenda[i][j] = sc.next();
        }
    }


        for (int i = 0; i < 5; i++) {

                for (int j = 0; j < 8; j++) {
                    if (agenda[i][j] != null){
                    System.out.println(j + "° aula " +
                                agenda[i][j] );
                }}
    }

        }
    }


