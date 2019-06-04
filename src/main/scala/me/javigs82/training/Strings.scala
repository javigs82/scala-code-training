package me.javigs82.training

object Strings {

  def isPalindrome(s: String): Boolean = {

    for ( i <- 0 until (s.length / 2)) {
      if (s(i) != s(s.length - i - 1))
        return false
    }

    true
  }

}
