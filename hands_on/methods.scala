def printHello(times: Int) = {
  println("hello" + times)
}

printHello(1)

printHello(times = 2)

// printHello("1") // error

def hello(i: Int = 0) = {
  "hello " + i
}

hello(1)
println(hello(1))

val helloHello = hello(123) + " " + hello(456)

println(helloHello)
println(helloHello.reverse)
