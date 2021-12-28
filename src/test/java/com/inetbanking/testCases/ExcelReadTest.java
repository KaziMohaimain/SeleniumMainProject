package com.inetbanking.testCases;

import com.inetbanking.utilities.XLUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class ExcelReadTest {

    @Test
    public void test() {
        String s = XLUtils.getCellData("src/test/java/com/inetbanking/testData/FieldEntryData.xlsx","Sheet1",2,2);
        System.out.println(s);
    }
}
