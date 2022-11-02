package com.emiCalculator.pom.Testcases;

import com.emiCalculator.pom.BaseTest.EmiCalculatorBaseTest;
import com.emiCalculator.pom.Pages.CompareLoanPage;
import com.emiCalculator.pom.Pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CompareLoanTest extends EmiCalculatorBaseTest {

    CompareLoanPage compareLoanPage;


    @BeforeClass
    public void initialization(){
       compareLoanPage = new HomePage()
               .tapCompareLoan();

    }

    @Test
    public void compareLoanShouldSuccess(){
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(24000)
                .fillInterest1(5)
                .fillPeriod1(14)
                .fillLoanAmount2(35000)
                .fillInterest2(7)
                .fillPeriod2(18)
                .tapBtnCalculate();
    }

    @Test
    public void resetLoanShouldSuccess() {
        compareLoanPage = compareLoanPage
                .fillLoanAmount1(26000)
                .fillInterest1(6)
                .fillPeriod1(11)
                .fillLoanAmount2(42000)
                .fillInterest2(9)
                .fillPeriod2(22)
                .tapBtnCalculate()
                .tapBtnReset();
    }
}
