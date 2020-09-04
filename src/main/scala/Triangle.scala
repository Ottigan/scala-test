object Triangle {
  def triangleArea(a: Int, b: Int, c: Int): Double = {
    val s = (a + b + c) / 2.0
    Math.sqrt(s * (s - a) * (s - b) * (s - c))
  }
}
