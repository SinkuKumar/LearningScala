//> using scala 3.6.2
//> using dep "com.lihaoyi::os-lib:0.10.7"

@main
def countFiles(): Unit =
  val paths = os.list(os.pwd)
  println(paths.length)
// scala run hello_deps.scala
// Output: Number of files/folder in the current directory