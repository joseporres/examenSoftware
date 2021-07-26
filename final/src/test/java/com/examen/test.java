
package com.examen;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.examen.loginController;

public class test {
    //login
    @Test
    public void loginCorrect() throws IOException
    {
        loginController login = new loginController();
        Assert.assertTrue(login.login("Joseporres", "serropesoJ"));
        Assert.assertTrue(login.logout("Joseporres", "serropesoJ"));
    }

    @Test
    public void loginFail() throws IOException
    {
        loginController login = new loginController();
        Assert.assertFalse(login.login("Joseporres", "jo"));
    }

    //centros
    @Test
    public void centro() throws IOException
    {
        Centros centros = new Centros();
        for(int i = 1; i < 51; i++){
            Assert.assertTrue(centros.darDeAltaId(i));
            Assert.assertTrue(centros.darDeBajaId(i));
        }
        
    }

    
    
}
