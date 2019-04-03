package me.javigs82.training

import org.scalatest.FlatSpec


class StringsSpec extends FlatSpec {

  "Strings Palindrome" should "returns true for small even strings" in {
    assert(Strings.isPalindrome("peep"))
  }

  it should "return true for small odd strings" in {
    assert(Strings.isPalindrome("peaep"))
  }

  it should "return true for medium even strings" in {
    assert(Strings.isPalindrome("1234567890987654321"))
  }

  it should "return true for medium odd strings" in {
    assert(Strings.isPalindrome("113456788887654311"))
  }

  it should "return false for small even strings" in {
    assert(!Strings.isPalindrome("paco"))
  }

  it should "return false for small odd strings" in {
    assert(!Strings.isPalindrome("peepa"))
  }

  it should "return false for empty input" in {
    assert(!Strings.isPalindrome(""))
  }

  it should "return false for input length equals 1" in {
    assert(!Strings.isPalindrome("a"))
  }

}
