package com.dhanifudin.skorbola;

import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MainActivityTest {

	@Rule
	public ActivityScenarioRule<MainActivity> mActivityScenarioRule = new ActivityScenarioRule<MainActivity>(MainActivity.class);

	@Test
	public void increaseScoreHomeTest() {
		onView(withId(R.id.btn_increase_home))
			.perform(click());
		onView(withId(R.id.txt_home_score))
			.check(matches(withText("1")));
	}

	@Test
	public void decreaseScoreHomeTest() {
		onView(withId(R.id.btn_increase_home))
			.perform(click());
		onView(withId(R.id.txt_home_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_decrease_home))
			.perform(click());
		onView(withId(R.id.txt_home_score))
			.check(matches(withText("0")));
	}

	@Test
	public void decreaseScoreHomeWhenZeroTest() {
		onView(withId(R.id.btn_increase_home))
			.perform(click());
		onView(withId(R.id.txt_home_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_decrease_home))
			.perform(click());
		onView(withId(R.id.btn_decrease_home))
			.perform(click());
		onView(withId(R.id.txt_home_score))
			.check(matches(withText("0")));
	}

	@Test
	public void increaseScoreAwayTest() {
		onView(withId(R.id.btn_increase_away))
			.perform(click());

		onView(withId(R.id.txt_away_score))
			.check(matches(withText("1")));
	}

	@Test
	public void decreaseScoreAwayTest() {
		onView(withId(R.id.btn_increase_away))
			.perform(click());
		onView(withId(R.id.txt_away_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_decrease_away))
			.perform(click());
		onView(withId(R.id.txt_away_score))
			.check(matches(withText("0")));
	}

	@Test
	public void decreaseScoreAwayWhenZeroTest() {
		onView(withId(R.id.btn_increase_away))
			.perform(click());
		onView(withId(R.id.txt_away_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_decrease_away))
			.perform(click());
		onView(withId(R.id.btn_decrease_away))
			.perform(click());
		onView(withId(R.id.txt_away_score))
			.check(matches(withText("0")));
	}

	@Test
	public void resetScoreTest() {
		onView(withId(R.id.btn_increase_home))
			.perform(click());

		onView(withId(R.id.txt_home_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_increase_away))
			.perform(click());

		onView(withId(R.id.txt_away_score))
			.check(matches(withText("1")));

		onView(withId(R.id.btn_reset))
			.perform(click());

		onView(withId(R.id.txt_home_score))
			.check(matches(withText("0")));

		onView(withId(R.id.txt_away_score))
			.check(matches(withText("0")));

	}
}
