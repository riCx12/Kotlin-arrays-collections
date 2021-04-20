package one.digitalinnovation.collections

fun main(){
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Joao"
    nomes[2] = "Jose"

    for (nome in nomes){
        println(nome)
    }
    nomes.sort()
    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "Jose", "Pedro")
    nomes2.sort()
    nomes2.forEach { println(it) }

}



