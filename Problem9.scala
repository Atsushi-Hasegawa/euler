package sample
import java.math._

object Problem9 {

	def main(args : Array[String]) = {
		val data = Array(1, 1, 1)
		println(recursive(data))
	}
	def recursive(list : Array[Int]) : Int = {
		if (list(0) + list(1) + list(2) == 1000) {
			return (list(0) * list(1) * list(2))
		}
		var test = Math.pow(list(0), 2) + Math.pow(list(1), 2)
		if (Math.sqrt(test) % Math.ceil(Math.sqrt(test)) == 0
			|| Math.sqrt(test) % Math.floor(Math.sqrt(test)) == 0) {
			list(2) = Math.sqrt(test).toInt
		}
		if (list(0) % 3 != 0) {
			list(0) += 1
		} else if (list(1) % 4 != 0) {
			list(1) += 1
		} else {
			list(0) += 1
			list(1) += 1
		}
		return recursive(list)
	}
}