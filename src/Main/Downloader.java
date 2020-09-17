/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Gui
 */
public class Downloader{

    /**
     *
     * @param i
     * @param a
     * @throws IOException
     */
    public void down(String c, String u, String cam) throws IOException {
        URL url = new URL("https://capas.livreiros.com.br/9788522125142.jpg");
        String teste = "teste";
        File file = new File("C:\\Users\\Gui\\Pictures\\"+ teste+".png");

        FileUtils.copyURLToFile(url, file);

    }
}
