package config;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Arquivo {

    static BufferedReader leitor = null;
    DadosArquivo dadosArquivo = new DadosArquivo();

    public static boolean abreArquivo(String arquivo) {
        try {
            leitor = new BufferedReader(new FileReader(new File(arquivo)));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean fechaArquivo() {
        try {
            leitor.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public DadosArquivo leArquivo(String arquivo, int tipoArquivo) {
        if (tipoArquivo == 1) {
            return leDadosArquivo(arquivo);
        } else if (tipoArquivo == 2) {
            return leDadosArquivo(arquivo);
        }
        return null;
    }

    public DadosArquivo leDadosArquivo(String arquivo) {
        try {
            if (abreArquivo(arquivo)) {
                String linha = leitor.readLine();
                if (linha.equalsIgnoreCase("[Parametros]")) {
                    linha = leitor.readLine();
                    String[] result = null;
                    while (linha != null) {
                        result = linha.split("=");
                        linha = leitor.readLine();
                    }
                    dadosArquivo.setFonteDados(Integer.parseInt(result[1]));

                } else if (linha.equalsIgnoreCase("[Configuracao]")) {
                    linha = leitor.readLine();
                    String[] result = null;
                    while (linha != null) {
                        result = linha.split("=");
                        if (result[0].equalsIgnoreCase("usuario")) {
                            dadosArquivo.setUsuario(result[1]);
                        } else if (result[0].equalsIgnoreCase("senha")) {
                            dadosArquivo.setSenha(result[1]);
                        } else if (result[0].equalsIgnoreCase("driver")) {
                            dadosArquivo.setDriver(result[1]);
                        } else if (result[0].equalsIgnoreCase("url")) {
                            dadosArquivo.setUrl(result[1]);
                        }
                        linha = leitor.readLine();
                    }
                }
            }
        } catch (Exception e) {
        }
        return dadosArquivo;
    }

}
