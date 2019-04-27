package i_introduction._4_Lambdas

class KotlinCode4 {

    fun task4(collection: Collection<Int>) : Boolean {
        return collection.any { elem -> elem % 2 == 0 }
    }

}
