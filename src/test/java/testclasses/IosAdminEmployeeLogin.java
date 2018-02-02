package testclasses;

import org.apache.log4j.PropertyConfigurator;

import pageclasses.IosLoginPage;
import utilities.BaseClass;
import utilities.ConfigFileUtility;

public class IosAdminEmployeeLogin extends BaseClass {
	IosLoginPage login = new IosLoginPage(driver);
	ConfigFileUtility cfru = new ConfigFileUtility();
	public IosAdminEmployeeLogin() {
		PropertyConfigurator.configure("log4j.properties");
	}
	public void adminLogin() throws Exception {
		cfru.loadPropertyFile();
		login.clkAdminBtn(driver);
		login.fillAdminEmailFld(cfru.getProperty("AdmnEmail"), driver);
		login.fillAdminPasswordFld(cfru.getProperty("AdminPassword"), driver);
		login.admnSignInBtn(driver);
	}
	public void employeeLogin() throws Exception {
		cfru.loadPropertyFile();
		login.clkEmployeeBtn(driver);
		login.empHotelIDFill(cfru.getProperty("EmpHotelId"), driver);
		login.fillEmpUserNmaeFld(cfru.getProperty("EmpUserName"), driver);
		login.fillEmpPasswordFld(cfru.getProperty("EmpPassWord"), driver);
		login.empSignInBtn(driver);
		}
}
