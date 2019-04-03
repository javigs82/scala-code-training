package me.javigs82.training

import org.scalatest.FlatSpec


class ArraysSpec extends FlatSpec {

  "Arrays K Complementary" should "return Empty for Null Input" in {
    assert(Arrays.findKcomplementary(null, 5).isEmpty)
  }

  it should "return Empty for Empty Input" in {
    assert(Arrays.findKcomplementary(Array.empty, 5).isEmpty)
  }

  it should "return Empty for Custom Input" in {
    val input = Array(1, 234, 5, 621)
    assert(Arrays.findKcomplementary(input, 5).isEmpty)
  }

  it should "return (1,2) for small Input" in {
    val input = Array(1, 2)
    assert(Arrays.findKcomplementary(input, 3).contains((1, 2)))
  }

  it should "return (1,4)(-1,6) for small Input" in {
    val input = Array(1, 2, -1, 4, 6)
    val result = Arrays.findKcomplementary(input, 5)
    assert(result.contains((1, 4)))
    assert(result.contains((-1, 6)))
  }

  it should "return (2,7)(-1,10)(4,5) for medium Input and repeated elements" in {
    val input = Array(1, 2, -1, 4, 6, 7, 0, 7, 8, 9, 0, 6, 4, 3, 2, 1, 4, 5, 6, 7, 87, 10, 2)
    val result = Arrays.findKcomplementary(input, 9)
    assert(result.contains((2,7)))
    assert(result.contains((-1, 10)))
    assert(result.contains((4, 5)))
  }

}
