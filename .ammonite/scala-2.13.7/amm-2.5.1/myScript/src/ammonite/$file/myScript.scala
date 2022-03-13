
package ammonite
package $file
import _root_.ammonite.interp.api.InterpBridge.{
  value => interp
}
import _root_.ammonite.interp.api.InterpBridge.value.{
  exit,
  scalaVersion
}
import _root_.ammonite.interp.api.IvyConstructor.{
  ArtifactIdExt,
  GroupIdExt
}
import _root_.ammonite.compiler.CompilerExtensions.{
  CompilerInterpAPIExtensions,
  CompilerReplAPIExtensions
}
import _root_.ammonite.runtime.tools.{
  browse,
  grep,
  time,
  tail
}
import _root_.ammonite.compiler.tools.{
  desugar,
  source
}
import _root_.mainargs.{
  arg,
  main
}
import _root_.ammonite.repl.tools.Util.{
  PathRead
}


object myScript{
/*<script>*//*<amm>*/val res_0 = /*</amm>*/println(1 + 1)
/*<amm>*/val res_1 = /*</amm>*/println("hello" + " " + "world")
/*<amm>*/val res_2 = /*</amm>*/println(List("I", "am", "cow"))

// amm myScript.sc
/*</script>*/ /*<generated>*/
def $main() = { scala.Iterator[String]() }
  override def toString = "myScript"
  /*</generated>*/
}
