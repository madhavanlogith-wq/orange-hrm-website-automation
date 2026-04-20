package com.orangehrm.seleniumuiframwork_genricutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.orangehrm.testing.objectrepository.pages.*;


public class Pages {

    public LoginPage loginpage;
    public DashbordPage dashboardpage;
    public ApplyPage apply;
    public LeaveListPage leavelist;
    public AddEntitlementsPage addentitlement;
    public LeavePage leavepage;
    public LeavePeriodPage leaveperiod;
    public MyLeavePage myleave;
    public MyLeaveReportPage myleavereport;
    public AssginLeavePage assignLeave;
    public CandidatePage cp;
    public VacancyPage vp;
    public RecruitmentPage rp;

    public My_Claims myclaims;
    public Submit_Claim submit_claim;
    public Attendance attendance;
    public Project_Info project_info;
    public Reports reports;
    public Post post;

    // 🔥 Constructor
    public Pages(WebDriver driver) {

        loginpage = PageFactory.initElements(driver, LoginPage.class);
        dashboardpage = PageFactory.initElements(driver, DashbordPage.class);
        apply = PageFactory.initElements(driver, ApplyPage.class);
        leavelist = PageFactory.initElements(driver, LeaveListPage.class);
        addentitlement = PageFactory.initElements(driver, AddEntitlementsPage.class);
        leavepage = PageFactory.initElements(driver, LeavePage.class);
        leaveperiod = PageFactory.initElements(driver, LeavePeriodPage.class);
        myleave = PageFactory.initElements(driver, MyLeavePage.class);
        myleavereport = PageFactory.initElements(driver, MyLeaveReportPage.class);
        assignLeave = PageFactory.initElements(driver, AssginLeavePage.class);

        cp = PageFactory.initElements(driver, CandidatePage.class);
        vp = PageFactory.initElements(driver, VacancyPage.class);
        rp = PageFactory.initElements(driver, RecruitmentPage.class);

        // 🔥 MISSING ONES (FIXED)
        myclaims = PageFactory.initElements(driver, My_Claims.class);
        submit_claim = PageFactory.initElements(driver, Submit_Claim.class);
        attendance = PageFactory.initElements(driver, Attendance.class);
        project_info = PageFactory.initElements(driver, Project_Info.class);
        reports = PageFactory.initElements(driver, Reports.class);
        post = PageFactory.initElements(driver, Post.class);
    }
}