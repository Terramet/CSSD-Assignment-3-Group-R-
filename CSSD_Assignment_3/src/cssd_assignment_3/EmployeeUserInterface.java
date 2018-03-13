/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssd_assignment_3;

import cssd_assignment_3.Reports.Report;
import cssd_assignment_3.Reports.ReportRegistry;
import java.util.*;

/**
 *
 * @author Ascendant
 */
public class EmployeeUserInterface {
    /*
    
    */
    private String password;
    private String encrpytedPassword;
    private String name;
    private AccountManager manager = null;
    private ReportRegistry rReg = ReportRegistry.getRegistry();
    private Report currentOpenReport = null;

    public EmployeeUserInterface() {
        manager = new AccountManager();
    }
    
    public boolean login(String name, String password) {
        return manager.login(name, password);
    }
    
    public List<Employee> getAccountList() {
        return manager.getAccountList();
    }
    
    public boolean getActiveIsAdmin() {
        return manager.getActiveIsAdmin();
    }
    
    public void saveAccounts() {
        manager.saveAccounts();
    }
    
    public void addUser(Employee e) {
        manager.addUser(e);
    }
    
    public boolean logout(){
        return manager.logout();
    }
    
    public Report getOpenReport(){
        return currentOpenReport;
    }
    
    public void getReport(int type, Date from, Date to){
        currentOpenReport = rReg.getReport(type, from, to);
    }
}
