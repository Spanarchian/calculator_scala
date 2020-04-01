package uk.co.spanarchian

import org.scalatest.FeatureSpec
import org.scalatest.GivenWhenThen

class CalculatorSpecs extends FeatureSpec with GivenWhenThen {
  feature("Calculator performs calculations") {
    scenario("The Calculater can Square a number") {
      Given(s"""the calculate is active""")
      val numr = 3
      When(s"the user requests the square of $numr")
      val resultcalc = Calculator.sqr(numr)
      val expected = 9
      Then(s"the Account Holder should be shown $expected")
      assert(expected.equals(resultcalc))
    }

    scenario("The Calculater can cube") {
      Given(s"""the calculate is active""")
      val numr = 3
      When(s"the user requests the cube of $numr")
      val resultcalc = Calculator.cube(numr)
      val expected = 27
      Then(s"the Account Holder should be shown $expected")
      assert(expected.equals(resultcalc))
    }

    scenario("The Calculater can get the name of a number") {
      Given(s"""the calculate is active""")
      val numr = 3
      When(s"the user requests the name of $numr")
      val resultcalc = Calculator.name(numr)
      val expected = "Three"
      Then(s"the Account Holder should be shown $expected")
      assert(expected.equals(resultcalc))
    }
  }
}