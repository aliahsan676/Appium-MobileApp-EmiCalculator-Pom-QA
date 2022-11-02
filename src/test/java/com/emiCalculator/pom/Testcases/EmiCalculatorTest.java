package com.emiCalculator.pom.Testcases;

import com.emiCalculator.pom.BaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.Pages.EmiCalculatorPage;
import com.emiCalculator.pom.Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EmiCalculatorTest extends EmiCalculatorBaseTest {

    EmiCalculatorPage emiCalculatorPage;

    @BeforeClass
    public void initialization(){
        emiCalculatorPage = new HomePage()
                .tapEmiCalculator();
    }

    @Test
    public void calculateEmiShouldSucceed(){
        emiCalculatorPage = emiCalculatorPage
                .fillLoanAmount(45000)
                .fillInterest(7)
                .fillYear(1)
                .fillMonths(4)
                .fillProcessingFee(3)
                .tapBtnCalculate()
                .tapDetail()
                .tapMenuBack();
    }

    @Test
    public void resetEmiShouldSucceed(){
        emiCalculatorPage = emiCalculatorPage
                .fillLoanAmount(63000)
                .fillInterest(5)
                .fillYear(2)
                .fillMonths(8)
                .fillProcessingFee(2)
                .tapBtnCalculate()
                .tapDetail()
                .tapMenuBack()
                .tapBtnReset();
    }



}
