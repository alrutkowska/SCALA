package lab01

def jestPierwsza(n: Int): Boolean = {
  require(n >= 2)
  var counter = 0
  val aRange1 = 1 to n
  for { i <- aRange1 } if n%i == 0 then counter = counter + 1


  // „trzy znaki zapytania” oznaczają wartość
  // (jeszcze) „niezdefiniowaną” – wygodne na
  // wstępnym etapie implementacji, kiedy
  // nie wszystkie elementy programu mamy już
  // „w ręku”…

  // Gdyby ktoś chciał wykor zystać funkcję „pomocniczą”
  // to może ją zdefiniować wewnątrz „jestPierwsza”, np.

  if counter == 2 then true else false

  // „ostatnie napotkane” wyrażenie zwracane jest jako wynik
  // działania funkcji – np.
}

@main def zad_01: Unit = {
  print("Podaj liczbę naturalną: ")
  val liczba = io.StdIn.readInt()
  val wynik = if jestPierwsza(liczba) then "" else " nie"
  println(s"Liczba $liczba$wynik jest liczbą pierwszą")
}
