object Fibonacci {
  def fib1(n: Long): Long = {
    var previous = 0
    var current  = 1
    var result   = previous
    var i        = 1
    while (i < n) {
      i += 1
      result = previous + current
      previous = current
      current = result
    }

    result
  }

  def fib2(n: Long): Long = {
    if (n > 1) fib2(n - 1) + fib2(n - 2)
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

  def fib(n: Long): Long = {
    @scala.annotation.tailrec
    def iter(previous: Long, current: Long, n: Long): Long =
      if (n <= 0) current
      else iter(current, previous + current, n - 1)

    if (n > 1) iter(1, 1, n - 2) else n
  }
}
