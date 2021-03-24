fun main() {
    var mercy=Human("mercy",21,58)
    mercy.eat(4)
    mercy.speak("she loves me")
    mercy.birthday()
    mercy.age

 var najua=User("najua","mike","najuamike@gmail.com","0712345678","wangari")
  println(najua.firstname)
   println(najua.email)


}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("i am eating 4kgs of food")}
        fun add(weight:Int){
            println(4)
        }

        fun speak(speech:String){
            println(speech)
        }
        fun birthday(){
            age=age+1
            println(age)
        }



    }


data class User(var firstname:String,var lastname:String,var email:String,var phoneNo:String,var password:String)


