package sample
import java.util._

class Problem1 {

	def main(args : Array[String]) : Unit = {
		val list = new ArrayList[Int]()
		val max = 1000
		list.add(1)
		list.add(2)
		for (i : Int ← 0 until max) {
			var sum : Int = clcurate(list.get(i), list.get(i + 1))
			list.add(sum)
		}
		show(list, max)
	}
	def clcurate(pre_data : Int, next_data : Int) : Int = {
		val sum : Int = pre_data + next_data
		return sum
	}
	def show(data : ArrayList[Int], max : Int) = {

		for (i : Int ← 0 until max) {
			println(data.get(i))
		}
	}

}