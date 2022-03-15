def myLoop(start: Int, end: Int)
  (callback: Int => Unit) = {
  for (i <- Range(start, end)) {
    callback(i)
  }
}

myLoop(start = 5, end = 10) { i =>
  println(s"i has value ${i}")
}
