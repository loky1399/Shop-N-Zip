package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Checkout_stepDef {
public static WebDriver driver=Hooks.driver;
@Given("^I navigated to 'My Items' page$")
public void i_navigated_to_My_Items_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I selected Method of shipment$")
public void i_selected_Method_of_shipment() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I selected an item to ship$")
public void i_selected_an_item_to_ship() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I clicked on 'Ship My Item' button$")
public void i_clicked_on_Ship_My_Item_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected on 'checkout' page\\.$")
public void i_should_be_redirected_on_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see 'COST SUMMARY' section$")
public void i_should_be_able_to_see_COST_SUMMARY_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see 'RECIPIENT' section$")
public void i_should_be_able_to_see_RECIPIENT_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see 'PAYMENT INFO' section$")
public void i_should_be_able_to_see_PAYMENT_INFO_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Method of shipment' with type of method selected$")
public void i_should_see_Method_of_shipment_with_type_of_method_selected() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'shipng to' with city name where it will be shipped to$")
public void i_should_see_shipng_to_with_city_name_where_it_will_be_shipped_to() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Packaging' with type of packaging$")
public void i_should_see_Packaging_with_type_of_packaging() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Weight' with actual shipment weight$")
public void i_should_see_Weight_with_actual_shipment_weight() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Promo code text field' with apply button$")
public void i_should_see_Promo_code_text_field_with_apply_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Subtotal' with value after applying promo code if any$")
public void i_should_see_Subtotal_with_value_after_applying_promo_code_if_any() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Handling fee '$")
public void i_should_see_Handling_fee() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Total' with value after adding handling fee to subtotal$")
public void i_should_see_Total_with_value_after_adding_handling_fee_to_subtotal() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'First Name' field$")
public void i_should_see_First_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Middle Name' field$")
public void i_should_see_Middle_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Last Name' field$")
public void i_should_see_Last_Name_field() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Continue' button$")
public void i_should_see_Continue_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see (\\d+) modes of payment options available with continue buttons\\.\\.$")
public void i_should_be_able_to_see_modes_of_payment_options_available_with_continue_buttons(int arg1, DataTable arg2) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    throw new PendingException();
}



@When("^I clicked on 'Continue' button under card payment method in checkout page\\.$")
public void i_clicked_on_Continue_button_under_card_payment_method_in_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should be able to redirected on payment info page under which I should be able to enter card related details in page\\.$")
public void i_should_be_able_to_redirected_on_payment_info_page_under_which_I_should_be_able_to_enter_card_related_details_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see all entered card details within payment info in page\\.$")
public void i_should_be_able_to_see_all_entered_card_details_within_payment_info_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'EDIT' and 'CHANGE PAYMENT METHOD' options$")
public void i_should_see_EDIT_and_CHANGE_PAYMENT_METHOD_options() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see 'Pay Now' button underneath payment info in page\\.$")
public void i_should_be_able_to_see_Pay_Now_button_underneath_payment_info_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'Continue' button under paypal payment method in checkout page\\.$")
public void i_clicked_on_Continue_button_under_paypal_payment_method_in_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I should be able to redirected on payment info page under which I should be able to enter paypal related details in page\\.$")
public void i_should_be_able_to_redirected_on_payment_info_page_under_which_I_should_be_able_to_enter_paypal_related_details_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see all entered paypal details within payment info in page\\.$")
public void i_should_be_able_to_see_all_entered_paypal_details_within_payment_info_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to see 'CHANGE PAYMENT METHOD' option  with some information in page\\.$")
public void i_should_be_able_to_see_CHANGE_PAYMENT_METHOD_option_with_some_information_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on  'Apply' button$")
public void i_clicked_on_Apply_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^It should ask me that promo code should be entered$")
public void it_should_ask_me_that_promo_code_should_be_entered() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I enter valid 'promo Code'$")
public void i_enter_valid_promo_Code() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see that promo code is successfully applied$")
public void i_should_see_that_promo_code_is_successfully_applied() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'continue' button at reciepens section\\.$")
public void i_clicked_on_continue_button_at_reciepens_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^It should display error message saying fields are mandatory$")
public void it_should_display_error_message_saying_fields_are_mandatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I entered all the mandatory fields under recipient section with valid details$")
public void i_entered_all_the_mandatory_fields_under_recipient_section_with_valid_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^click on Continue button$")
public void click_on_Continue_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see the edit button is appeared after page reload$")
public void i_should_see_the_edit_button_is_appeared_after_page_reload() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on the edit button$")
public void i_click_on_the_edit_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^It should take me back to fields where I can edit the address details$")
public void it_should_take_me_back_to_fields_where_I_can_edit_the_address_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Continue' buttons at Payment Info section are is disabled\\(both paypal and credit card\\)$")
public void i_should_see_Continue_buttons_at_Payment_Info_section_are_is_disabled_both_paypal_and_credit_card() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I given recipient address$")
public void i_given_recipient_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see 'Continue' buttons at Payment Info section are is enabled\\(both paypal and credit card\\)$")
public void i_should_see_Continue_buttons_at_Payment_Info_section_are_is_enabled_both_paypal_and_credit_card() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on 'Continue' button of paypal payment type$")
public void i_click_on_Continue_button_of_paypal_payment_type() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected to paypal payment page$")
public void i_should_be_redirected_to_paypal_payment_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I click on 'Continue' button of pay using credit card payment type$")
public void i_click_on_Continue_button_of_pay_using_credit_card_payment_type() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected to credit card payment page$")
public void i_should_be_redirected_to_credit_card_payment_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'Continue' button under card payment method$")
public void i_clicked_on_Continue_button_under_card_payment_method() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected on payment page$")
public void i_should_be_redirected_on_payment_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'Edit' option\\.$")
public void i_clicked_on_Edit_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected on 'Edit credit card' popup\\.$")
public void i_should_be_redirected_on_Edit_credit_card_popup() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'CHANGE PAYMENT METHOD' option\\.$")
public void i_clicked_on_CHANGE_PAYMENT_METHOD_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be redirected on payment info option in checkout page\\.$")
public void i_should_be_redirected_on_payment_info_option_in_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'Pay Now' button underneath payment info in page\\.$")
public void i_clicked_on_Pay_Now_button_underneath_payment_info_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to redirected on 'Order Confirmation' message \\(page\\)\\.$")
public void i_should_be_able_to_redirected_on_Order_Confirmation_message_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I enter invalid 'promo Code'$")
public void i_enter_invalid_promo_Code() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should see error message saying enter valid Promo code$")
public void i_should_see_error_message_saying_enter_valid_Promo_code() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I provided valid deatails to all fields except First Name$")
public void i_provided_valid_deatails_to_all_fields_except_First_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^It should display error message saying field is mandatory$")
public void it_should_display_error_message_saying_field_is_mandatory() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I provided valid deatails to all fields except Last Name$")
public void i_provided_valid_deatails_to_all_fields_except_Last_Name() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I filled all required details in recipient section\\.$")
public void i_filled_all_required_details_in_recipient_section() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Given("^I clicked on 'continue' button under recipient\\.$")
public void i_clicked_on_continue_button_under_recipient() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@When("^I clicked on 'Change recipient' option below of recipient details in page\\.$")
public void i_clicked_on_Change_recipient_option_below_of_recipient_details_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to redirected to 'Change recipient'  option\\.$")
public void i_should_be_able_to_redirected_to_Change_recipient_option() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

@Then("^I should be able to click on 'Continue' button\\(Button should be enabled\\)\\.$")
public void i_should_be_able_to_click_on_Continue_button_Button_should_be_enabled() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException();
}

}
