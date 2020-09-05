object Predicates {
  val isEven: (Int) => Boolean       = (x: Int) => x % 2 == 0
  val isEven2: Int => Boolean        = _ % 2 == 0
  val isEven3: Int => Boolean        = x => x % 2 == 0
  val isEven4                        = (x: Int) => x % 2 == 0
  val areEven: (Int, Int) => Boolean = (x, y) => isEven(x) && isEven(y)

  def forBoth(x: Int, y: Int, cond: Int => Boolean): Boolean =
    cond(x) && cond(y)

  def forThree(x: Int, y: Int, z: Int, cond: Int => Boolean): Boolean =
    cond(x) && cond(y) && cond(z)
}
