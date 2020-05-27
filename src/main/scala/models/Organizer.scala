package models

case class Organizer(tasks: Vector[Task]) {

  def add(task: Task) = Organizer(tasks :+ task)

  def uncompleted = tasks match {
    case Vector() => this
    case _ => Organizer(tasks.filter(_.completed == false))
  }

  def toggle(n: Int) = Organizer(tasks.updated(n, tasks(n).toggle))

  def print = for (task <- tasks) println(task)
}
