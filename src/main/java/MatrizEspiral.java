import java.util.HashMap;
import java.util.Map;

public class MatrizEspiral {

    public static final String BAIXO = "baixo";
    public static final String ESQUERDA = "esquerda";
    public static final String CIMA = "cima";
    public static final String DIREITA = "direita";

    public int[][] retornaEspiralSentidoHorario(int linhas, int colunas) {

        Map<String, String> proximaDirecao = new HashMap<>();
        int linhaInicial = 0;
        int colunaInicial = 0;

        proximaDirecao.put(DIREITA,BAIXO);
        proximaDirecao.put(BAIXO,ESQUERDA);
        proximaDirecao.put(ESQUERDA,CIMA);
        proximaDirecao.put(CIMA,DIREITA);

        String direcaoInicial = DIREITA;

        return getMatrizEspiral(linhas, colunas, linhaInicial, colunaInicial, proximaDirecao, direcaoInicial);
    }

    public int[][] retornaEspiralSentidoAntiHorario(int linhas, int colunas) {

        Map<String, String> proximaDirecao = new HashMap<>();
        int linhaInicial = 0;
        int colunaInicial = colunas-1;

        proximaDirecao.put(BAIXO,DIREITA);
        proximaDirecao.put(DIREITA,CIMA);
        proximaDirecao.put(CIMA, ESQUERDA);
        proximaDirecao.put(ESQUERDA,BAIXO);

        String direcaoInicial = ESQUERDA;

        return getMatrizEspiral(linhas, colunas, linhaInicial, colunaInicial, proximaDirecao, direcaoInicial);
    }

    private int[][] getMatrizEspiral(int linhas, int colunas, int linhaInicial, int colunaInicial, Map<String, String> proximaDirecao, String direcaoAtual) {
        int[][] matriz = new int[linhas][colunas];
        int tamanhoMatriz = linhas * colunas;
        int linha = linhaInicial;
        int coluna = colunaInicial;

        for (int i = 1; i <= tamanhoMatriz; i++) {

            matriz[linha][coluna] = i;

            direcaoAtual = getProximaDirecao(linhas, colunas, matriz, coluna, linha, proximaDirecao, direcaoAtual);

            switch (direcaoAtual) {
                case DIREITA:
                    coluna++;
                    break;
                case BAIXO:
                    linha++;
                    break;
                case ESQUERDA:
                    coluna--;
                    break;
                case CIMA:
                    linha--;
                    break;
            }
        }
        return matriz;
    }

    private String getProximaDirecao(int linhas, int colunas, int[][] matriz, int coluna, int linha, Map<String, String> proximaDirecao, String direcaoAtual) {
        switch (direcaoAtual) {
            case DIREITA:
                if ((coluna + 1 == colunas) || (matriz[linha][coluna + 1] > 0))
                    direcaoAtual = proximaDirecao.get(direcaoAtual);
                break;
            case BAIXO:
                if ((linha + 1 == linhas) || (matriz[linha + 1][coluna] > 0))
                    direcaoAtual = proximaDirecao.get(direcaoAtual);
                break;
            case ESQUERDA:
                if ((coluna ==0 ) || (matriz[linha][coluna - 1] > 0))
                    direcaoAtual = proximaDirecao.get(direcaoAtual);
                break;
            case CIMA:
                if ((linha  == 0) || (matriz[linha - 1][coluna] > 0))
                    direcaoAtual = proximaDirecao.get(direcaoAtual);
                break;
        }
        return direcaoAtual;
    }
}