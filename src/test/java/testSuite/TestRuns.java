package testSuite;

import helpers.TestSettings;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;

public class TestRuns {

    public TestSettings settings = new TestSettings();

    @Before
    public void testStart(){
        settings.start();
    }

    @Test
    public void checkAddProductToBacketTest(){
        String nameProduct = "Файловый обмен";
        ArrayList<String> addedProduct = settings.settingsTestAddProduct(nameProduct);
        assertThat(addedProduct.size(),  equalTo(1));
        assertThat(addedProduct.get(0), equalTo(nameProduct));
    }

    @After
    public void testStop(){
        settings.stop();
    }
}
