package sample

import java.util._

object Problem4 {

	def main(arvs : Array[String]) = {

		val x : Int = 100
		val y : Int = 100
		var list = new ArrayList[Int]()
		list = clcurate(list, x, y)
		show(list)
	}

	def clcurate(list : ArrayList[Int], x : Int, y : Int) : ArrayList[Int] = {

		var num = 0
		var temp = 0
		for (i ← 0 until x) {
			for (j ← 0 until y) {
				num = i * j
				temp = num.toString.reverse.toInt
			}
			if (num == temp) {
				list.add(temp)
			}
		}
		return list
	}

	def show(list : ArrayList[Int]) = {

		for (i ← 0 until list.size()) {
			println(list.get(i))
		}
	}
}
