package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 140;
        double expected = 2.0;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert180RblThen2Point57Euro() {
        int in = 180;
        double expected = 2.57;
        double out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert140RblThen2Point33Dollar() {
        int in = 140;
        double expected = 2.33;
        double out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert140RblThen20014Point4Uzs() {
        int in = 140;
        double expected = 20014.4;
        double out = Converter.rubleToUzs(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert140EuroThen9800Ruble() {
        int in = 140;
        double expected = 9800;
        double out = Converter.euroToRuble(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert140DollarThen8400Ruble() {
        int in = 140;
        double expected = 8400;
        double out = Converter.dollarToRuble(in);
        Assert.assertEquals(expected, out, 0.1);
    }

    @Test
    public void whenConvert140UzsThen0Point98Ruble() {
        int in = 140;
        double expected = 0.98;
        double out = Converter.uzsToRuble(in);
        Assert.assertEquals(expected, out, 0.1);
    }
}
