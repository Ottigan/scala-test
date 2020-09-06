object Factorial {
  def factorial1(n: Long): Long = {
    if (n == 1) n
    else factorial1(n - 1) * n
  }

  def factorial(n: Long): Long = {
    @scala.annotation.tailrec
    def iterator(curr: Long, n: Long): Long = {
      if (n > 1) iterator(curr * n, n - 1)
      else curr
    }

    if (n > 1) iterator(n, n - 1)
    else n
  }

  def timed(f: Long => Long): Long => Long = x => {
    val start   = System.nanoTime
    val result  = f(x)
    val end     = System.nanoTime
    val elapsed = (end - start) / 1000000.0
    println("Elapsed time: " + elapsed + " milliseconds")
    result
  }
}
