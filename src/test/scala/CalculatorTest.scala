package uk.co.spanarchian

import org.scalatest.FunSuite

class CalculatorTest extends FunSuite {
  test("Calculator.sum function") {
    assert(Calculator.sum(3) === 6)
  }

  test("CubeCalculator.sqr function") {
    assert(Calculator.sqr(3) === 9)
  }

  test("CubeCalculator.cube function") {
    assert(Calculator.cube(3) === 27)
  }

  test("CubeCalculator.name function") {
    assert(Calculator.name(0) === "Zero")
  }
}
