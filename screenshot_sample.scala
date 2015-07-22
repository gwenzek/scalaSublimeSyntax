class Foo {
  def abcαβγ_*^= : Foo[Bar]

  @tailrec
  def abc(a: Int)(implicit b: Boolean) : Int = {
    if(b)
      1
    else
      abc(a - 1)(a < 0)
  }

  def printMessage(foo: Foo, a: Int) =
    println(s"Foo: $foo, n: ${a + 2}")
}
