package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ( "Joao", 2000.0, "CLT")
    val pedro = Funcionario ( "Pedro", 1500.0, "CLT")
    val maria = Funcionario ( "Maria", 4000.0, "PJ")

    val funcionarios = listOf(joao, pedro, maria)
    funcionarios.forEach { println(it) }
    println(funcionarios.find{it.nome == "Maria"})

    println("-------------------")
    funcionarios.groupBy{ it.tipo}.forEach { println(it) }
}

