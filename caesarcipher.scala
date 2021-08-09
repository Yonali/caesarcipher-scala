import scala.io.StdIn;

object caesarcipher{


	def main(args:Array[String]){
		
		val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

		val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

		val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+a.size-key)%a.size)

		val cipher= (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(x=> if (x==' ') x else algo(x,key,a))
		
		
		print("Enter Shift Value :")
		val key=scala.io.StdIn.readInt()

		print("Enter String :")
		val s=scala.io.StdIn.readLine()

		val ct=cipher(E,s,key,alphabet)
				
		val dt=cipher(D,ct,key,alphabet)

		println("Encrypt String : "+ct)
		println("Decrypt String: "+dt)

	}
}

