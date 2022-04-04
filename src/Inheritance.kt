fun main(){
    var student = Student("Jeff Mtoto",9,"20693432","30kgs")
    student.nationality("Rwanda")
    var politician =Politician("Giza totoro",47,"07865435","103kgs")
    politician.studies()


}
open class Student(var fullname:String,var age:Int,var phonenumber:String,var weight:String){

    open fun studies(){
        println("Iam an upcoming programmer")
    }
    fun nationality(citizen:String){
        var country = "KENYA"
        if (citizen==country){
        println("This is a citizen")
    }
        else{
           println("This is not our citizen!")
        }
}
    }
class Politician(fullname: String,age: Int,phonenumber: String,weight: String):Student(fullname,age,phonenumber,weight){
    override fun studies() {
        println("If i win,I will clear all the bushes")
    }
}