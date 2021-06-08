package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ScoringStepsDeca {

    public static int score;


    @Given("In Decathlon on the event {string} and the result is {double}")
    public void i_the_Decathlon_is_and_the_result_is(String event, Double result) {

        score = CalcScore.scoreDeca(event, result);

    }

    @When("I press sum")
    public void i_press_sum() {
    }

    @Then("My points on the event is {int} points")
    public void my_points_on_the_event_is_points(Integer int1) {
        assertEquals(int1, score);
    }

    @Given("In Heptathlon on the event {string} and the result is {double}")
    public void i_the_Hepathlon_is_and_the_result_is(String event, Double result) {

        score = CalcScore.scoreHepta(event, result);

    }

    @When("I press count")
    public void i_press_count() {
    }

    @Then("My Hepta points on the event is {int} points")
    public void my_points_on_the_event2_is_points(Integer int1)
    {
        assertEquals(int1, score);
    }



    @Given("In {string} have entered {double}")
    public void in_have_entered(String event, double result) {
        score = CalcScore.scoreHepta(event, result);
    }

    @When("The {int} are")
    public void the_are(double points) {

    }

    @Then("The message should be \"\"Your points is zero are you sure that you have entered a correct result?{string}")
    public void the_message_should_be_your_points_is_zero_are_you_sure_that_you_have_entered_a_correct_result(String string) {

    }

    @Then("The message should be \"\"Are you trying to cheat?{string}")
    public void the_message_should_be_are_you_trying_to_cheat(String string) {

    }






}

