package appCommonClasses;


import com.nitara.Helper.GenerateRandomData;

import com.nitara.PageObjects.BCS_AddBCSPage;
import com.nitara.PageObjects.BCS_ViewBCSPage;
import com.nitara.PageObjects.Breeding_ActivityListPage;
import com.nitara.PageObjects.Breeding_AddCalvingPage;
import com.nitara.PageObjects.Breeding_AddDryPeriodPage;
import com.nitara.PageObjects.Breeding_AddHeatPage;
import com.nitara.PageObjects.Breeding_AddPDPage;
import com.nitara.PageObjects.Breeding_ArtificialInseminationPage;
import com.nitara.PageObjects.Breeding_NaturalInseminationPage;
import com.nitara.PageObjects.Breeding_SuccessPage;
import com.nitara.PageObjects.Breeding_TimelinePage;
import com.nitara.PageObjects.CattleProfilePage;
import com.nitara.PageObjects.CattleProfile_EditPage;
import com.nitara.PageObjects.CattleProfile_RemovePage;
import com.nitara.PageObjects.ChangeHousing;
import com.nitara.PageObjects.ChooseLanguagePage;
import com.nitara.PageObjects.CreateAccount_SuccessPage;
import com.nitara.PageObjects.CreatePasswordPage;
import com.nitara.PageObjects.EnterOTPpage;
import com.nitara.PageObjects.EnterPhoneNoPage;
import com.nitara.PageObjects.EnterPinPage;
import com.nitara.PageObjects.Disease_PredictorPage;
import com.nitara.PageObjects.EnterUsername;
import com.nitara.PageObjects.Farmer_HomePage;
import com.nitara.PageObjects.Health_ActivityListPage;
import com.nitara.PageObjects.Health_AddDewormingPage;
import com.nitara.PageObjects.Health_AddTreatmentPage;
import com.nitara.PageObjects.Health_AddVaccinationPage;
import com.nitara.PageObjects.Health_EditFollowUpPage;
import com.nitara.PageObjects.Health_SuccessPage;
import com.nitara.PageObjects.Health_TreatmentSymptomsPage;
import com.nitara.PageObjects.Health_ViewDewormingPage;
import com.nitara.PageObjects.Health_ViewTreatmentPage;
import com.nitara.PageObjects.Health_ViewVaccinationPage;
import com.nitara.PageObjects.Milking_RecordCattleMilkingPage;
import com.nitara.PageObjects.Milking_RecordCattleMilkingSuccessPage;
import com.nitara.PageObjects.Milking_RecordFarmMilkingPage;
import com.nitara.PageObjects.Milking_RecordFarmMilkingSuccessPage;
import com.nitara.PageObjects.MoveCattle_Successpage;
import com.nitara.PageObjects.RegisterCattle_BullPage;
import com.nitara.PageObjects.RegisterCattle_CalfPage;
import com.nitara.PageObjects.RegisterCattle_CattleTypePage;
import com.nitara.PageObjects.RegisterCattle_InseminatedHeiferPage;
import com.nitara.PageObjects.RegisterCattle_MilkingCattlePage;
import com.nitara.PageObjects.RegisterCattle_SuccessPage;
import com.nitara.PageObjects.SearchCattle_CattleListPage;
import com.nitara.PageObjects.SettingsPage;
import com.nitara.PageObjects.Settings_MilkingPrefUpdateSuccessPage;
import com.nitara.PageObjects.Settings_MilkingPreferencePage;
import com.nitara.PageObjects.Weight_AddWeightPage;
import com.nitara.PageObjects.Weight_SuccessPage;
import com.nitara.PageObjects.Weight_ViewPage;



public class PageInitialiser{

	protected static Farmer_HomePage farmerHomePage;
	protected static SearchCattle_CattleListPage searchCattlePage;
	protected static Health_ActivityListPage healthActivityListPage;
	protected static Health_SuccessPage healthRecordSuccessPage;
	protected static Health_AddVaccinationPage addVaccinationPage;
	protected static Health_AddDewormingPage addDewormingPage;
	protected static Health_AddTreatmentPage addTreatmentPage;
	protected static Health_TreatmentSymptomsPage diseaseSymptoms;
	protected static CattleProfilePage cattleProfilePage;
	protected static Health_ViewDewormingPage viewDewormingPage;
	protected static Health_ViewVaccinationPage viewVaccinationPage;
	protected static Health_ViewTreatmentPage viewTreatmentPage;
	protected static CattleProfile_EditPage editCattleProfilePage;
	protected static GenerateRandomData generateRandomData;
	protected static RegisterCattle_BullPage registerCattleBullPage;
	protected static RegisterCattle_SuccessPage registerCattleSuccessPage;
	protected static RegisterCattle_CalfPage registerCattleCalfPage;
	protected static RegisterCattle_InseminatedHeiferPage registerCattleInseminatedHeiferPage;
	protected static RegisterCattle_MilkingCattlePage registerMilkingCattlePage;
	protected static CattleProfile_RemovePage removeCattlePage;
	protected static Breeding_ActivityListPage breedingActivityListPage;
	protected static Breeding_ArtificialInseminationPage addAIPage;
	protected static Breeding_NaturalInseminationPage addNIPage;
	protected static Breeding_SuccessPage breedingSuccessPage;
	protected static Helper_AppNavigation helper_AppNavigation;
	protected static Breeding_AddPDPage addPDPage;
	protected static HelperFunctions helperFunctions;
	protected static Breeding_AddCalvingPage addCalvingPage;
	protected static Breeding_AddDryPeriodPage addDryPeriodPage;
	protected static Breeding_AddHeatPage addHeatPage;
	protected static Breeding_TimelinePage breedingTimelinePage;
	protected static EnterUsername enterUsername;
	protected static Weight_AddWeightPage addWeightPage;
	protected static Weight_SuccessPage weightSuccessPage;
	protected static Weight_ViewPage weightViewPage;
	protected static SettingsPage settingsPage;
	protected static Settings_MilkingPreferencePage milkingPrefPage;
	protected static Settings_MilkingPrefUpdateSuccessPage milkingPrefSuccessPage;
	protected static Health_EditFollowUpPage editFollowUpPage;
	protected static EnterPhoneNoPage enterPhoneNoPage;
	protected static EnterOTPpage enterOTPpage;
	protected static CreatePasswordPage createPasswordPage;
	protected static CreateAccount_SuccessPage createAccountSuccessPage;
	protected static EnterPinPage enterPinPage;
	protected static BCS_ViewBCSPage viewbcspage;
	protected static BCS_AddBCSPage addbcsPage;
	protected static Disease_PredictorPage diseasepredictorpage;
	protected static RegisterCattle_CattleTypePage cattleTypePage;
	protected static ChooseLanguagePage chooseLanguagePage;
	protected static ChangeHousing  changehousing;
	protected static MoveCattle_Successpage movecattlesuccesspage;
	protected static Milking_RecordCattleMilkingPage cattleMilkingPage;
	protected static Milking_RecordCattleMilkingSuccessPage cattleMilkingSuccessPage;
	protected static Milking_RecordFarmMilkingPage farmMilkingPage;
	protected static Milking_RecordFarmMilkingSuccessPage farmMilkingSuccessPage;
	
	public static void initializeAllPages() {

		// create instances of all pages and assign them to the variables
		farmerHomePage = new Farmer_HomePage();
		searchCattlePage = new SearchCattle_CattleListPage();
		healthActivityListPage = new Health_ActivityListPage();
		healthRecordSuccessPage = new Health_SuccessPage();
		addVaccinationPage = new Health_AddVaccinationPage();
		addDewormingPage = new Health_AddDewormingPage();
		addTreatmentPage = new Health_AddTreatmentPage();
		diseaseSymptoms = new Health_TreatmentSymptomsPage();
		cattleProfilePage = new CattleProfilePage();
		viewDewormingPage = new Health_ViewDewormingPage();
		viewVaccinationPage = new Health_ViewVaccinationPage();
		viewTreatmentPage = new Health_ViewTreatmentPage();
		editCattleProfilePage = new CattleProfile_EditPage();
		generateRandomData = new GenerateRandomData();
		registerCattleBullPage = new RegisterCattle_BullPage();
		registerCattleSuccessPage = new RegisterCattle_SuccessPage();
		registerCattleCalfPage = new RegisterCattle_CalfPage();
		registerCattleInseminatedHeiferPage = new RegisterCattle_InseminatedHeiferPage();
		registerMilkingCattlePage = new RegisterCattle_MilkingCattlePage();
		removeCattlePage = new CattleProfile_RemovePage();
		breedingActivityListPage = new Breeding_ActivityListPage();
		addAIPage = new Breeding_ArtificialInseminationPage();
		addNIPage = new Breeding_NaturalInseminationPage();
		breedingSuccessPage = new Breeding_SuccessPage();
		helper_AppNavigation = new Helper_AppNavigation();
		addPDPage = new Breeding_AddPDPage();
		addCalvingPage = new Breeding_AddCalvingPage();
		addDryPeriodPage = new Breeding_AddDryPeriodPage();
		addHeatPage = new Breeding_AddHeatPage();
		breedingTimelinePage = new Breeding_TimelinePage();
		addWeightPage = new Weight_AddWeightPage();
		weightViewPage = new Weight_ViewPage();
		weightSuccessPage = new Weight_SuccessPage();
		addbcsPage = new BCS_AddBCSPage();
		viewbcspage =new BCS_ViewBCSPage();
		diseasepredictorpage = new  Disease_PredictorPage();
		editFollowUpPage = new Health_EditFollowUpPage();
		enterPhoneNoPage = new EnterPhoneNoPage();
		enterOTPpage = new EnterOTPpage();
		createPasswordPage = new CreatePasswordPage();
		enterUsername = new EnterUsername();
		createAccountSuccessPage= new CreateAccount_SuccessPage();
		enterPinPage= new EnterPinPage();
		cattleTypePage = new RegisterCattle_CattleTypePage();
		chooseLanguagePage = new ChooseLanguagePage();
		changehousing = new ChangeHousing();		
		movecattlesuccesspage = new MoveCattle_Successpage(); 
		settingsPage = new SettingsPage();
		milkingPrefPage = new Settings_MilkingPreferencePage();
		milkingPrefSuccessPage = new Settings_MilkingPrefUpdateSuccessPage();
		cattleMilkingPage = new Milking_RecordCattleMilkingPage();
		cattleMilkingSuccessPage = new Milking_RecordCattleMilkingSuccessPage();
		farmMilkingPage = new Milking_RecordFarmMilkingPage();
		farmMilkingSuccessPage = new Milking_RecordFarmMilkingSuccessPage();
		helperFunctions = new HelperFunctions();

	}

}
