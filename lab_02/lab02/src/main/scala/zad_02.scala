package lab01

/*
  Funkcja „obramuj” „zdefiniowana” poniżej wykorzystuje dwa parametry
    - „napis” potencjalnie może mieć kilka linijek (patrz przykład)
    - „znak”, z którego należy zbudować ramkę
*/
def obramuj(napis: String, znak: Char): String = {
  // definiujemy funkcję obramowującą
  val splited = napis.split("\n")
  val max_len = splited.map(_.length).max
  val wynik = s"${znak.toString * (max_len + 4)}\n" +
    splited.map(x -> s"$znak ${x.padTo(max_len, ' ')")
}

@main def zad_02: Unit = {
  val wynik = obramuj("ala\nma\nkota", '*')
  println(wynik)
  /*
    Efektem powino być coś podobnego do:

    ********
    * ala  *
    * ma   *
    * kota *
    ********

  */
}
