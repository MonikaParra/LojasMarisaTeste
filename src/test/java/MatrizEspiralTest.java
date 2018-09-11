import org.junit.Assert;
import org.junit.Test;

public class MatrizEspiralTest {

    @Test
    public void retorna_espiral_sentido_horario_uma_linha(){

        int[][] matriz = new int[1][5];
        int[][] matrizRetorno;

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoHorario(1,5);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_horario_uma_coluna(){

        int[][] matriz = new int[5][1];
        int[][] matrizRetorno;

        matriz[0][0] = 1;
        matriz[1][0] = 2;
        matriz[2][0] = 3;
        matriz[3][0] = 4;
        matriz[4][0] = 5;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoHorario(5,1);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_horario_matriz_tres_por_tres(){

        int[][] matriz = new int[3][3];
        int[][] matrizRetorno;

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][2] = 4;
        matriz[2][2] = 5;
        matriz[2][1] = 6;
        matriz[2][0] = 7;
        matriz[1][0] = 8;
        matriz[1][1] = 9;


        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoHorario(3,3);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_horario_matriz_quatro_por_quatro(){

        int[][] matriz = new int[4][4];
        int[][] matrizRetorno;

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[1][3] = 5;
        matriz[2][3] = 6;
        matriz[3][3] = 7;
        matriz[3][2] = 8;
        matriz[3][1] = 9;
        matriz[3][0] = 10;
        matriz[2][0] = 11;
        matriz[1][0] = 12;
        matriz[1][1] = 13;
        matriz[1][2] = 14;
        matriz[2][2] = 15;
        matriz[2][1] = 16;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoHorario(4,4);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_anti_horario_uma_linha(){

        int[][] matriz = new int[1][5];
        int[][] matrizRetorno;

        matriz[0][0] = 5;
        matriz[0][1] = 4;
        matriz[0][2] = 3;
        matriz[0][3] = 2;
        matriz[0][4] = 1;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoAntiHorario(1,5);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_anti_horario_uma_coluna(){

        int[][] matriz = new int[5][1];
        int[][] matrizRetorno;

        matriz[0][0] = 1;
        matriz[1][0] = 2;
        matriz[2][0] = 3;
        matriz[3][0] = 4;
        matriz[4][0] = 5;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoAntiHorario(5,1);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_anti_horario_matriz_tres_por_tres(){

        int[][] matriz = new int[3][3];
        int[][] matrizRetorno;

        matriz[0][2] = 1;
        matriz[0][1] = 2;
        matriz[0][0] = 3;
        matriz[1][0] = 4;
        matriz[2][0] = 5;
        matriz[2][1] = 6;
        matriz[2][2] = 7;
        matriz[1][2] = 8;
        matriz[1][1] = 9;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoAntiHorario(3,3);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

    @Test
    public void retorna_espiral_sentido_anti_horario_matriz_quatro_por_quatro(){

        int[][] matriz = new int[4][4];
        int[][] matrizRetorno;

        matriz[0][3] = 1;
        matriz[0][2] = 2;
        matriz[0][1] = 3;
        matriz[0][0] = 4;
        matriz[1][0] = 5;
        matriz[2][0] = 6;
        matriz[3][0] = 7;
        matriz[3][1] = 8;
        matriz[3][2] = 9;
        matriz[3][3] = 10;
        matriz[2][3] = 11;
        matriz[1][3] = 12;
        matriz[1][2] = 13;
        matriz[1][1] = 14;
        matriz[2][1] = 15;
        matriz[2][2] = 16;

        MatrizEspiral matrizEspiral = new MatrizEspiral();
        matrizRetorno = matrizEspiral.retornaEspiralSentidoAntiHorario(4,4);

        Assert.assertArrayEquals(matriz, matrizRetorno);
    }

}