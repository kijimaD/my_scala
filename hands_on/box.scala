class Box(var x: Int) {
  def update(f: Int => Int) = x = f(x)
  def printMsg(msg: String) = {
    println(msg + x)
  }
}

val b = new Box(1)

b.printMsg("Hello")
b.update(i => i + 5)
b.printMsg("Hello")
b.update(_ + 10)
b.printMsg("Hello")

def increment(i: Int) = i + 1

b.update(increment)
b.update(x => increment(x))
b.update{x => increment(x)}
b.update(increment(_))
b.printMsg("result: ")
