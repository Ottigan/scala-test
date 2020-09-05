import minitest._

object PredicatesTest extends SimpleTestSuite {
  test("Comparing 3 evens") {
    assertEquals(Predicates.forThree(4, 2, 12, Predicates.isEven4), true)
  }
  test("Comparing 2 evens and 1 odd") {
    assertEquals(Predicates.forThree(4, 5, 12, Predicates.isEven4), false)
  }
  test("Comparing 1 even and 2 odds") {
    assertEquals(Predicates.forThree(4, 5, 12, Predicates.isEven4), false)
  }
  test("Comparing 3 odds") {
    assertEquals(Predicates.forThree(4, 5, 12, Predicates.isEven4), false)
  }
}
