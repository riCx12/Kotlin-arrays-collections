package one.digitalinnovation.collections

fun main() {
    val joao = Funcionario ( "Joao", 2000.0, "CLT")
    val pedro = Funcionario ( "Pedro", 1500.0, "CLT")
    val maria = Funcionario ( "Maria", 4000.0, "PJ")

    val repositorio = Repositorio<Funcionario>()
    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(pedro.nome, pedro)

    println(repositorio.findById(joao.nome))

    println("-----------------")

    repositorio.findAll().forEach{ println(it)}

    repositorio.remove(joao.nome)
    repositorio.findAll().forEach { println(it) }

}