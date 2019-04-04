package me.javigs82.training

object Arrays {

  def findKcomplementary(input: Array[Int], k: Int): List[(Int, Int)] = {

    if (input == null || input.isEmpty )
      return List.empty

    //val sortInput = input.sortWith(_ < _)
    //quickSorts is faster
    scala.util.Sorting.quickSort (input)

    var i = 0
    var j = input.length - 1

    var result = List[(Int,Int)]()

    do {
      val sum = input(i) + input(j)
      if (sum == k) {
        result = result :+ Tuple2(input(i), input(j))
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
