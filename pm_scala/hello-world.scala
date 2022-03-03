object Upper {
  def main(args: Array[String]) = {
    args.map(_.toUpperCase()).foreach(printf("%s ",_))
    println("")
  }
}

Upper.main(Array("Hello", "World"))

// scala hello-world.scala
