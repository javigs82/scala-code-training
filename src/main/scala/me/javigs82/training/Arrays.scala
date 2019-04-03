package me.javigs82.training

object Arrays {

  def findKcomplementary(input: Array[Int], k: Int): List[(Int, Int)] = {

    if (input == null || input.isEmpty )
      return List.empty

    val sortInput = input.sortWith(_ < _)

    var i = 0
    var j = sortInput.length - 1

    var result = List[(Int,Int)]()

    do {
      val sum = sortInput(i) + sortInput(j)
      if (sum == k) {
        result = result :+ Tuple2(sortInput(i), sortInput(j))
        i += 1
        j -= 1
      } else if (sum < k)
        i += 1
      else {
        j -= 1
      }

    } while (i < j)

    result
  }

}
