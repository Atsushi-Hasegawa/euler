package sample
import java.util._

object Problem3 {

	def main(arvs : Array[String]) = {

		var target : Long = 600851475143L
		var list = new ArrayList[Int]
		list = clcurate(target, list)
		show(list)
	}
	def clcurate(data : Long, list : ArrayList[Int]) : ArrayList[Int] = {

		var mod : Int = 2
		var data1 = data
		while (data1 != 1) {
			if (data1 % mod == 0) {
				data1 /= mod
				list.add(mod)
				mod = 2
			} else {
				mod += 1
			}
		}
		return list
	}
	def show(data : ArrayList[Int]) = {
		println(data)
	}

}