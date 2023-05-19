fun main() {
    val likes = 1
    val likersString = if (likes % 10 == 1) "человеку" else "людям"
    println("Понравилось $likes $likersString")
}