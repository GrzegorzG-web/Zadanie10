package com.kurs.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.concurrent.CompletionService;

public class Zad10KatalonTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver",
                "src/main/resources/geckodriver");

        // Uruchom nowy egzemplarz przeglądarki FF
        driver = new FirefoxDriver();

        // Zmaksymalizuj okno przeglądarki
        driver.manage().window().maximize();
        // Przejdź do Google
        driver.get("https://katalon-test.s3.amazonaws.com/demo-aut/dist/html/form.html");
    }

    @Test
    public void testKatalonSearch() {

        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement firstname = driver.findElement(By.id("first-name"));
        // Wyczyść tekst zapisany w elemencie
        firstname.clear();
        // Wpisz informacje do wyszukania
        firstname.sendKeys("Karol");


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement lastname = driver.findElement(By.id("last-name"));
        // Wyczyść tekst zapisany w elemencie
        lastname.clear();
        // Wpisz informacje do wyszukania
        lastname.sendKeys("Kowalski");


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement gender = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div/div/label[1]/input"));
        gender.click();


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement dob = driver.findElement(By.id("dob"));
        // Wyczyść tekst zapisany w elemencie
        dob.clear();

        // Wpisz informacje do wyszukania
        dob.sendKeys("05/22/2010");


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement address = driver.findElement(By.id("address"));
        // Wyczyść tekst  zapisany w elemencie
        address.clear();

        // Wpisz informacje do wyszukania

        address.sendKeys("Prosta 51");


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement email = driver.findElement(By.id("email"));
        // Wyczyść tekst  zapisany w elemencie
        email.clear();

        // Wpisz informacje do wyszukania

        email.sendKeys("karol.kowalski@mailinator.com");

        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement password = driver.findElement(By.id("password"));
        // Wyczyść tekst  zapisany w elemencie
        password.clear();

        // Wpisz informacje do wyszukania

        password.sendKeys("Pass123");


        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement company = driver.findElement(By.id("company"));
        // Wyczyść teskst zapisany w elemencie
        company.clear();


        // Wpisz informacje do wyszukania
        company.sendKeys("Coders Lab");

        // Select QA
        WebElement role = driver.findElement(By.id("role"));
        Select roleSelect = new Select(role);
        roleSelect.selectByVisibleText("QA");

        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement comment = driver.findElement(By.id("comment"));
        // Wyczyść tekst  zapisany w elemencie
        comment.clear();

        // Wpisz informacje do wyszukania
        comment.sendKeys("To jest mój pierwszy automat testowy");



        // Znajdź element wprowadzania tekstu na podstawie jego nazwy
        WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
        submit.click();

    }

    @After
    public void tearDown(){
        // Zamknij przeglądarkę
        driver.quit();
    }

}
