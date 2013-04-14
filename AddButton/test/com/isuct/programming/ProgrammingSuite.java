/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.isuct.programming;

import org.junit.After;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Пользователь
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.isuct.programming.CalculateEngineTest.class, com.isuct.programming.CalcTest.class, com.isuct.programming.MainGuiTest.class, com.isuct.programming.AddButtonTest.class})
public class ProgrammingSuite {

    @After
    public void tearDown() throws Exception {
    }
    
}
