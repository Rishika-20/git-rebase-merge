package basics
    fun main() {

        // Immutable variables.
        val message = " Rishika"
        print(message)
        
        // hence it is showing error coz, val is immutable once defined cann't be changed.
        //  message = "Riya"        
        
        // Mutable variables.        
        var message1 = "  Hello Kotlin"
        println(message1)   // It will print "Hello Kotlin" on console.

        message1 = "have fun"
        println(message1)  // It will print "have fun" on console.

    }
