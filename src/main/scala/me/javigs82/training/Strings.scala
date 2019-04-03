package me.javigs82.training

object Strings {

  def isPalindrome(s: String): Boolean = {
    if (s.isEmpty || s.length == 1)
      return false

    for ( i <- 0 to (s.length / 2)) {
      if (s(i) != s(s.length - i - 1))
        return false
    }

    true
  }

}
