package uk.co.spanarchian

object Calculator extends App {
  def sum(x: Int): Int = {
    var y:Int = x+x
    return y
  }
  def sqr(x: Int) = {
    x * x
  }

  def cube(x: Int) = {
    x * x * x
  }

  def name(x: Int): String = {
    var numNames = Array("Zero", "One","Two","Three","Four")
    val name = numNames(x)
    return name
  }

}