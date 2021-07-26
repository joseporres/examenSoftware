
package com.examen;
import java.util.*;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
    //login
    @Test
    public void loginCorrect() throws IOException
    {
        Login user = new User("Joseporres", "serropesoJ");
        Assert.assertTrue(user.login());
        Assert.assertTrue(user.logout());
    }

    @Test
    public void loginFail() throws IOException
    {
        User user = new User("Joseporres", "jo");
        Assert.assertFalse(user.login());
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
