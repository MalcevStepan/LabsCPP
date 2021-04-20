package labsKPP.services;

import labsKPP.classFields.PrimeFields;
import org.junit.Assert;
import org.junit.Test;


public class PrimeServiceTest {

    @Test
    public void calculatePrimeCheck() {
        PrimeService primeService = new PrimeService();
        PrimeFields correctAnswer = primeService.calculatePrimeCheck(13);
        Assert.assertEquals("No", correctAnswer.getEvenValueAnswer());
        Assert.assertEquals("Yes", correctAnswer.getSimpleValueAnswer());
    }
}